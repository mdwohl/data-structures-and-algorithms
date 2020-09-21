//I followed along with Nicholas' demo in class for this code challenge because I really wasn't understanding it.
//Getting some tutor help with this.

Package LinkedList;

public class LinkedList {
    public Node head = null;
    public Node tail = null;

    public void main(String[] args) {
        LinkedList testList = new LinkedList();
        testList.addToStart(2);
        testList.addToStart(6);
        testList.addToStart(9);

    }

    public void addToStart(int newValue) {
        Node newNode = new Node(newValue)
        if (this.head == null) {
            this.head = newNode;
            this.tail = this.head;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
    }

    public int removeFromEnd() throws Exception{
        if(this.head == null) {
            throw new Exception("Nothing to remove.");
        } else {
            int thingToReturn = this.tail.value;
            Node twoNodesFromEnd = this.head;
            while(current.next.next != null){
                twoNodesFromEnd = twoNodesFromEnd.next;
            }
            current.next = null;
            this.tail = current;

            return thingToReturn;
        }
    }

    public String toString() {
        return toString(this.head);
    }

    public String toString(Node current) {
        if (current == null){
            return "null";
        }
        return String.format("{%d} -> %s", current.value, toString(current.next));
    }
}

class Node {
    int value;
    Node next;

    protected Node(int value);
        this.value = value;
}