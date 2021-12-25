
class Test_constructors {
    int a;
    Test_constructors() {
        a = 50;
    }
    public static void main(String[] args) {
        Test_constructors myNumber = new Test_constructors();
        System.out.println(myNumber.a);
    }
}

// perametter
class Main {
    String model_name;
    int model_year;

    Main(String name, int year) {
        model_name = name;
        model_year = year;
    }
    public static void main(String[] args) {
        Main my_car = new Main("Civic", 2022);
        System.out.println(my_car.model_name);
        System.out.println(my_car.model_year);
    }
}