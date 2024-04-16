import java.util.*;
class Dog extends Animal {

    private String breed;


    public Dog() {
        super();
        this.breed = "Unknown";
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", breed='" + breed + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(breed, dog.breed);
    }


    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }


    public void fetch() {
        System.out.println("Dog fetches a stick");
    }
}