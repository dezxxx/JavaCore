public class Final_Test {

        public static void main(String[] args) {
            final int i;
            i = 20;
            //i = 30 // Ошибка менять значение переменной нельзя
            System.out.println(i);
        }
    }


class A {
    final void m1() {
        System.out.println("Final method");
    }
}

class B extends A {
    //void m1() { } // compile-time error
}