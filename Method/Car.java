package Method;

public class Car {
    String Brand, Model;
    int Year;

    void info() {
        System.out.println(Brand);
        System.out.println(Model);
        System.out.println(Year);
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.Brand = "Audi";
        myCar.Model = "A6";
        myCar.Year = 2019;
        myCar.info();
    }
}
