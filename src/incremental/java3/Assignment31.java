package incremental.java3;
/*
Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster,etc.
In the base class, provide methods that are common to all Rodents,
and override these in the derived classes to perform different behaviors depending on the specific type of Rodent.
Create an array of Rodent, fill it with different specific types of Rodents, and call your base-class methods to see what happens.
 Make the methods of Rodent abstract whenever possible and all classes should have default constructors that print
 a message about that class.
 */


    abstract class Rodent{
        abstract public void eat();
        abstract public void run();
        public Rodent() {
            System.out.println("In Rodent class");
        }
    }
    class Mouse extends Rodent{

        public Mouse() {
            System.out.println("In Mouse class");
        }

        public void eat()
        {
            System.out.println("eat method of Mouse");
        }
        public void run()
        {
            System.out.println("run method of Mouse");
        }
    }
    class Gerbil extends Rodent{

        public Gerbil() {
            System.out.println("In Gerbil class");
        }

        public void eat()
        {
            System.out.println("eat method of Gerbil");
        }
        public void run()
        {
            System.out.println("run method of Gerbil");
        }
    }
    class Hamster extends Rodent{
        public Hamster() {
            System.out.println("In Hamster class");
        }

        public void eat()
        {
            System.out.println("eat method of Hamster");
        }
        public void run()
        {
            System.out.println("run method of Hamster");
        }
    }

    public class Assignment31 {

        public static void main(String[] args) {

            Rodent[] rodent={
             new Mouse(), new Gerbil(), new Hamster()};             //object array
            for(Rodent obj : rodent) {
                obj.eat();
                obj.run();
            }

        }

    }
