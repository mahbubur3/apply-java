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


/* 
class Bike {
    void drive() {
        System.out.println("Bike..");
    }

    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.drive();
    }
}
*/
