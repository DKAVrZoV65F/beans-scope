package org.example.beansscope.service;

import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
@Getter
public class AccountServiceSingleton {

    private String name = "Lori";

    public void setName(String name) {
        this.name = name + " ---- " + name;
    }
}