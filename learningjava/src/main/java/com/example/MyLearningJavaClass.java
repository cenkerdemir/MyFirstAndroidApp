package com.example;

public class MyLearningJavaClass {

    static String newName = "Cenker Demir";

    public static void main(String[] args) {

        String name = "cenker";
        int age = 19;

        if(age >= 21) {
            System.out.println(name + ", you are old enough to drink");
            myFunc();
        }
        else {
            System.out.println(name + ", you are only " + age + " years old.");
        }

    }

    public static void myFunc() {

        for (int i = 0; i < 50 ; i++) {
            System.out.println(i+1 + " " + newName);
        }
    }
}
