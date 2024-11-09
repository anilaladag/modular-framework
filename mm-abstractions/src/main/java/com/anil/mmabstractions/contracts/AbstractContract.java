package com.anil.mmabstractions.contracts;

import com.anil.mmabstractions.exceptions.runtime.InvalidOperationException;
import com.anil.mmabstractions.messages.Message;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;
//TODO refactor
public abstract class AbstractContract<T extends Message> implements Contract {
    private final Set<String> required = new HashSet<>();
    private final Class<T> type = (Class<T>) getClass().getGenericSuperclass();

    @Override
    public Class<?> getType() {
        return type;
    }

    @Override
    public Set<String> getRequired() {
        return required;
    }

    protected void require(String propertyName) {
        required.add(propertyName);
    }

    protected void ignore(String propertyName) {
        required.remove(propertyName);
    }

    protected String getName(String propertyName) {
        // Reflection kullanarak property adi ile ilgili bilgi aliyoruz
        try {
            Field field = type.getDeclaredField(propertyName);
            return field.getName();
        } catch (NoSuchFieldException e) {
            throw new InvalidOperationException("Invalid property name: " + propertyName);
        }
    }

    protected void requireAll() {
        requireAll(type, null);
    }

    private void requireAll(Class<?> clazz, String parent) {
        try {
            Object originalContract = clazz.getDeclaredConstructor().newInstance();
            for (Field field : clazz.getDeclaredFields()) {
                String propertyName = parent == null ? field.getName() : parent + "." + field.getName();
                required.add(propertyName);

                // Recursively check for nested classes (only non-primitive and non-interface types)
                if (field.getType().isAssignableFrom(Class.class) && !field.getType().equals(String.class) && !field.getType().isPrimitive()) {
                    requireAll(field.getType(), propertyName);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    protected void ignoreAll() {
        required.clear();
    }
}
