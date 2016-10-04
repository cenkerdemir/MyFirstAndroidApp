package com.example;

public class MyLearningJavaClass {

    static String newName = "Cenker Demir";

    //main function
    public static void main(String[] args) {

        String name = "cenker";
        int age = 39;

        if(age >= 21) {
            System.out.println(name + ", you are old enough to drink");
            myFunc();
        }
        else {
            System.out.println(name + ", you are only " + age + " years old.");
        }
    }

    //helper function that helps nothing really, just uses a for loop
    public static void myFunc() {
        //swift does not have this. I miss it :-(
        for (int i = 0; i < 50 ; i++) {
            System.out.println(i+1 + " " + newName);
        }
    }
}
