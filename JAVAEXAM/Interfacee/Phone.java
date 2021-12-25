package JAVAEXAM.Interfacee;

interface Laptop {
    void print();
}

class Phone implements Laptop {
    public void print() {
        System.out.println("Hello! Mahbub.");
    }

    public static void main(String[] args) {
        Phone obj = new Phone();
        obj.print();
    }
}
