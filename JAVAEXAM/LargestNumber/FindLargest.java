package JAVAEXAM.LargestNumber;

public class FindLargest {
    public static void main(String[] args) {
        int a = 1000, b = 200, c = 150;
        if (a > b && a > c) {
            System.out.println("a is largest number");
        } else if (b > a && b > c) {
            System.out.println("b is largest number");
        } else {
            System.out.println("c is largest number");
        }
    }
}
