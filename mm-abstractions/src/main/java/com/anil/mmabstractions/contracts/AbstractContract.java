package com.anil.mmabstractions.contracts;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.Set;

public abstract class AbstractContract<T> implements Contract {

    private final Set<String> required = new HashSet<>();
    private final Class<T> type;


    protected AbstractContract(Class<T> type) {
        this.type = type;
    }

    @Override
    public Class<T> getType() {
        return type;
    }

    @Override
    public Set<String> getRequired() {
        return new HashSet<>(required); // Immutable collection for safety
    }

    protected void require(String fieldName) {
        required.add(fieldName);
    }

    protected void ignore(String fieldName) {
        required.remove(fieldName);
    }

    protected void requireAll() {
        requireAll(type, null);
    }

    private void requireAll(Class<?> clazz, String parent) {
        for (Field field : clazz.getDeclaredFields()) {
            if (Modifier.isStatic(field.getModifiers())) {
                continue; // Skip static fields to avoid SonarLint issues
            }

            String fieldName = (parent == null) ? field.getName() : parent + "." + field.getName();
            required.add(fieldName);

            if (!field.getType().isPrimitive() && !field.getType().equals(String.class)) {
                requireAll(field.getType(), fieldName);
            }
        }
    }

    protected void ignoreAll() {
        required.clear();
    }
}
