// SkiJump.java
// Programmer: Gigi Li
// Course:  CS 212, Mr. John
// Due Date: 2/1/24
// In Class Assignment: 3
// Problem Statement: Determine the score of the ski jumper using calculations
// Data In: hill type, jumper's speed at the end of the ramp
// Data Out: number of points earned
// Credits: https://stackoverflow.com/questions/34681199/change-user-input-to-lowercase,
// https://www.geeksforgeeks.org/java-sqrt-method-examples/, Zybooks 3.9 Equivalence testing ( .equals() )

import java.util.Scanner; //import scanner
import java.lang.Math; //import math
class SkiJump {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //

        //introduction
        System.out.println("This program will calculate the number of points you earned from skiing and tell you whether you made the par.");

        //ask user for inputs
        System.out.println("\nWhat type of hill is your ski jump?");
        String hillType = input.nextLine().toLowerCase();
        System.out.println("\nWhat is your speed at the end of the ramp?");
        double speed = input.nextDouble();

        //normal hill type
        if (hillType.equals("normal")) {
            //calculations
            double airTime = Math.sqrt((2*46)/9.8);
            double distance = speed * airTime;
            double points = 60+(distance - 90)*2;
            System.out.println("\nYou earned " + points + " points.");
            //message regarding whether user made the par or not
            if (points >= 61) {
                System.out.println("Great job for doing better than par!");
            } else if (points < 10) {
                System.out.println("What happened??");
            } else {
                System.out.println("Sorry, you didn't go very far.");
            }
        //large hill type
        } else if (hillType.equals("large")) {
            //calculations
            double airTime = Math.sqrt((2*70)/9.8);
            double distance = speed * airTime;
            double points = 60+(distance - 120)*1.8;
            System.out.println("\nYou earned " + points + " points.");
            //message regarding whether user made the par or not
            if (points >= 61) {
                System.out.println("Great job for doing better than par!");
            } else if (points < 10) {
                System.out.println("What happened??");
            } else {
                System.out.println("Sorry, you didn't go very far.");
            }
        //error input message
        } else {
            System.out.println("\nInvalid hill type. Please try again.");
        }

        System.out.println("\nThank you for using this program.");

    }
}
