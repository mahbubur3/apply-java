package Hierarchical_Inheritance;

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

class Cat extends Animal {
    void meow() {
        System.out.println("meowing...");
    }
}

class TestInheritance {
    public static void main(String[] args) {
        Cat x = new Cat();
        x.meow();
        x.eat();
    }
}