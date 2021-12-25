package Constractor;

public class Student {
    String studentName;
    int studentRoll;

    Student(String name, int roll) {
        studentName = name;
        studentRoll = roll;
    }

    public static void main(String[] args) {
        Student myPhone = new Student("Mahbubur Rahman", 163895);
        System.out.println(myPhone.studentName);
        System.out.println(myPhone.studentRoll);
    }
}
