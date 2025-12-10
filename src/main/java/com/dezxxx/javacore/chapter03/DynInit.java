package com.dezxxx.javacore.chapter03;

public class DynInit {
    public static void main(String[] args) {
            double a, b, c;
            {
                a = 3.4;
                b = 3.6;
                // Динамическая инициализация переменной
                c = Math.sqrt(a * a + b * b);
                System.out.println(" Гипотенуза равна " + c);
            }

        }
    }

