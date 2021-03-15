package linkedlist;
import java.util.HashSet;

public class RemoveDuplicates{

    public static void main(String args[]){
        HashSet<Integer> set = new HashSet();
        LinkedList<Integer> list = createlist();
        list.print();
        Node<Integer> current = list.head;

        if(current != null) {set.add(current.data);}

        while(current.next != null){
            if(set.contains(current.next.data)){
                Node<Integer> removedNode = current.next;
                current.next = removedNode.next;
                removedNode.next = null;
            }else{
                set.add(current.next.data);
                current = current.next;
            }
            
        }
        list.print();
    }

    public static LinkedList<Integer> createlist(){
        Node<Integer> head = new Node<Integer>(8);
        LinkedList<Integer> list = new LinkedList<Integer>(head);
        list.add(9);
        list.add(10);
        list.add(12);
        list.add(14);
        list.add(14);
        list.add(9);
        list.add(8);
        return list;
    }
}