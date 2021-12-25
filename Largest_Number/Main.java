package Largest_Number;

public class Main {
    public static void main(String[] args) {

        int x = 10, y = 20, z = 40;
        if (x > y && x > z) {
            System.out.println("x is largest");
        } else if (y > x && y > z) {
            System.out.println("y is largest");
        } else {
            System.out.println("z is largest");
        }
    }
}
