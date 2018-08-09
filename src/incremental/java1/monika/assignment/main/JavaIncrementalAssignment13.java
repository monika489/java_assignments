package incremental.java1.monika.assignment.main;


import incremental.java1.monika.assignment.data.JavaIncrementalAssignment1;
import incremental.java1.monika.assignment.singleton.JavaIncrementalAssignment12;

public class JavaIncrementalAssignment13 {

    static JavaIncrementalAssignment12 getObjectOfAssignment12 (String str) {
        return new JavaIncrementalAssignment12(str);
    }

    public static void main(String args[]) {
        JavaIncrementalAssignment1 assignment1 = new JavaIncrementalAssignment1();
        assignment1.printInnerVars();
        assignment1.printVars();
        getObjectOfAssignment12("hi").nonStaticMethodToPrintString();
    }
    }