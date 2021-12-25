package Ractangle;

class Main {
    double length, width;
}

class Test {
    public static void main(String[] args) {
        double result;
        Main ractangle_area = new Main();
        ractangle_area.length = 20;
        ractangle_area.width = 60;
        result = ractangle_area.length * ractangle_area.width;
        System.out.println("Area of Rectangle = " + result);
    }
}
