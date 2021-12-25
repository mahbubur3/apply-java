// public class Methods {

//     static void myMethod() {
//         System.out.println("Hello! Mahbub.");
//     }

//     public static void main(String[] args) {
//         myMethod();
//     }
// }

public class Methods {

    String Brand, Model;
    int Year;

    void info() {
        System.out.println("Brand: " + Brand);
        System.out.println("Model: " + Model);
        System.out.println("Year: " + Year);
    }

    public static void main(String[] args) {
        Methods my_car = new Methods();
        my_car.Brand = "Audi";
        my_car.Model = "A6";
        my_car.Year = 2019;
        my_car.info();
    }
}
