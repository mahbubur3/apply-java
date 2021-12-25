package Overloading;

class Addition {
    static int sum(int a, int b) {
        return a + b;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    public class TestOverloading {
        public static void main(String[] args) {
            System.out.println(Addition.sum(20, 30));
            System.out.println(Addition.sum(10.5, 5.1));
        }
    }
}
