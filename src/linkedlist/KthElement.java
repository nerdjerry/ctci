package linkedlist;

public class KthElement {
    
    public static int solution(LinkedList<Integer> list, int k){
        Node<Integer> slow, fast;
        slow = list.head;
        fast = list.head;

        while(k > 0 && fast != null){
            fast = fast.next;
            k--;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow.data;
    }
}
