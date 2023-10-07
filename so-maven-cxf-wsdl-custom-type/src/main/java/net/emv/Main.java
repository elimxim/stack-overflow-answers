package net.emv;

import generated.SomeType;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        SomeType someType = new SomeType();
        someType.setSomeDate(LocalDate.now());

        System.out.println(someType.getSomeDate());
    }
}