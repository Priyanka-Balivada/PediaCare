// Parent class: Animal
class Animal {
    String name;
    String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String makeSound() {
        return "Some generic sound";
    }
}

// Child class: Dog, inheriting from Animal
class Dog extends Animal {
    String breed;

    public Dog(String name, String breed) {
        super(name, "Dog"); // Call the constructor of the parent class to set name and species
        this.breed = breed;
    }

    @Override
    public String makeSound() {
        return "Woof!";
    }

    public String fetchBall() {
        return name + " fetches the ball.";
    }
}

// Child class: Cat, inheriting from Animal
class Cat extends Animal {
    String color;

    public Cat(String name, String color) {
        super(name, "Cat"); // Call the constructor of the parent class to set name and species
        this.color = color;
    }

    @Override
    public String makeSound() {
        return "Meow!";
    }

    public String scratchFurniture() {
        return name + " scratches the furniture.";
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a Dog instance
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        System.out.println(dog1.name + " is a " + dog1.species + " of breed " + dog1.breed + ".");
        System.out.println(dog1.makeSound()); // Outputs: Woof!
        System.out.println(dog1.fetchBall()); // Outputs: Buddy fetches the ball.

        // Creating a Cat instance
        Cat cat1 = new Cat("Whiskers", "Tabby");
        System.out.println(cat1.name + " is a " + cat1.species + " with " + cat1.color + " fur.");
        System.out.println(cat1.makeSound()); // Outputs: Meow!
        System.out.println(cat1.scratchFurniture()); // Outputs: Whiskers scratches the furniture.
    }
}
