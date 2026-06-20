package OOPS.Abstraction;

//Abstraction -- Abstraction is the process of hiding implementation details and exposing only the essential functionality to the user.
// Methods do not have a body are called abstract method
// cannot create an object method of an abstract class because it is incomplete .It contain abstract method have no body (no implemention)
 abstract class Animal {
     abstract void sound();

     }


 class Dog extends Animal{
     public void sound(){
         System.out.println("Dog Barks");
     }
}

class Cat extends Animal{
    public void sound(){
        System.out.println("Cat Meow");
    }
}

 class Main{
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();

    }
}

