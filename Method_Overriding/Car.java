package Method_Overriding;

class Car {
    void drive() {
        System.out.println("car is running..");
    }
}

class Bus {
    void drive() {
        System.out.println("bus is running..");
    }

    public static void main(String[] args) {
        Bus obj = new Bus();
        obj.drive();
    }
}