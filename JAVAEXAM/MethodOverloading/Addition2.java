package JAVAEXAM.MethodOverloading;

class Addition2 {
    static int sum(int a, int b) {
        return a + b;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    public class TestMethodOverloading {
        public static void main(String[] args) {
            System.out.println(Addition.sum(30, 50));
            System.out.println(Addition.sum(10.4, 10.3));
        }
    }
}
