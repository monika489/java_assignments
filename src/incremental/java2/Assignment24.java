package incremental.java2;/*
Complete the previous exercise by creating objects to attach to the array of references.

 */

public class Assignment24 {

        String str;

        Assignment24(String str) {
            this.str=str;
            System.out.println(str);
        }

        public static void main(String[] args) {
            Assignment24[] objArray=new Assignment24[]
                    {
                            new Assignment24("first"), new Assignment24("second")
                    };

        }
    }
