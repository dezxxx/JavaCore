package com.dezxxx.javacore.chapter03;
// Вычислить расстояние , проходимое светом,
        //используя переменные типа lonq.

public class Light {
    public static void main(String[] args) {
        int light_speed;
        long days;
        long second;
        long distance;
       light_speed = 186000;
       days = 1000;
       second = days * 24 * 60 * 60 ;
       distance = light_speed * second;

       System.out.print("За " +days);
       System.out.println(" Дней свет пройдет около");
       System.out.println(distance + " Миль");
Area.main(args);
Area1.main(args);
Area2.main(args);
Area3.main(args);

    }

}
//Вычислить площадь круга
class Area {
    public static void main(String[] args) {
        double pi, r, a;
        pi = 3.1416;
        r = 10.8;
        a = pi * r * r;
        System.out.println("Площадь круга равна " +a);

    }
}


//Продемонстрировать применение типа данных char

class Area1 {
    public static void main(String[] args) {
        char ch1, ch2;
        ch1 = 88;
        ch2 = 'Y';
        System.out.print("ch1 " + " Ch2 ");
        System.out.println( ch1 + " " + ch2 + " Вывод значений примитивный тип char ");
    }
}


//Символьные переменные ведут себя как целочисленные значения.

class Area2 {
    public static void main(String[] args) {
        char ch1, ch2;
        ch1 = 'X';
        System.out.println( " Ch1 Содержит " + ch1);
        ch1++; // Здесь переменная меняет значение по инкременту увеличивая значение на 1
        System.out.println(" Ch1 Содержит " + ch1);
    }
}

//Продемонстрировать применение значений типа boolean.
class Area3 {
    public static void main(String[] args) {
        boolean b;
        b = true;
        System.out.println(" b равно " + b);
        b = false;
        System.out.println(" b равно " + b);
        // значение типа boolean может управлять оператором if
        if (b)
        System.out.println(" Этот код выполняется ");
        b = false;
        if (b)
            System.out.println(" Этот код не выполняется ");
        // Результат сравнения - значения типа boolean
        System.out.println(" 10 < 9 равно " + (10 < 9 ));
    }
}





