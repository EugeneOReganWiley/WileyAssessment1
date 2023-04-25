package com.company;

import java.util.Locale;

public class Main {


    /**
     * Method to print the message
     */
    public static void printMsg() {
        System.out.println("Pay Tax");
        System.out.println("PAY YER TAXES");
    }


    public static void main(String[] args) {
        System.out.println("Hello World");
        double partTimeWages = 100; // Declaring and Initializing an integer (whole number) Variable
        int fullTimeWages = 370;
        double divided = partTimeWages / fullTimeWages;
        System.out.println(divided);
        double totalWages = partTimeWages + fullTimeWages; // Total Wages Calculation
        System.out.println(totalWages);
        // 8 Primitive Datatypes ... 6 Numeric - 4 Whole Number (bit, short, int, long) 2
        // decimal (float, double) 1 char, 1 boolean
        /**
         * if Statement for decision making
         */
       /* if (fullTimeWages > 350) // Test in ()
        {  //If test is true, run whatever is in {}'s
            for(int i = 0; i < 10; i++) {
                printMsg();
            }
        } else if (fullTimeWages <= 350) {
            System.out.println("Don't Pay Tax");
            System.out.println("====");
        }
        System.out.println(Boba.valueX);
        Boba.printOut();
        Boba abc = new Boba();
        System.out.println(abc.valueY);*/
        String name = "Aoin"; //String object ... Stores and has FUNCTIONALITY!!!!!!!!!!!
        char firstLetter = name.toLowerCase().charAt(0);
        System.out.println(firstLetter);
        switch (firstLetter) {
            case 'a':
            default:
                System.out.println("It's not a vowel");

            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("It's a vowel " + firstLetter);
                //    break;

        }
        boolean isItThere = true;
    }// End of main



}
