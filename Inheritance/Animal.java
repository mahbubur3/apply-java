package Inheritance;

// public class Animal {
//     void eat() {
//         System.out.println("eating...");
//     }
// }

// class Dog extends Animal {
//     void sleep() {
//         System.out.println("barking...");
//     }
// }

// class TestInheritance {
//     public static void main(String args[]) {
//         Dog d = new Dog();
//         d.sleep();
//         d.eat();
//     }
// }

// package Inheritance;

// class Animal {
// void eat() {
// System.out.println("Eating...");
// }
// }

// class Dog extends Animal {
// void sleep() {
// System.out.println("Sleeping...");
// }
// }

// class Test {
// public static void main(String[] args) {
// Dog x = new Dog();
// x.eat();
// x.sleep();
// }
// }

// class Animal {
// void eat() {
// System.out.println("eating...");
// }
// }

// class Dog extends Animal {
// void bark() {
// System.out.println("barking...");
// }
// }

// class BabyDog extends Dog {
// void weep() {
// System.out.println("weeping...");
// }
// }

// class TestInheritance2 {
// public static void main(String args[]) {
// BabyDog d = new BabyDog();
// d.weep();
// d.bark();
// d.eat();
// }
// }

class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Cat extends Animal {
    void sleep() {
        System.out.println("Sleeping...");
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

// class Animal {

// String name;
// int age;

// void dataInformation() {
// System.out.println("car");
// System.out.println("bus");
// }

// public static void main(String[] args) {
// Animal myAnimal = new Animal();

// }
// }