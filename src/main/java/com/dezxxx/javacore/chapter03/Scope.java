package com.dezxxx.javacore.chapter03;
//Продемонстрировать область действия блока кода.

public class Scope {
    public static void main(String[] args) {
        int u; // эта переменная доступна всему коду из метода main()
        u = 10;

        if (u == 10) { //начало новой области дей ствия ,
            int у = 20; //доступной только этому блоку кода
            //обе переменные х и у доступны вэтой области действия
            System.out.println(" x и у : " + u + " " + у);
            u = у * 2;
        }

        // у = 1 0 0 ; / / ОШИБКА ! переменная у недоступна
        // в этой области действия , тогда как
        //переменная u доступна и эдесь
        System.out.println ( " u равно " + u) ;


    }

}
// Этот фрагмент кода написан не верно !
// couпt = 1 0 0 ;
        // Переменную count нельзя использовать до ее объявления !
// int count ;


// Продемонстрировать срок действия переменной.

class LifeTime {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 3; x++) {
            int y = -1; // Переменная y инициируется при каждом вхождении в блок кода.
            System.out.println("y ровно " + y); // здесь всегда
                                                // выводится значение -1
            y = 100;
            System.out.println(+ y);
        }
    }
}

// Скомпилировать эту программу нельзя

/* class ScopeErr {
    public static void main(String[] args) {
        int bar = 1;  // переменная bar создана

        int bar = 2;  // ❌ Ошибка компиляции!
        // причина: переменная bar уже определена в этой области действия (main)
    }
}
*/


// Продемонстрировать приведение типов.

class Conversion {
    public static void main(String[] args) {

        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\nПреобразование типа int в тип byte.");
        b = (byte) i; // явное приведение
        System.out.println("i и b: " + i + " " + b);

        System.out.println("\nПреобразование типа double в тип int.");
        i = (int) d; // дробная часть будет отброшена
        System.out.println("d и i: " + d + " " + i);

        System.out.println("\nПреобразование типа double в тип byte.");
        b = (byte) d; // превращается в остаток по модулю 256
        System.out.println("d и b: " + d + " " + b);
    }
}

class Promote {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;

        // автоматическое приведение типов (promotion)
        double result = (f * b) + (i / c) - (d * s);

        // вывод частей выражения
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result = " + result);
        System.out.println((2+2*5) + (25+50*3)+ result);
    }
}
