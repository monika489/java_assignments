package incremental.java1.monika.assignment.singleton;


public class JavaIncrementalAssignment12 {

        private String str;

    public JavaIncrementalAssignment12(String str)
    {
        this.str="Hello world";
    }
    static JavaIncrementalAssignment12 getObject(String str) {
            //this.str = str;
            //non static member can't be referenced from a static method.
            return new JavaIncrementalAssignment12(str);
        }

    /**
     * non static method to print string
     *
     */
    public void nonStaticMethodToPrintString() {
            //this.str = str;
            System.out.println("value of string is "+str);
        }

        public static void main(String args[]) {
           // JavaIncrementalAssignment12 assignment = new JavaIncrementalAssignment12();
           JavaIncrementalAssignment12 ass= getObject("hi");
            ass.nonStaticMethodToPrintString();

            //assignment.nonStaticMethodToPrintString("hello world!");
        }
    }