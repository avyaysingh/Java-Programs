package com.company;

public class Main {

    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(0);
        displayHighScorePosition("Avyay",highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score){
        if (score >= 1000)
            return  1;
        else if (score >= 500)
            return 2;
        else if (score >= 100)
            return 3;
        return 4;
    }
}
