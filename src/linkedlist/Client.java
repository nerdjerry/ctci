package linkedlist;

public class Client {

    public static void main(String args[]){
        LinkedList<Integer> list = integerLinkedList();
        System.out.println("Input");
        list.print();
        System.out.println(KthElement.solution(list, 1));
        System.out.println("Output");
        list.print();
    }


    public static LinkedList<Integer> integerLinkedList(){
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
