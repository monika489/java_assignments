package incremental.java2;

/*
Create a class with a constructor that takes a String argument. During construction, print the argument.
 Create an array of object references to this class, but don’t actually create objects to assign into the array.
When you run the program, notice whether the initialization messages from the constructor calls are printed.
 */
public class Assignment23 {

  String str;

    Assignment23(String str) {
        this.str=str;
        System.out.println(str);
    }

    public static void main(String[] args) {
        Assignment23[] objArray=new Assignment23[5];
        for(Assignment23 obj: objArray)
        {
            System.out.println(obj);   //will print null
        }
    }
}
