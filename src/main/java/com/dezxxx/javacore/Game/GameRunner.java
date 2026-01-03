package com.dezxxx.javacore.Game;
import java.util.Scanner;


public class GameRunner  implements GameRules {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        GameRunner gameRules = new GameRunner();
        gameRules.printRules();

        Field field = new Field();

        GameLogic gameLogic = new GameLogic();
        gameLogic.playGame(scanner,field );

    }

}



