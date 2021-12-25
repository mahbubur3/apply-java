package Single_Inheritance;

class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void sleep() {
        System.out.println("sleeping...");
    }
}

class Test {
    public static void main(String args[]) {
        Dog x = new Dog();
        x.sleep();
        x.eat();
    }
}
