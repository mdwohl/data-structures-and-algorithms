package utilities;

import java.util.LinkedList;

public class AnimalShelter {
    LinkedList<Animal> animals = new LinkedList<>();
    LinkedList<Cat> cats = new LinkedList<>();
    LinkedList<Dog> dogs = new LinkedList<>();
    HashSet<Animal> adoptedAnimals = new HashSet<>();

    public void enQueue(Cat cat){
        animals.add(cat);
        cats.add(cat);
    }
    public void enQueue(Dog dog){
        animals.add(dog);
        dogs.add(dog);
    }

    public Animal deQueue(){
        return animals.removeFirst();
    }

    public Animal deQueue(Class<?>  cl) throws ClassNotFoundException {
        if(cl == Cat.class) {
            Cat adoptee = cats.removeFirst();
            adoptedAnimals.add(adoptee);
            return adoptee;
        } else if (cl == Dog.class) {
            Dog adoptee = dogs.removeFirst();
            adoptedAnimals.add(adoptee);

        } else {
            throw new ClassNotFoundException("Only cats and dogs!");
        }
    }
}
//
//public class AnimalShelter <Generic> {
//    public class Dog{};
//    public class Cat{};
//
//    private Node front;
//    private Node tail;
//
//    public class Node <Generic>{
//        Generic value;
//        Node <Generic> next;
//        Node {Generic value} {this.value = value;}
//        }
//
//        public void enqueue (Generic animal){
//            Node newNode = new Node(animal);
//
//    }
//}
