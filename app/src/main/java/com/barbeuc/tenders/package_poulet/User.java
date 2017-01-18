package com.barbeuc.tenders.package_poulet;

/**
 * Created by adrie on 18/01/2017.
 */

public abstract class User implements Poulet {
    private int age;
    private String name ;

    /* en rajouter */

    public User(int age) {
        this.age = age;
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }
}
