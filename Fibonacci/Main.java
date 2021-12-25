package Fibonacci;

public class Main {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1, fibo, i;
        System.out.print(num1 + " " + num2);
        for (i = 3; i <= 10; i++) {
            fibo = num1 + num2;
            System.out.print(" " + fibo);
            num1 = num2;
            num2 = fibo;
        }
    }
}
