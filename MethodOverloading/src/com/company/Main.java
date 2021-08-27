package com.company;

public class Main {

    public static void main(String[] args) {
       int score =  calculateScore("avyay",500);
        System.out.println("New score is "+ score);
        calculateScore(75);
        calculateScore();
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+ playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No Player and no scores");
        return 0;
    }

    // challange solution

    public static double calcFeetAndInchesToCentimeters(double feet, double inch){
        if (feet >= 0 && inch >= 0 && inch <= 12){
            double centimeters = (30.48d * feet) + (inch * 2.54d);
            return centimeters;
        }
        return -1;
    }
    public static double calcFeetAndInchesToCentimeters(double inch){
        if (inch >= 0){
            double centimeters = 2.54d * inch;
            return centimeters;
        }
        return -1;
    }
}
