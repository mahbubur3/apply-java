package Multilevel_Inheritance;

class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Cat extends Animal {
    void sleep() {
        System.out.println("sleeping...");
    }
}

class BabyCat extends Cat {
    void weep() {
        System.out.println("weeping...");
    }
}

class Test {
    public static void main(String[] args) {
        BabyCat x = new BabyCat();
        x.eat();
        x.sleep();
        x.weep();
    }
}
