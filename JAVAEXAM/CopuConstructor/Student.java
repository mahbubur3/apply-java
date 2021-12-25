package JAVAEXAM.CopuConstructor;

public class Student {
    String studentName;
    int studentRoll;

    Student() {
        System.out.println("No Information");
    }

    Student(String name, int roll) {
        studentName = name;
        studentRoll = roll;
    }

    public static void main(String[] args) {
        Student x = new Student("Mohiudding Sakib", 163885);
        System.out.println(x.studentName);
        System.out.println(x.studentRoll);

        Student y = new Student("Mahbubur Rahman", 163895);
        System.out.println(y.studentName);
        System.out.println(y.studentRoll);
    }
}
