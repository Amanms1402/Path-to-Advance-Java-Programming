// Registartion Number: 21BCE10338
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

// Main class
public class InheritanceExample {
    public static void main(String[] args) {
        // Creating an object of Dog class
        Dog dog = new Dog();

        // Accessing methods from parent class
        dog.eat(); // Inherited method
        // Accessing method from child class
        dog.bark();
    }
}

