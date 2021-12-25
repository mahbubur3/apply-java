package JAVAEXAM.Constructor;

public class Phone {
    String brandName;
    String modelName;

    Phone(String brand, String model) {
        brandName = brand;
        modelName = model;
    }

    public static void main(String[] args) {
        Phone myPhone = new Phone("Samsung", "Galaxy S9");
        System.out.println(myPhone.brandName);
        System.out.println(myPhone.modelName);
    }
}
