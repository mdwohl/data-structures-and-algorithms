package main.StacksAndQueues;

public class Queue<T> {
    private Node<T> first;
    private Node<T> holder;
    private Node<T> last;

    public Queue(){}

    public void enqueue (T value){
        Node<T> node = new Node<>(value);
        if(isEmpty())
            first = node;
        else
            last.next = node;
        last = node;
    }

    public T dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("There's nothing here!");
        } else {
            holder = first;
            first = first.next;
            return holder.value;
        }
    }

        public boolean isEmpty(){
            return first == null;
        }

        public T peek() throws Exception{
            if(first == null) {
                throw new Exception("There's nothing here!");
            } else {
                return (T) first.value;
            }
        }

        public String toString(){
        StringBuilder builder = new StringBuilder();
        Node<T> current = this.first;
        while(current != null){
            builder.append("(");
            builder.append(current.value);
            builder.append(")");
            current = current.next;
        }
        builder.append("null");
        return builder.toString();
        }
    }

