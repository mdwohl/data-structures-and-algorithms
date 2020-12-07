package main.StacksAndQueues;

public class PseudoQueue {

    Stack first = new Stack();
    Stack second = new Stack();

    public void enqueue(int value){
        first.push(value);
    }

    public int dequeue() throws Exception{
        if(second.isEmpty()){
            if(first.isEmpty()){
                throw new Exception("Nothing to see here! ALl empty!");
            }

            while(!first.isEmpty()){
                int x = (int) first.pop();
                second.push(x);
            }
        }
        return (int) second.pop();
    }
    public String toString(){
        return first.toString();
    }

    private String toString (Node current){
        if(current == null){
            return "nulllllll!";
        }
        return String.format("{%d} -< %s", current.value, toString(current.next));
    }
}
