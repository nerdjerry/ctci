package linkedlist;

class Node<T>{
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
    }
}

public class LinkedList<T> {
    Node<T> head;

    LinkedList(Node<T> head){
        this.head = head;
    }
    void add(T data){
        Node<T> newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void print(){
        Node current = head;
        System.out.print(current.data);
        current = current.next;
        while(current != null){
            System.out.print("->" + current.data);
            current = current.next;
        }
        System.out.println();
    }
}
