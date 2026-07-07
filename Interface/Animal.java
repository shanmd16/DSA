package Interface;
// Interfce does not creat object
//Interface can achieve multiple inheritance
// Abstract and static method in interface

public interface Animal {
    public static int MAX_AGE = 150;

    public abstract void eat();

    void sleep();

    public static void info(){
        System.out.println("This is an animal interface");
    }
    public default void run(){
        this.eat();
        System.out.println("Animal is running.");
    }
//    default method create karne yee fayda h k implement class m error nhi aati h
//    without emplemnt k chal jata implement classs k object create karne say
}


 class Dog implements Animal{


    @Override
    public void eat() {
        System.out.println("Dog is eating");

    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");

    }
}

class Cat implements Animal{


    @Override
    public void eat() {
        System.out.println("Cat is eating");

    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}


class Test {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();

        System.out.println(Animal.MAX_AGE); // acees animal interface
        Animal.info(); //Static method only access Animal Interface


    }
}