import java.util.LinkedList;

public class AnimalShelter {
    LinkedList<Dog> dogQueue;
    LinkedList<Cat> catQueue;
    private int id;

    AnimalShelter(){
        dogQueue = new LinkedList<>();
        catQueue = new LinkedList<>();
        id = 0;
    }

    public void enqueue(Animal a){
        a.setId(id++);
        if(a instanceof Dog){
            dogQueue.addLast((Dog) a);
        }else{
            catQueue.addLast((Cat) a);
        }
    }

    public Animal dequeueAny(){
        if(dogQueue.size() == 0){
            return dequeueCat();
        }else if(catQueue.size() == 0){
            return dequeueDog();
        }

        Dog dog = dogQueue.peek();
        Cat cat = catQueue.peek();

        if(dog.isOlderThan(cat)){
            return dequeueDog();
        }else{
            return dequeueCat();
        }
    }

    public Dog dequeueDog(){
        return dogQueue.poll();
    }

    public Cat dequeueCat(){
        return catQueue.poll();
    }
}

class Animal{
    private int id;
    protected String name;

    Animal(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public boolean isOlderThan(Animal a){
        return this.id < a.id;
    }
}

class Dog extends Animal{
    Dog(String name){super(name);}
}

class Cat extends Animal{
    Cat(String name){super(name);}
}
