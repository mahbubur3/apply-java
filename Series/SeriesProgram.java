package Series;

import java.util.Scanner;

public class SeriesProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, sum = 0;
        System.out.print("Enter last number: ");
        num = input.nextInt();

        for (int x = 1; x <= num; x++) {
            sum = sum + x;
        }
        System.out.println(sum);
    }
}
