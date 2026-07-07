package OOPS_Revision.Encapsulation;

//@Entity
public class User {
    private  String name;
    private int age;
    private int rollNo;

    public User() {
    }

    public User(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
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

    public int getRollno() {
        return rollNo;
    }

    public void setRollno(int rollno) {
        this.rollNo = rollno;
    }
}
