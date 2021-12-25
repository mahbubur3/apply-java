package JAVAEXAM.MethodOverloading;

class Addition {
    static int sum(int a, int b) {
        return a + b;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    public class TestMethodOverloading {
        public static void main(String[] args) {
            System.out.println(Addition.sum(10, 30));
            System.out.println(Addition.sum(5.5, 5.1));
        }
    }
}