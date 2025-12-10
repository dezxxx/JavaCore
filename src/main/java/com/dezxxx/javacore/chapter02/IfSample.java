package com.dezxxx.javacore.chapter02;

/*
 * Продемонстрировать применение условного оператора if.
 * Присвоить исходному файлу имя "IfSample.java"
 */

public class IfSample {
    public static void main(String[] args) {
        int x, y;

        x = 10;
        y = 20;

        if (x < y) System.out.println("x меньше y");

        x = x * 2;
        if (x == y) System.out.println("x теперь равно y");

        x = x * 2;
        if (x > y) System.out.println("x теперь больше y");

        // этот оператор не будет ничего выводить
        if (x == y) System.out.println("вы не увидите этого");
    }
}

class if_prac   {
    public static void main(String[] args) {
        System.out.println("Если");
        int x, y, z;
        x = 20;
        y = 40;
        z = 60;
        if (x > y)
        {
            System.out.println("x > y");
            System.out.println("Hello");
        }
        if (x < z)
        System.out.println("60");
        if (x > 10) System.out.println("x < 10");
        if (y > 10) System.out.println("40 " + x);
        x = x * 2;
        if (x == y) System.out.println("Its Work " + x);
    }
}

class forin {
    public static void main(String[] args) {

        int x, y;
        x = 0;
        y = 1;
        if (x < y)

            System.out.println("Оба выполняются");
        }
    }


