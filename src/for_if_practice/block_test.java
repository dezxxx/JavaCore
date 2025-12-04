package for_if_practice;

public class block_test {
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
