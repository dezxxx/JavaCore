package com.dezxxx.javacore.chapter04;
//Продемонстрировать основные арифметические операции.

public class BasicMath {
    public static void main(String[] args) {
        //Арифметические операции над целочисленными значениями
        System.out.println(" Целочисленная арифметика ");

        int a = 1 + 1;
        int b = a * 3;
        int c = b / 4;
        int d = c - 1;
        int e = - d;


        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
        System.out.println(" c = " + c);
        System.out.println(" d = " + d);
        System.out.println(" e = " + e);


        // Арифметические операции над значением типа Double.
        System.out.println("\n Арифметика с плавющей точкой");
        double da, db, dc, dd, de;
        da = 1 + 1;
        db = da * 3;
        dc = db / 4;
        dd = dc - a;
        de = -dd;
        System.out.println(" da = " + da);
        System.out.println(" db = " + db);
        System.out.println(" dc = " + dc);
        System.out.println(" dd = " + dd);
        System.out.println(" de = " + de);

    }
}
// Продемонстрировать применение операции %
class Modules{
    public static void main(String[] args) {
        int x = 42;
        double y = 42.25;

        System.out.println(" x mod 10 " + x % 10);
        System.out.println(" a mod 10 " + y % 10);
    }
}
//Продемонстрировать применение нескольких операций с присвоением
class OpEquals{
    public static void main(String[] args) {
        int a, b, c;
        a = 1;
        b = 2;
        c = 3;
        a += 5;
        b *= 4;
        c += a * b;
        c %= 6;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
    }


    //Продемонстрировать применение операции инкремента ++
class IncDec{
    public static void main(String[] args) {
        int a = 1 ;
        int b = 2;
        int c, d ;
        c = ++b;
        d = a++;
        c++;

        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
        System.out.println(" c = " + c);
        System.out.println(" d = " + d);

    }
    }