package MethodOver;

class Overload {
    static int sum(int a, int b) {
        return a + b;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    public class TestOverloading {
        public static void main(String[] args) {
            System.out.println(Overload.sum(20, 20));
            System.out.println(Overload.sum(10.5, 5.1));
        }
    }
}
