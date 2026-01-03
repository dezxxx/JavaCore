package com.dezxxx.javacore.Game;

import java.util.Random; // импортируем класс для генерации случайных чисел
import java.util.Scanner; // импортируем класс для чтения ввода с клавиатуры

 public class Exemple  {


     Scanner scanner = new Scanner(System.in); // Создаём сканер для ввода данных с клавиатуры
     Random random = new Random(); // Создаём объект Random для генерации случайного выбора компьютера
     // Random - генератор случайных чисел

     // Массив с названиями вариантов игры
    String [] choices = {"Rock", "Paper","Scissors"};

    // Счётчики побед и ничьих
     int playerWins = 0;  // победа игрока
    int computerWins = 0; // победа компьютера
    int tieWins = 0; // Ничья
     boolean PlayAgain = true; // переменная для повторного запуска игры

     // Метод, который запускает игру
public void playGame(){
    // Главный цикл игры: продолжаем, пока игрок хочет играть
    while (PlayAgain) {
        int playerChoice = -1;
        boolean validInput = false;

        // Цикл для проверки правильного ввода игрока
        while (!validInput) {
            // Просим игрока ввести свой выбор
            System.out.print("Enter your choice: ");
            System.out.print("0 - Rock, 1 - Paper, 2 - Scissors: ");
            System.out.println("Your choice: ");

            if (scanner.hasNextInt()){  // проверяем, ввёл ли игрок число
                playerChoice = scanner.nextInt(); // // считываем число
                // Проверяем, что число в допустимом диапазоне
                if (playerChoice >= 0 && playerChoice <= 2) {
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
            tieWins++; // Увеличивать счетчик ничьих
        }  else if ((playerChoice == 0) && (computerChoice == 2) || // Камень беьт ножницы
                    (playerChoice == 1) && (computerChoice == 0) || // Бумага бьет Камень
                    (playerChoice == 2) && (computerChoice == 1))   // Ножницы беьт Бумагу

        {
            System.out.println("You is win ");
                playerWins++; // Увеличиваем счетчик побед игрока.
        }
        else  {
            System.out.println("Computer wins ");
            computerWins++;
        }
        // Спрашиваем хочет ли игрок сыграть снова
        System.out.println("Play Again? (true/false): )");
        PlayAgain = scanner.nextBoolean(); //Считываем ответ игрока
    }
   }
 }
