package OOPS.Abstraction;

//Abstraction -- Abstraction is the process of hiding implementation details and exposing only the essential functionality to the user.
// Methods do not have a body are called abstract method
// cannot create an object method of an abstract class because it is incomplete .It contain abstract method have no body (no implemention)
 abstract class Animal {
     abstract void sound();

     }
     //"The Animal class declares the sound() method but does not provide its implementation. The Dog class provides the implementation by overriding the sound() method.
     // This hides the implementation details from the user and exposes only the required behavior, which is abstraction."
     // "Animal class sirf sound() method declare karti hai aur implementation hide karti hai. Dog class us method ki actual implementation provide karti hai.
// Jab user sound() call karta hai, usse sirf behavior dikhta hai (Dog barks), andar ka implementation nahi dikhta. Isi concept ko Java me Abstraction kehte hain."


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

 public class Main{
    public static void main(String[] args) {
        Animal a = new Dog();
        Animal b = new Cat(); // Yha refrence Animal ka h aur object cat aur dog k hai
        a.sound();
        b.sound();

    }
}

