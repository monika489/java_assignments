package java3;

/*
 Create a class with an inner class that has a non-default constructor (one that takes arguments).
 Create a second class with an inner class that inherits from the first inner class.
 */
class Outer
{

    public void Display()
    {
        System.out.println("Display method");
    }
    static class Inner
    {
        private int a;
        public Inner(int a) {
            this.a=a;
        }
        public void Display()
        {
            System.out.println("value of a"+a);
        }
    }
}

class Outer2 extends Outer {
    class Inner2 extends Inner {

        public Inner2() {
            super(1);
        }
    }
}


public class Assignment35{
    public static void main(String[] args) {
        Outer2 obj= new Outer2();
        obj.Display();
         }
}

