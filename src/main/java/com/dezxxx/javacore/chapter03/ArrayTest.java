package com.dezxxx.javacore.chapter03;

//Продемонстрировать применение одномерного массива.

public class ArrayTest {
public static void main(String[] args) {
    int[] mouth_days; // Одномерный масив
    mouth_days = new int[12];
    mouth_days[0] = 31;
    mouth_days[1] = 28;
    mouth_days[2] = 31;
    mouth_days[3] = 30;
    mouth_days[4] = 31;
    mouth_days[5] = 30;
    mouth_days[6] = 31;
    mouth_days[7] = 31;
    mouth_days[8] = 30;
    mouth_days[9] = 31;
    mouth_days[10] = 30;
    mouth_days[11] = 31;

System.out.println(" В апреле " +  mouth_days[3] + " Дней ");
AutoArray.main(args);
Average.main(args);
CascadeArray.main(args);
TwoDAgain.main(args);
TwoDArray.main(args);
    }
}

class AutoArray { // Второй способ записи одномерного масива
    public static void main(String[] args) {
        // массив количества дней в каждом месяце (январь → декабрь)
        int month_days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // вывод количества дней в апреле (четвёртый месяц, индекс 3)
        System.out.println("В апреле " + month_days[3] + " дней.");
    }
}


//Вычисление среднего из массива значений

class Average {
    public static void main(String[] args) {
        // массив чисел
        double nums[] = { 10.1, 11.2, 12.3, 13.4, 14.5 };
        double result = 0; // сумма чисел
        int i;

        // цикл для суммирования элементов массива
        for (i = 0; i < 5; i++) {
            result = result + nums[i];
        }

        // вычисление и вывод среднего значения
        System.out.println("Среднее значение равно " + (result / 5));
    }
}

//Продемонстрировать применение двухмерного массива
class TwoDArray{
    public static void main(String[] args) {
        int TwoD [][] = new int[4][5];
                int i, j, k = 0;
        for (i = 0; i < 4; i++)
            for (j = 0; j < 5; j++) {
            TwoD[i][j] = k;
            k++;}
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++)
                System.out.print(TwoD[i][j] + " ");
            System.out.println();
        }
    }
}

 class CascadeArray {
    public static void main(String[] args) {
        int[][] array = new int[5][4]; // массив 5 строк × 4 столбца
        int k = 7;

        // Заполнение массива по формуле
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = k * 2 - i;
                k += 4;
            }
        }

        // Вывод массива в виде таблицы
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%4d", array[i][j]); // %4d чтобы красиво выровнять столбцы
            }
            System.out.println(); // переход на новую строку после каждого i
        }
    }
}
// Резервирование памяти вручную для массива с разной
// размерностью второго измерения
class TwoDAgain {
    public static void main(String[] args) {
        int TwoD[][] = new int[4][];
        TwoD[0] = new int[1];
        TwoD[1] = new int[2];
        TwoD[2] = new int[3];
        TwoD[3] = new int[4];
        int i, j, k = 0;
        for (i = 0; i < 4; i++)
            for (j = 0; j<i + 1; j++) {
                TwoD[i][j] = k;
                k++;
            }
        for (i = 0; i < 4; i++){
                    for (j = 0; j < i + 1; j++)
                        System.out.print(TwoD[i][j] + " ");
                    System.out.println();
                }
    }
}

//Инициализировать двухмерный масив
class Matrix {
    public static void main(String[] args) {
        double m  [][] = {
                {0 * 0, 0 * 1, 0 * 2, 0 * 3},
                {0 * 1, 1 * 1, 2 * 2, 3 * 3},
                {0 * 2, 1 * 2, 2 * 2, 3 * 2},
                {0 * 3, 1 * 3, 2 * 3,  3 * 3}
        };
        int i, j;
        for (i = 0; i < 4; i++){
            for (j = 0; j < 4; j++)
                System.out.print(m [i][j] + " ");
            System.out.println();
        }
    }
}
//Продемонстрировать применение 3х мерного масива
class Matrix3D {
    public static void main(String[] args) {
        int threeD [][][] = new int[3][4][5];
        int i, j, k;
         for (i = 0; i < 3; i++)
             for (j = 0; j < 4; j++)
                 for (k = 0; k < 5; k++)
                     threeD[i][j][k] = i * j * k;

         for (i = 0; i < 3; i++) {
             for (j = 0; j < 4; j++) {
                 for (k = 0; k < 5; k++)
                     System.out.print(threeD[i][j][k] + " ");
                 System.out.println();
             }
             System.out.println();
         }

    }
}