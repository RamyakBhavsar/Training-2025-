class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

class GoldenRetriever extends Dog {
    void fetch() {
        System.out.println("Fetching");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        GoldenRetriever myDog = new GoldenRetriever();
        myDog.eat(); // Inherited from Animal
        myDog.bark(); // Inherited from Dog
        myDog.fetch(); // Specific to GoldenRetriever
    }
}