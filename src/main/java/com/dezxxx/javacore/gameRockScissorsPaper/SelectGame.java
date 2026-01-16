package com.dezxxx.javacore.gameRockScissorsPaper;

import java.util.Scanner;

public class SelectGame implements ShowMenu {
Scanner scanner = new Scanner(System.in);

    private static final String[] MENU_ITEMS = {
            "Player vs PC",
            "Player vs Player",
            "PC vs PC",
            "Exit"
    };



    @Override
    public void showMenu() {
        enterPassword();
        boolean running = true;

        while (running) {
            printMenu();
            int choice = getUserSelect(scanner);

            if (choice == MENU_ITEMS.length - 1) { // последний пункт - Exit
                System.out.println("Exiting menu...");
                running = false; // выходим из цикла
            } else {
                startSelectedGame(choice); // запускаем выбранную игру
            }
        }
    }

    private void enterPassword(){
        while(true){
            System.out.println("Enter your password for Game ROCK, SCISSORS, PAPER: ");

            String password = scanner.nextLine();

            if (password.equals("qwerty123")) {
                System.out.println("Access granted");
                break;
            }else {
                System.out.println("Wrong password try again");
            }

        }
    }

    private void printMenu() {
        System.out.println("\n--- Main Menu ---");
        for (int i = 0; i < MENU_ITEMS.length; i++) {
            System.out.println((i + 1) + ". " + MENU_ITEMS[i]);
        }
    }

    private int getUserSelect(Scanner scanner) {
        int choice = -1;
        boolean valid = false;

        while(!valid){
            System.out.println("Please Select the Game: ");

            if(scanner.hasNextInt()){
                choice = scanner.nextInt();
                if(choice >= 1 && choice <= MENU_ITEMS.length){
                    valid = true;
                } else{
                    System.out.println("Invalid choice please try again.");
                }
            }else {
                System.out.println("Invalid input enter a number.");
                scanner.next();
            }
        } return choice -1;
    }

    private void startSelectedGame(int choice) {
        switch (choice){
            case 0: GameLogicPlayerVsPC gameLogicPlayerVsPC = new GameLogicPlayerVsPC();
            gameLogicPlayerVsPC.startGame();
            break;

            case 1: GameLogicPlayerVsPlayer  gameLogicPlayerVsPlayer = new GameLogicPlayerVsPlayer();
            gameLogicPlayerVsPlayer.startGame();
            break;

            case 3: GameLogicPcVsPC gameLogicPcVsPC = new GameLogicPcVsPC();
            gameLogicPcVsPC.startGame();
            break;

            default: System.out.println("Invalid choice please try again.");
        }


    }

}
