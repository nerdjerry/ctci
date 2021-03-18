package linkedlist;


public class Partition {
    
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(10);
        list.add(5);
        list.add(8);
        list.add(5);
        list.add(3);
        list.add(5);
        list.print();
        list.head = partition(list.head, 5);
        list.print();
    }

    static Node partition(Node head, int x){
        LinkedList<Integer> right = new LinkedList<>();
        Node current = head;
        while(head != null && (int)head.data >= x){
            head = head.next;
            right.add(current);
            current = head;
        }
        while(current.next != null){
            if((int)current.next.data >= x){
                Node removeNode = current.next;
                current.next = removeNode.next;
                right.add(removeNode);
            }else{
                current = current.next;
            }
        }
        current.next = right.head;
        return head;
    }
}
