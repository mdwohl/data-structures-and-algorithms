package utilities;

public class AnimalShelter <Generic> {
    public class Dog{};
    public class Cat{};

    private Node front;
    private Node tail;

    public class Node <Generic>{
        Generic value;
        Node <Generic> next;
        Node {Generic value} {this.value = value;}
        }

        public void enqueue (Generic animal){
            Node newNode = new Node(animal);

    }
}
