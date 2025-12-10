package com.dezxxx.javacore.chapter02;

public class example2 {
    public static void main(String[] args) {
        int num;  // в этой строке кода обявляется переменная num
        //  In this line of code the variables num is declared
num = 100; // В этой строке кода присваеваться значение переменной
        //  In this line of code assigning value variable
System.out.println("This variable - это переменная num:" + num );
 num = num * 2;
 System.out.println("значение переменной num * 2 =" +num);
 System.out.println(num);
 new_class.main(args); // вызов другого класса//
        pro_ga.main(args);
        }
}
class new_class{
    public static void main(String[] args) {
        int num; // В Java определен целый ряд типов данных, в том числе
        //целочисленный, символьный и числовой с плавающей точкой. int в нашем случае обозназает
        // целочисленный
        //In Java, a whole range of data types is defined,
        // including integer, character, and floating-point numeric types.
        num = 300;
        num = num +50;
        num = num * 2;
        num = num +40+20*3;
        System.out.println("*3");
        System.out.println(num + " units");

    }
}

class pro_ga{
    public static void main(String[] args) {
        int num;
        num = 555;
        num = num +300;
        num = num *400;
        System.out.println(num + " units");
    }
}
