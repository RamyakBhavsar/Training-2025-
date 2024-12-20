abstract class Animal {
    // Abstract method (no implementation)
    abstract void makeSound();
    
    // Concrete method (with implementation)
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    // Providing implementation for abstract method
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

public class Abs {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound(); // Output: Bark
        myDog.eat();       // Output: This animal eats food.
    }
}
