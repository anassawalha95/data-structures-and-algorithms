package utilities;
import stacksandqueues.Queue;

public class AnimalShelter<A> {
    Queue<Cats> cats=new Queue<>();
    Queue<Dogs> dogs=new Queue<>();

    

    public void enqueue(Cats cat){
        cats.enqueue(cat);
    }

    public void enqueue(Dogs dog){
        dogs.enqueue(dog);
    }

    public Animal dequeue(String pref){
         if (pref =="cat"){
            return cats.dequeue();
        }
        else if (pref =="dog"){
            return dogs.dequeue();
        }else {
            return null;
        }
    }

}
