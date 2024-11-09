package com.anil.mmabstractions.modules;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Collections;
import java.util.List;

public interface Module {
    String getName();

    default List<String> getPolicies() {
        return Collections.emptyList();
    }

    void register(ApplicationContext context);

    void use(AnnotationConfigApplicationContext appContext);
}
