package com.dezxxx.javacore.chapter04;

//Продемонстрирвоать применение поразрядных логических операций
public class BitLogic {
    public static void main(String[] args) {
    String binary[] = {"0001", "0001", "0010", "0011","0100", "0101", "0110","0111",
                        "1000","1001", "1010", "1011", "1100", "1101", "1110", "1111"};
    int a = 3; // 0+2+1, или 0011 в двоичном представлении
        int b = 6; // 4+2+0 или 0110 в двочном представлении
        int c = a | b;            // OR
        int d = a & b;            // AND
        int e = a ^ b;            //XOR
        int f = (~a & b )|(a& ~b);
        int g = ~a & 0x0f;         // NOT
        System.out.println(" a = " + binary[a]);
        System.out.println(" b = " + binary[b]);
        System.out.println(" a | b = " + binary[c]);
        System.out.println(" a & b  = " + binary[d]);
        System.out.println(" a ^ b  = " + binary[e]);
        System.out.println("~a &b | &a ~b = " + binary[f]);
        System.out.println("~a = " + binary[g]);

    }
}
// Сдвиг влево значение типа byte
class ByteShift{
    public static void main(String[] args) {
        byte a = 64, b;
        int i;
        i = a << 2;
        b = (byte) (a << 2);
        System.out.println("Первоначальное значение а: " + a);
        System.out.println("i and b " + i + " " + b);
    }
}
// Применение сдвигавлево вкачестве быстрого способа умножения на 2
class MultByTwo {
    public static void main(String[] args) {
    int i;
    int num = 0xFFFFFFE;
    for (i = 0; i < 4; i++) {
        num = num << 1;
        System.out.println(num);
     }
    }
}
// Маскирование двоичных разрядов расширения знака
class HexByte{
    public static void main(String[] args) {
        char hex [] = {'0','1','2','3','4','5','6','7',
                       '8','9','a','b','c','d','e','f'};
        byte b= (byte) 0xf1;
        System.out.println("b = 0x" + hex [(b >> 4) & 0x0f ] + hex[b & 0x0f]);
    }
}

//Беззнаковый сдвиг двоичных разрядов значения типа byte
class ByteUShift {
    public static void main(String[] args) {

        char hex [] = {
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };

        byte b = (byte) 0xF1;                 // -15
        byte c = (byte) (b >> 4);             // знаковый сдвиг
        byte d = (byte) (b >>> 4);            // беззнаковый сдвиг (неправильный для byte)
        byte e = (byte) ((b & 0xFF) >> 4);    // правильный способ

        System.out.println("b = 0x"
                + hex[(b >> 4) & 0x0F] + hex[b & 0x0F]);

        System.out.println("b >> 4 = 0x"
                + hex[(c >> 4) & 0x0F] + hex[c & 0x0F]);

        System.out.println("b >>> 4 = 0x"
                + hex[(d >> 4) & 0x0F] + hex[d & 0x0F]);

        System.out.println("(b & 0xFF) >> 4 = 0x"
                + hex[(e >> 4) & 0x0F] + hex[e & 0x0F]);
    }
}
// а = а >> 4 ;
// а > > = 4 ;
/* Равнозначны и следующие две операции , присваивающие переменной а результат
выполнения поразрядной логической операции а ИЛИ Ь: */
// а = а | Ь ;
// а | = Ь ;

class ProBa {
    public static void main(String[] args) {
        int i,b,b1,b2;
         int [][] b3 = {
                 {4, 6, 7, 8, 10},
                 {4, 4, 6, 5, 5}
             };
        i = 5;
        i = ++i;
        b = 10;
        b ++;
        b = ( b >> 2);
        b2 = 50; b= (b2 >> 5);
        b1 = ( b >> 5);
        System.out.println("b = " + b + " b2 = " + b2);
            System.out.println("b >> 5 = " + b + " b2 = " + b2);
        System.out.println(java.util.Arrays.deepToString(b3));
            System.out.println(b2 + " " + b1 + " " + b + " " + i);

    }
}
/* Следующая программа создает несколько целочисленных переменных, а затем
использует составные побитовые операторы с присваиванием для манипулирования
этими переменными:*/

class OpBitEquals {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;
        a |= 4;
        b >>= 1;
        c <<= 1;
        a ^= c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}


