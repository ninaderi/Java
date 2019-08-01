package com.nilou;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Folk", 397);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeters(6, 0);
        calcFeetAndInchesToCentimeters(100);

    }
    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {

        if((feet < 0) ||((inches < 0)) || ((inches > 12))) {
            System.out.println("Invalid feet or inches entered");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + "feet," + inches + "inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {
        if(inches < 0) {
            return -1;
        }

        double feet = (int) inches /12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches);
        return calcFeetAndInchesToCentimeters(feet, remainingInches);

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0; //We can't return anything because we have no parameters
    }
}