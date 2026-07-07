package OOPS_Revision.Encapsulation;

public class Main {

    public static void main() {
//        User user = new User();
//        System.out.println(user.getName());
//        System.out.println(user.getRollno());
//        System.out.println(user.getAge());
//
//        user.setName("Shan");
//        user.setAge(21);
//        user.setRollno(5);
//
//        System.out.println(user.getName());
//        System.out.println(user.getRollno());
//        System.out.println(user.getAge());

        User user = new User("Yash", 23, 4);
        System.out.println(user.getName());
        System.out.println(user.getRollno());
        System.out.println(user.getAge());
        int age = user.getAge();

    }

}
