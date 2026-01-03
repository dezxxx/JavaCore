package com.dezxxx.javacore.Game;

import java.util.Random;
import java.util.Scanner;

public abstract class PlayGameAbstractService implements PlayGame {

    // Массив с названиями вариантов игры
    String [] choices = {"Rock", "Paper","Scissors"};

    int PLAYER_MIN = 0;
    int PLAYER_MAX = 2;

    @Override
    public void playGame(Scanner scanner, Field field) {
        field.incrementPlayerWins();
        Random random = new Random();

        boolean playAgain = true;
        while(playAgain){
            int playerChoice = -1;
            boolean validInput = false;
            while(!validInput){
                // Просим игрока ввести свой выбор
                System.out.print("Enter your choice: ");
                System.out.print("0 - Rock, 1 - Paper, 2 - Scissors: ");
                System.out.println("Your choice: ");

                if (scanner.hasNextInt()){  // проверяем, ввёл ли игрок число
                    playerChoice = scanner.nextInt(); // // считываем число
                    // Проверяем, что число в допустимом диапазоне
                    if (playerChoice >= PLAYER_MIN && playerChoice <= PLAYER_MAX) {
                        validInput = true; // ввод корректный
                    } else { // число вне диапазона
                        System.out.println("Invalid choice. please try again.");
                        System.out.println();
                    }
                } else  {
                    System.out.println("Invalid input. please try again.");  // введено не число
                    scanner.next(); // пропускаем неправильный ввод, чтобы цикл не застрял
                }
            }
            // Генерируем случайный выбор компьютера (0, 1 или 2)
            int computerChoice = random.nextInt(3);

            // Выводим выбор игрока и компьютера
            System.out.println("You chose: " + choices[playerChoice]);
            System.out.println("Computer chose: " + choices[computerChoice]);

            // Определяем победителя по правилам игры
            if (playerChoice == computerChoice) {
                System.out.println("It's a tie!"); // Ничья
                field.incrementTieWins(); // Увеличивать счетчик ничьих
            }  else if ((playerChoice == 0) && (computerChoice == 2) || // Камень беьт ножницы
                    (playerChoice == 1) && (computerChoice == 0) || // Бумага бьет Камень
                    (playerChoice == 2) && (computerChoice == 1))   // Ножницы беьт Бумагу

            {
                System.out.println("You is win ");
                field.incrementPlayerWins(); // Увеличиваем счетчик побед игрока.
            }
            else  {
                System.out.println("Computer wins ");
                field.incrementComputerWins();
            }

            System.out.println("Score -> You: " + field.getPlayerWins() +
                    ", Computer: " + field.getComputerWins() +
                    ", Ties: " + field.getTieWins());

            // Спрашиваем хочет ли игрок сыграть снова
            System.out.println("Play Again? (true/false): )");
            playAgain = scanner.nextBoolean(); //Считываем ответ игрока


        }
    }
}
