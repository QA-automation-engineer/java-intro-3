package lesson02;

public class SecondProgram {

    public static void main(String[] args) {
        Person.doSomethingElse();

        Person p1 = new Person("Dima", "Skvortsov", 58);
        p1.doSomething();

        Person p2 = new Person("Dimas", "Tsoy");
        p2.doSomething();

        final Person p3 = p2;

        p2.secondName = "Kotsiuba";

        System.out.println(p3.secondName);

        String str1 = new String("str");
        String str2 = new String("str");
        if (p1.firstName == p2.firstName){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
