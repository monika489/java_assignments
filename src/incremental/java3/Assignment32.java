package java3;

/**
 * Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
 * Add a balance( ) method to Unicycle and Bicycle, but not to Tricycle.
 * Create instances of all three types and upcast them to an array of Cycle.
 * Try to call balance( ) on each element of the array and observe the results.
 * Downcast and call balance( ) and observe what happens
  */

class Cycle
 {
     public Cycle() {
         System.out.println("Inside cycle class");
     }
 }

class Unicycle extends Cycle{
    public Unicycle() {
        System.out.println("Inside Unicycle class");
    }
    public void balance()
    {
        System.out.println("balance method of Unicycle class");
    }
}

class Bicycle extends Cycle{
    public Bicycle() {
        System.out.println("Inside Bicycle class");
    }
    public void balance()
    {
        System.out.println("balance method of Bicycle class");
    }
}

class Tricycle extends Cycle{
    public Tricycle() {
        System.out.println("Inside Tricycle class");
    }
}

public class Assignment32 {

    public static void main(String[] args) {
        Cycle[] cyc={
                new Cycle(), new Unicycle(), new Bicycle(), new Tricycle()};             //upcasting demostration
        for(Cycle obj : cyc) {
            //obj.balance();      //parent class can't access the functionality of its child classes
        }


        //downcasting demostration
        Unicycle obj1= (Unicycle) cyc[1];
        obj1.balance();
        Bicycle obj2=(Bicycle) cyc[2];
        obj2.balance();
        Tricycle obj3=(Tricycle) cyc[3];
        //obj3.balance();                   //both Tricycle and Cycle class doesn't have balance method
                                            // so can't call balance method
    }
}
