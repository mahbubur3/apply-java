package JAVAEXAM.Method;

public class Phone {
    String Brand, Model, Price;

    void info() {
        System.out.println(Brand);
        System.out.println(Model);
        System.out.println(Price);
    }

    public static void main(String[] args) {
        Phone myPhone = new Phone();
        myPhone.Brand = "Samsung";
        myPhone.Model = "Galaxy S9";
        myPhone.Price = "$1000";
        myPhone.info();
    }
}
