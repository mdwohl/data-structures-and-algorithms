import org.w3c.dom.Node;
//Below code comes from Geeks For Geeks
//https://www.geeksforgeeks.org/merge-a-linked-list-into-another-linked-list-at-alternate-positions/

import java.util.LinkedList;

public class zipList {
}

class linkedList{
    Node head;

    class Node{
        int data;
        Node next;
        Node(int d) {data = d; next = null}
    }

    void newNodeAtFront{
        Node new_node = new Node(newData);
        newData.next = head;
        head = newData;
    }
    void mergeLists(LinkedList list2){
        Node list1Current = head, list2Current = list2.head;
        Node list1Next, list2Next;

        while(list1Current != null && list2Current != null){
            list1Next = list1Current.next;
            list2Next = list2Current.next;

            list2Current.next = list1Next;
            list1Current.next = list2Current;

            list1Current = list1Next;
            list2Current = list2Next;
        }
        list2.head = list2Current;
    }
    id printList() {
        Node temporary = head;
        while (temporary != null) {
            System.out.println(temporary.data + " ");
            temporary = temporary.next;
        }
    }
}