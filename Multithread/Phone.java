package Multithread;

class Phone extends Thread {
    public void run() {
        System.out.println("Apple iPhone 7");
    }
}

class Laptop extends Thread {
    public void run() {
        System.out.println("Dell XPS 15");
    }
}

class Test_Mutithread {
    public static void main(String[] args) {
        Phone Th1 = new Phone();
        Laptop Th2 = new Laptop();
        Th1.start();
        System.out.println("staring phone thread");
        Th2.start();
        System.out.println("staring laptop thread");
    }
}
