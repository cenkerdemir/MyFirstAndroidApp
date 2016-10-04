package com.example;

public class MyLearningJavaClass {

    static private String newName = "A crying moose";

    //main function
    public static void main(String[] args) {
        String name = "cenker";
        int age = 19;
        //double pi = 3.14;
        //boolean iAmCool = true;
       // String[] names = new String[]{"cenker", "helen", "new york", "new jersey"};
        //double[] myDoubles = new double[]{2.1, 3.2, 5.4365};
        int[] numbers = new int[]{3, 4, 5, 34, 76, 456, 2, 7, 4, 6, 5, 3};
        int totalNumbers = 0;

        if (numbers.length >= 10) {
            System.out.println("BIG! Numbers array has more than 10 elements");
        }
        else {
            System.out.println("numbers array has less than 10 elements");
        }

        if(age >= 21) {
            System.out.println(name + ", you are old enough to drink");
            myFunc();
        }
        else {
            System.out.println(name + ", you are only " + age + " years old.");
        }

        //add the elements of numbers array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            totalNumbers += numbers[i];
        }
        System.out.println("total number is: " + totalNumbers);

        System.out.println(fullName("Cenker", "Demir"));

        //Classes
        Dog myPup = new Dog();
        myPup.name = "Fido";
        myPup.age = 5;
        myPup.furColor = "Brown";

        Dog anotherPup = new Dog();
        anotherPup.name = "Haley";
        anotherPup.age = 13;
        anotherPup.furColor = "White";

        myPup.tellMeAboutTheDog();
        anotherPup.tellMeAboutTheDog();

        Poodle myPoodle = new Poodle();
        myPoodle.name = "frigging thing";
        myPoodle.age = 23;
        myPoodle.curlyFactor = 0.3;

        System.out.println(myPoodle.curlyFactor);

        //a new chair object
        Chair myChair = new Chair();
        myChair.shape = "classic";
        myChair.color = "light brown";
        myChair.heightInFeet = 4;

        myChair.chairDescription();
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

    //function to return full name if the first and last name were given
    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}

//new class
class Dog {
    String name = "";
    int age = 0;
    String furColor = "";

    void tellMeAboutTheDog() {
        System.out.println("The dog's name is " + name + ". It is " + age + " years old " + "and its fur color is " + furColor);
    }
}

// extending the Dog class
class Poodle extends Dog {
    double curlyFactor = 0.0;
}

//a new class
class Chair {
    String shape = "";
    String color = "";
    int heightInFeet = 3;

    void chairDescription() {
        System.out.println("The chair's shape is " + shape + ", its color is " + color + ", and its height is " + heightInFeet + " feet.");
    }
}