package Inheritance;

// public class Student {
//     String name;
//     int roll;

//     void data1() {
//         System.out.println("Name: " + name);
//         System.out.println("Roll: " + roll);
//     }

//     public class Teacher extends Student {
//         String 
//     }
// }

class Student {
    float salary = 40000;
}

class Programmer extends Student {
    int bonus = 10000;

    public static void main(String args[]) {
        Programmer p = new Programmer();
        System.out.println("Programmer salary is:" + p.salary);
        System.out.println("Bonus of Programmer is:" + p.bonus);
    }
}