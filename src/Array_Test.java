import java.util.ArrayList;

public class Array_Test {
public static void main(String[] args) {
    int mouth_days[]; // Одномерный масив
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