package lesson02;

public class Person {

    String firstName;
    String secondName;
    int age;
    private static int count = 0;

    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;

    }

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;

    }

    void doSomething(){
        println(count + " makes smth.");
    }

    static void doSomethingElse(){
        println(count + " makes smth else.");
    }

    static {
        println("Class was initialized.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        return secondName != null ? secondName.equals(person.secondName) : person.secondName == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "\n firstName='" + firstName + '\'' +
                ",\n secondName='" + secondName + '\'' +
                ",\n age=" + age +
                '}';
    }

    {
        println(++count + " Person was created.");
    }

    private static void println(String out){
        System.out.println(out);
    }
}
