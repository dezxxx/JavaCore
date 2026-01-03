package com.dezxxx.javacore.Game;

public interface GameRules {
    default  void printRules() {
        System.out.println("Welcome to game Rock, Paper, Scissors! ");
        System.out.println("Rules very easy!");
        System.out.println("Rock beats Scissors!");
        System.out.println("Scissors beats Paper!");
        System.out.println("Paper beats Rock!");
        System.out.println("Same choice means a drow.");
        System.out.println();
    }
}

