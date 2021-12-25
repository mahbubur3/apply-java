package TA;

class TriangleDimension {
    double land;
    double height;
}

class Triangle extends TriangleDimension {
    double area;

    void findArea() {
    }
}

class AreaOfTriangle {
    public static void main(String[] args) {
        Triangle obj = new Triangle();
        obj.land = 50;
        obj.height = 20;
        obj.findArea();
        double area = 0.5 * obj.land * obj.height;
        System.out.println(area);
    }
}
