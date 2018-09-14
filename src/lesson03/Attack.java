package lesson03;

public interface Attack {
    void attack();

    default void move() {
        System.out.println("Go...");
    }
}