// class Threads extends Thread {
//     public void run() {
//         System.out.println("hello");
//     }
// }
// class Mythread {
//     public static void main(String[] args) {
//         Threads x = new Threads();
//         System.out.println("bangladesh");
//         x.start();
//     }
// }

// class student1 extends Thread {
//     public void run() {
//         System.out.println("Hello! Jhon");
//     }
// }
// class student2 extends Thread {
//     public void run() {
//         System.out.println("Hello! Smith");
//     }
// }
// class Test_Threads {
//     public static void main(String[] args) {
//         student1 x = new student1();
//         x.start();
//         student2 y = new student2();
//         y.start();
//     }
// }



class Phone extends Thread {
    public void run() {
        System.out.println("Galaxy S8+");
    }
}
class Laptop extends Thread {
    public void run() {
        System.out.println("Galaxy Book Pro");
    }
}
class Test_Multithreads {
    public static void main(String[] args) {
        Phone th1 = new Phone();
        Laptop th2 = new Laptop();
        th1.start();
        th2.start();
    }
}