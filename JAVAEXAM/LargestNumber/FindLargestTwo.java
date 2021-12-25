package JAVAEXAM.LargestNumber;

import java.util.Scanner;

public class FindLargestTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the age of Jack: ");
        int jack = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the age of Rose: ");
        int rose = input2.nextInt();
        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter the age of Jhon: ");
        int jhon = input3.nextInt();
        if (jack > rose && jack > jhon) {
            System.out.println("Jack is biggest");
        } else if (rose > jack && rose > jhon) {
            System.out.println("Rose is biggest");
        } else {
            System.out.println("Jhon is biggest");
        }
    }
}
