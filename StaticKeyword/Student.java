package StaticKeyword;
// Static Keyword means you don't need to create an object for run this method

//. the static keyword in java is used for memory management primarily
// It can be applied to variables, methods, blocks and nested classes
// The main concept behind static is that it belongs to the class rather than instances of the class rather.
// the static method can not use non static data member or cell non-static method directly
// similarly this and super cannot be used in static context
// this curret object ko refer karta h aur super parent k object ko refer karta h
//import static jdk.internal.icu.lang.UCharacter.getAge;

public class Student {
   public static int count =0;

   public Student() {
       count++;
   }
    private int id;
    private String name;
    private int age = 12;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

// static method
    public static void getCount(){
        System.out.println("Total students: " + count);
    }



}

class test {
    static void main() {
        Student student = new Student();
        //System.out.println(student.getAge());
// static method call through class
        Student.getCount();

        // Object k through call
        Utils utils  = new Utils();
        System.out.println(utils.max(1,4));


        // Without Object k through call
        System.out.println( Utils.max(1,4));
        System.out.println( Utils.min(1,4));

    }
}
