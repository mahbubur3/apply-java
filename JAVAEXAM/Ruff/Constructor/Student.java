package JAVAEXAM.Ruff.Constructor;

public class Student {
    String studentName;
    int studentRoll;

    Student(String name, int roll) {
        studentName = name;
        studentRoll = roll;
    }

    public static void main(String[] args) {
        Student my = new Student("mahbub", 163895);
        System.out.println(my.studentName);
        System.out.println(my.studentRoll);
    }
}
