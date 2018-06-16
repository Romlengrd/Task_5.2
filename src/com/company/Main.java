package com.company;

public class Main <T>{

    public static void main(String[] args) {
        Prop p = new Prop();
        p.getFile();
        try {
            p.getProps();
        } catch (NoSuchFieldException e) {
            System.out.println("Не найден ключ");
        }

    }
}
