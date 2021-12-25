// Java program using Implement threads

package Implementthread;

class Phone implements Runnable {
    public void run() {
        System.out.println("Galaxy S8+");
    }
}

class Laptop implements Runnable {
    public void run() {
        System.out.println("XPS 15");
    }
}

class Test_Implements {
    public static void main(String[] args) {
        Phone myPhone = new Phone();
        Thread th1 = new Thread(myPhone);
        Laptop myLaptop = new Laptop();
        Thread th2 = new Thread(myLaptop);
        th1.start();
        th2.start();
    }
}