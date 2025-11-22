package com.thiago;

import com.thiago.model.entities.Department;

public class App {
    public static void main(String[] args) {
        Department dp = new Department(1L, "Thiago");
        System.out.println(dp.toString());

    }
}
