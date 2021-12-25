// public class Fibonacci {

// public static void main(String[] args) {

// int a = 0, b = 1, fibo;

// for (int i = 3; i <= 10; i++) {

// fibo = a + b;
// System.out.print(" " + fibo);
// a = b;
// b = fibo;
// }
// System.out.println();

// }
// }

// public class Fibonacci {

// public static void main(String[] args) {

// int num1 = 0, num2 = 1, count = 10, fibo;
// for (int i = 2; i <= count; i++) {
// fibo = num1 + num2;
// System.out.println(" " + fibo);
// num1 = num2;
// num2 = fibo;
// }
// System.out.println();
// }
// }

public class Fibonacci {

    public static void main(String[] args) {

        int num1 = 0, num2 = 1, fibo, count = 10;
        System.out.print(num1 + " " + num2);

        for (int i = 3; i <= count; i++) {
            fibo = num1 + num2;
            System.out.print(" " + fibo);
            num1 = num2;
            num2 = fibo;
        }
    }
}