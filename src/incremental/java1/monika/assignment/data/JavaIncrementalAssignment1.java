package incremental.java1.monika.assignment.data;

public class JavaIncrementalAssignment1 {
        private int in;
        private char ch;

   /* Assignment1(int in, char ch) {
        this.in = in;
        this.ch = ch;
    }*/

    /**
     * print the value of uninitialized global variable
     */
        public void printVars() {
            System.out.println("Inside printVars: Value of int is " + in + " ," + "Value of char is " + ch);
        }

    public void printInnerVars() {
            int i,j;
            //System.out.println("Inside printInnerVars: Value of int is " + i + " ," + "Value of char is " + j);
            //it will not print uninitialized variables. will get compilation error-> variable i,j might not have been initialized.
        }

        public static void main(String args[]) {
            JavaIncrementalAssignment1 assignment = new JavaIncrementalAssignment1();
            assignment.printVars();
            assignment.printInnerVars();
        }
    }

