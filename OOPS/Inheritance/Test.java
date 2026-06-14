package OOPS.Inheritance;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setAge(16);
        dog.setName("Shera");
        System.out.println("Dog name "+ dog.getName());
        System.out.println("Dog age " + dog.getAge());
        dog.eat();
        dog.sayHello();
        //System.out.println(dog.setName("Shera"));

    }
}
