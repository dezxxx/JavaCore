package for_if_practice;

public class for_test {
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