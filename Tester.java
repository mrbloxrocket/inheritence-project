import java.util.*;
public class Tester {
    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();


        Animal a1 = new Animal("Generic Animal", 5);
        Dog d1 = new Dog("Buddy", 3, "Labrador");
        Cat c1 = new Cat("Whiskers", 2, "Tabby");

        Animal a2 = new Dog("Max", 4, "Golden Retriever");
        Animal a3 = new Cat("Mittens", 1, "White");
        Animal a4 = d1;

        animals.add(a1);
        animals.add(d1);
        animals.add(c1);
        animals.add(a2);
        animals.add(a3);
        animals.add(a4);

        for (Animal animal : animals) {
            System.out.println(animal);
            animal.makeSound();
            animal.eat();

            if (animal instanceof Dog) {
                ((Dog) animal).fetch();
            } else if (animal instanceof Cat) {
                ((Cat) animal).scratch();
            }

            System.out.println();
        }
    }
}