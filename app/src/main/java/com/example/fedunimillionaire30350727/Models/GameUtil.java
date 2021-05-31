package com.example.fedunimillionaire30350727.Models;

//This is a central class that synchronizes activities in all classes in the game
public class GameUtil {

    private static int currentQuiz=0;
    private static int safeMoneyWon=0;

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
}
