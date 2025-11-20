/*
 * Interface: it is a contract that is mandatory to implement by a class
 * For instance Todo is an interface that contains 3 public abstract methods
 *By default interface methods are public abstract
 * */

public interface Todo {
    public abstract void save(); // Here public abstract we can remove it.

    void delete();

    void display();
}
