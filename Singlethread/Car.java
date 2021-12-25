package Singlethread;

class Car extends Thread {
    public void run() {
        System.out.println("Audi A6");
    }
}

class Test_Threads {
    public static void main(String[] args) {
        Car Th = new Car();
        Th.start();
    }
}
