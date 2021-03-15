package linkedlist;
import java.util.HashSet;

public class RemoveDuplicates{

    public static void solution(LinkedList<Integer> list){
        HashSet<Integer> set = new HashSet();
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
    }
}