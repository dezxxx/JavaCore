package com.dezxxx.javacore.Game;

public class Field {
// Должен хранить только поля и доступ к ним
    private int playerWins;
    private int computerWins;
    private int tieWins;

    private int playerChoice;
    private int computerChoice;

    // Методы для счётчиков
    public void incrementPlayerWins() { playerWins++; }
    public void incrementComputerWins() { computerWins++; }
    public void incrementTieWins() { tieWins++; }

    public int getPlayerWins() { return playerWins; }
    public int getComputerWins() { return computerWins; }
    public int getTieWins() { return tieWins; }

    // Методы для выбора игрока и компьютера
    public void setPlayerChoice(int choice) { playerChoice = choice; }
    public int getPlayerChoice() { return playerChoice; }

    public void setComputerChoice(int choice) { computerChoice = choice; }
    public int getComputerChoice() { return computerChoice; }
}
