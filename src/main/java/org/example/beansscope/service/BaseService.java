package org.example.beansscope.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class BaseService implements CommandLineRunner {

    @Autowired
    private AccountServicePrototype accountServicePrototype;

    @Autowired
    private AccountServiceSingleton accountServiceSingleton;


    @Override
    public void run(String... args) throws Exception {
        System.out.println("------ Prototype -------");
        accountServicePrototype.setName("Bax");
        System.out.println(accountServicePrototype.getName());


        System.out.println("------ Singleton -------");
        accountServiceSingleton.setName("Bax");
        System.out.println(accountServiceSingleton.getName());
    }
}
