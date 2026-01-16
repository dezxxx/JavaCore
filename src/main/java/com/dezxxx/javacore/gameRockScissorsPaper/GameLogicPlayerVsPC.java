package com.dezxxx.javacore.gameRockScissorsPaper;

import java.util.Random;
import java.util.Scanner;

public class GameLogicPlayerVsPC implements GameLogic {

    private final Field field = new Field();
    private final Random random = new Random();
    private final Scanner scanner = new Scanner(System.in);

    private final int PLAYER_MIN = 0;
    private final int PLAYER_MAX = 2;

    private int playerWins;
    private int computerWins;
    private int tieWins;
    private int totalGames;

    @Override
    public void startGame() {
        printRules();
        boolean playAgain;
        do {

            playTotalsRounds(10);
            playAgain = askPlayAgain();
        } while (playAgain);

        System.out.println("Returning to menu...");
    }

    private void printRules() {
        System.out.println("Welcome to game <----ROCK, SCISSORS, PAPER----> ");
        System.out.println("Rules are very easy!");
        System.out.println("Rock beats Scissors!");
        System.out.println("Scissors beats Paper!");
        System.out.println("Paper beats Rock!");
        System.out.println("Same choice means a draw.");
        System.out.println();
    }

    private void playOneRound() {

        getPlayerChoice();    // выбор игрока
        getComputerChoice();  // выбор компьютера
        determineWinner();    // определяем победителя
    }

    private void playTotalsRounds(int totalRounds) {

        for (int round = 1; round <= totalRounds; round++) {
            System.out.println("===Round " + (round) + "====");
            playOneRound();
        }
    }

    private void getPlayerChoice() {
        String[] choices = {"ROCK", "SCISSORS", "PAPER"};
        int index = -1;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter your choice (1 - ROCK, 2 - SCISSORS, 3 - PAPER): ");
            if (scanner.hasNextInt()) {
                index = scanner.nextInt() -1;
                if (index >= PLAYER_MIN && index <= PLAYER_MAX) {
                    validInput = true;
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please try again.");
                scanner.next(); // пропускаем неверный ввод
            }
        }

        field.setChoice1(choices[index]);
        System.out.println("Your choice: " + field.getChoice1());
    }

    private void getComputerChoice() {
        String[] choices = {"ROCK", "SCISSORS", "PAPER"};
        int index = random.nextInt(3);
        field.setChoice2(choices[index]);
        System.out.println("Computer choice: " + field.getChoice2());
    }

    private void determineWinner() {
        String player = field.getChoice1();
        String computer = field.getChoice2();

        if (player.equals(computer)) {
            System.out.println("It's a tie!");
            tieWins++;
        } else if (
                (player.equals("ROCK") && computer.equals("SCISSORS")) ||
                        (player.equals("SCISSORS") && computer.equals("PAPER")) ||
                        (player.equals("PAPER") && computer.equals("ROCK"))
        ) {
            System.out.println("Player wins!");
            playerWins++;
        } else {
            System.out.println("Computer wins!");
            computerWins++;
        }

        totalGames++;
        printScore(); // выводим текущий счёт
    }

    private boolean askPlayAgain() {
        boolean validInput = false;
        boolean playAgain = false;

        while (!validInput) {
            System.out.print("Do you want to play again? (0 - NO, 1 - YES): ");

            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                if (input == 0) {
                    playAgain = false;
                    validInput = true;
                } else if (input == 1) {
                    playAgain = true;
                    validInput = true;
                } else {
                    System.out.println("Invalid choice. Please enter 0 or 1.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // пропускаем неверный ввод
            }
        }

        return playAgain;
    }

    private void printScore() {
        System.out.println("Current Score:");
        System.out.println("Player wins: " + playerWins);
        System.out.println("Computer wins: " + computerWins);
        System.out.println("Ties: " + tieWins);
        System.out.println("Total Games: " + totalGames);
        System.out.println();
    }
}
