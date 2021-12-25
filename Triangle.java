
public class Triangle {

    double base, height;

    public static void main(String[] args) {

        Triangle area = new Triangle();
        area.base = 50.3;
        area.height = 30.4;
        double result = 0.5 * area.base * area.height;
        System.out.println(result);
    }
}
