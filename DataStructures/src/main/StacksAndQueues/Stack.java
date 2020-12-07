package main.StacksAndQueues;

public class Stack<T> {
    private Node<T> top;
    public Stack(){}

    public boolean isEmpty() throws Exception{
        return top == null;
    }

    public void push (T value){
        Node<T> node = new Node<>(value);
        node.next = top;
        top = node;
    }

    public T peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Nothing here! The stack is empty!");
        }
        return top.value;
    }

    public T pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Nothing here! The stack is empty!");
        }

        T data = (T) top.value;
        top = top.next;
        return data;
    }

    //below is for formatting the output
    public String toString(){
        return toString(this.top);
    }
    private String toString(Node<T> current){
        if(current == null){
            return null;
        }
        return String.format("{%s} -> %s", current.value, toString(current.next));
    }
}
