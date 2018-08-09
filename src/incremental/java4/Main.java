package incremental.java4;

class ThrowException
{
    public void check(int number) throws Exception1, Exception2, Exception3
    {
        if(number==5)
            throw new Exception1("can't divide by 5");  //throwing exception 1
        if(number==10)
            throw new Exception2("can't divide by 10");  //throwing exception 2
        if(number==20)
            throw new Exception3("can't divide by 20");  //throwing exception 3
    }
}

public class Main {
    public static void main(String args[]) {
       try {
           ThrowException obj= new ThrowException();
          //throw new NullPointerException("Null pointer exception");                 // finally block will execute
           obj.check(5);
           obj.check(10);
           obj.check(20);
       }
       catch (Exception e)                         //single catch clause for three exceptions
       {
            System.out.println(e.getMessage());
       }
       finally                                                    //finally block
       {
           System.out.println("Finally block is executed.");
       }
    }
}
