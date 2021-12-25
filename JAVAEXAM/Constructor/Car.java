package JAVAEXAM.Constructor;

public class Car {
    String brandName, modelName;

    Car(String brand, String model) {
        brandName = brand;
        modelName = model;
    }

    public static void main(String[] args) {
        Car myCar = new Car("Honda", "Civic");
        System.out.println(myCar.brandName);
        System.out.println(myCar.modelName);
    }
}
