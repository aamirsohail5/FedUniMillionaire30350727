package com.example.fedunimillionaire30350727.Models;

import java.util.ArrayList;

//This is a central class that synchronizes activities in all classes in the game
public class GameUtil {

    private static int currentQuiz=0;
    private static int safeMoneyWon=0;
    private static String correctAnswers="AAACDADBBAB";
    private static boolean ishalfChaseActivated=false;

    public static int getCurrentQuiz() {
        return currentQuiz;
    }

    //when a question fragment will be initialized the setter method will be called
    public static void setCurrentQuiz(int icurrentQuiz) {
        currentQuiz = icurrentQuiz;
    }

    public static int getSafeMoneyWon() {
        return safeMoneyWon;
    }

    public static void setSafeMoneyWon(int isafeMoneyWon) {
        safeMoneyWon = isafeMoneyWon;
    }

    public static String getCorrectAnswers() {
        return correctAnswers;
    }

    public static void setCorrectAnswers(String correctAnswers) {
        GameUtil.correctAnswers = correctAnswers;
    }

    public static boolean isIshalfChaseActivated() {
        return ishalfChaseActivated;
    }

    public static void setIshalfChaseActivated(boolean ishalfChaseActivated) {
        GameUtil.ishalfChaseActivated = ishalfChaseActivated;
    }

    //algorithim for half chase in the program
    public static ArrayList<Integer> choosePositionToLeave(Character charac){

        int rand=1 + (int)(Math.random() * ((3- 1) + 1));

        ArrayList<Integer>possibleCandidate=new ArrayList<Integer>();

            switch (charac){
                case 'A':

                    possibleCandidate.add(2);
                    possibleCandidate.add(3);
                    possibleCandidate.add(4);

                    return possibleCandidate;

                case 'B':
                    possibleCandidate.add(1);
                    possibleCandidate.add(3);
                    possibleCandidate.add(4);
                    return possibleCandidate;

                case 'C':
                    possibleCandidate.add(2);
                    possibleCandidate.add(1);
                    possibleCandidate.add(4);
                    return possibleCandidate;

                case 'D':
                    possibleCandidate.add(2);
                    possibleCandidate.add(3);
                    possibleCandidate.add(1);
                    return possibleCandidate;
                default:
                    return null;
            }
    }
}
