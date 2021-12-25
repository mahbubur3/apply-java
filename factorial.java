public class factorial {
    public static void main(String[] args) {
        int i, fact = 1, num = 5;
        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}

// public class factorial {

// public static void main(String[] args) {

// int i, fact = 1, num = 10;

// for (i = 1; i <= num; i++) {
// fact = fact * i;
// }
// System.out.println(fact);
// }
// }

// import java.util.Scanner;

// public class factorial {

// public static void main(String[] args) {

// Scanner input = new Scanner(System.in);

// System.out.print("Enter a number: ");
// int num = input.nextInt();

// int i, fact = 1;

// for (i = 1; i <= num; i++) {
// fact = fact * i;
// }
// System.out.println(fact);
// }
// }