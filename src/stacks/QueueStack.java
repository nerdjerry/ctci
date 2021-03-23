package stacks;

import java.util.Stack;

public class QueueStack<T> {

    Stack <T> stackNew, stackOld;

    QueueStack(){
        stackNew = new Stack<T>();
        stackOld = new Stack<T>();
    }
    public void enqueue(T value){
        stackNew.push(value);
    }

    public T dequeue(){
        shiftStacks();
        return stackOld.pop();
    }
    
    public T peek(){
        shiftStacks();
        return stackOld.peek();
    }

    private void shiftStacks(){
        if(stackOld.isEmpty()){
            while(!stackNew.isEmpty()){
                stackOld.push(stackNew.pop());
            }
        }
    }
}

class Driver{
    public static void main(String[] args){
        QueueStack<Integer> queue = new QueueStack<>();
        queue.enqueue(6);
        queue.enqueue(8);
        queue.enqueue(9);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(12);
        queue.enqueue(14);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(16);
    }
}