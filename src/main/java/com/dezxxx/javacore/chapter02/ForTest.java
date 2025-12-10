package com.dezxxx.javacore.chapter02;

/*
 * Продемонстрировать применение цикла for.
 * Присвоить исходному файлу имя "ForTest.java"
 */

public class ForTest {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 10; x = x + 1)
            System.out.println("Значение x: " + x);
    }
}


class For_Test2 {
    public static void main(String[] args) {
        int x, j;
        x = 2;
        System.out.println("10 следущая строка начнется цикл  for " + x);
        for (x = 0; x < 4; x++) {
            System.out.println("x = " + x);

            for (j = 2; j < 30; j= j * 2 )
                System.out.println("j = " + j);


        }
    }
}

/*
 * Продемонстрировать применение блока кода.
 * Присвоить исходному файлу имя "BlockTest.java"
 */

class BlockTest {
    public static void main(String[] args) {
        int x, y;
        y = 20;

        // адресатом этого оператора цикла служит блок кода
        for (x = 0; x < 10; x++) {
            System.out.println("Значение x: " + x);
            System.out.println("Значение y: " + y);
            y = y - 2;
        }
    }
}

class BlockTest1 {
    public static void main(String[] args) {
        int x, y;

        y = 2;
        for (x = 0; x < 5; x++ ){
            System.out.println("enter " + x);
            System.out.println("enter_2 " + y);
            y = y + 22;
            x = x * y;
            System.out.println("x = " + x);
        }
    }
}
