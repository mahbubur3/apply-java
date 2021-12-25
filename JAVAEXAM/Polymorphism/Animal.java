package JAVAEXAM.Polymorphism;

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound..");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow bow");
    }
}

class Cat extends Animal {
    public void animalSound() {
        System.out.println("The cat says: meow meow");
    }
}

class TestPolymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myAnimal.animalSound();
        myDog.animalSound();
        myCat.animalSound();
    }
}