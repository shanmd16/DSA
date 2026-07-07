package Super_Keyword;
// The Super keyword in java is a reference variable. that refer the immediate parent class object . It is used to access the parent class constructor ,
// access variable and call the parent class method.
// class Animal {
//    Animal() {
//        System.out.println("Animal Constructor");
//    }
//}
//class Dog extends Animal {
//    Dog() {
//        // yaha super(); keyword bg m parent class k constructor ko call kerga
//        // super keyword call the Animal constructor in bg
//        System.out.println("Dog Constructor");
//    }
//}
//      public class Main{
//            static void main(String[] args) {
//                Dog d = new Dog();
//
//            }
//        }



// calling the Parent Method
//class Animal {
//    void sound(){
//        System.out.println("Animal make sound");
//    }
//}
//
//class Dog extends Animal{
//    void sound(){
//        System.out.println("Dog barks");
//    }
//    void display(){
//       sound();
//        super.sound();
//    }
//}
//
//class Main{
//    static void main(String[] args) {
//        Dog d = new Dog();
//        d.display();
//    }
//}



 class Animal {
     String color = "White";
      Animal(){
          System.out.println("Animal Constructor");
      }
      void sound(){
          System.out.println("Animal sound");
      }
 }

 class Dog extends Animal{
     String color = "Black";
      Dog(){
          System.out.println("Dog Constructor");
      }
      void sound(){
          System.out.println("Dog sound");
      }
      void display(){
          System.out.println(color);
          System.out.println(super.color);
          sound();
          super.sound();
      }

 }

 class Main{
     static void main(String[] args) {
         Dog d = new Dog();
         d.display();
     }
 }


