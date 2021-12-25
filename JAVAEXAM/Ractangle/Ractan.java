package JAVAEXAM.Ractangle;

class Ractan {
    double length, width;
}

class TestArea {
    public static void main(String[] args) {
        Ractan ractangleArea = new Ractan();
        ractangleArea.length = 20;
        ractangleArea.width = 80;
        double result = ractangleArea.length * ractangleArea.width;
        System.out.println("Area of Ractangle = " + result);
    }
}
