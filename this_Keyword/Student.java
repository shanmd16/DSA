package this_Keyword;

// this keyword refer to the current instance and differenciate between local variable and instance variable

//this is a reference variable in Java that refers to the current object of the class.
// It is used to access the current object's instance variables, methods, and constructors.

 class Student {
     String name;

     Student(String name) {
         this.name = name;
     }

     void display() {
         System.out.println(this.name);
     }


  static void main(String[] args) {
         Student s1 = new Student("Shan");
         Student s2 = new Student("Ali");
         s1.display();
         s2.display();
     }
 }




//class Demo {
//
//
//
//    void show() {
//        System.out.println("Show");
//    }
//
//    void display() {
//        this.show();
//    }
//
//    static void main(String[] args) {
//        Demo d1 = new Demo();
//        d1.show();
//    }
//}


