package org.example.beansscope.service;

import lombok.Getter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
@Getter
@Scope("prototype")
public class AccountServicePrototype {

    private String name = "Lori";

    public void setName(String name) {
        this.name = name + " ---- " + name;
    }

    @PostConstruct
    public void init() {
        System.out.println("*********** " + getClass().getName() + " *** init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("*********** " + getClass().getName() + " *** destroy method");
    }
}
