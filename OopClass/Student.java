package OopClass;

class Student {
    String name;
    int roll;
}

class TestClass {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.name = "Mahbubur Rahman";
        obj.roll = 163895;
        System.out.println(obj.name);
        System.out.println(obj.roll);
    }
}
