package JAVAEXAM.Ruff.SingleInheritance;

class Student {
    public void come() {
        System.out.println("student was coming..");
    }
}

class Teacher extends Student {
    public void go() {
        System.out.println("teacher was going..");
    }
}

class TestInheritance {
    public static void main(String[] args) {
        Teacher obj = new Teacher();
        obj.come();
        obj.go();
    }
}
