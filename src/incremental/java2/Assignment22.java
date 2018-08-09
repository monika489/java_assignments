package incremental.java2;

import sun.awt.geom.AreaOp;
/*
Create a class with two (overloaded) constructors. Using this, call the second constructor inside the first one.
 */
public class Assignment22 {

    private static int a;
    Assignment22()
    {
        System.out.println("calling constructor1");
    }
    Assignment22(int a)
    {
        this();
        System.out.println("calling constructor2");
        this.a=a;
    }

    public static void main(String[] args) {
        Assignment22 obj=new Assignment22(4);
        System.out.println("value of a is:"+a);

    }
}
