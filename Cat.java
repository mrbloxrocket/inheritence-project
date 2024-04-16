import java.util.*;
class Cat extends Animal {

    private String color;


    public Cat() {
        super();
        this.color = "Unknown";
    }

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(color, cat.color);
    }


    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }


    public void scratch() {
        System.out.println("Cat scratches furniture");
    }
}