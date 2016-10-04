package com.example;

public class MyLearningJavaClass {

    static String newName = "A crying moose";

    //main function
    public static void main(String[] args) {
        String name = "cenker";
        int age = 19;
        double pi = 3.14;
        boolean iAmCool = true;
        String[] names = new String[]{"cenker", "helen", "new york", "new jersey"};

        if(age >= 21) {
            System.out.println(name + ", you are old enough to drink");
            myFunc();
        }
        else {
            System.out.println(name + ", you are only " + age + " years old.");
        }

        //printing out the elements of names array
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }

    //helper function that helps nothing really, just uses a for loop
    public static void myFunc() {
        //swift does not have this. I miss it :-(
        for (int i = 0; i < 50 ; i++) {
            System.out.println(i+1 + " " + newName);
        }

        if (newName == "A laughing Cow") {
            System.out.println("No way!!!");
        }
        else {
            System.out.println("Yes way!!!");
        }
    }


}
