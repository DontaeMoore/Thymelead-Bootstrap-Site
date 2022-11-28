package com.example.thymeleafdemo.Model;

import com.example.thymeleafdemo.DAO.Animal;

public class Cat implements Animal {


    @Override
    public void speak() {
        System.out.println("Meow");
    }
}
