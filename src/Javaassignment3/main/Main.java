package Javaassignment3.main;

import java.util.Scanner;

public class Main {

    /**
     * main method
     * @param args not use
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter host name: ");
        String host=sc.next();
        System.out.print("Enter ping count: ");
        int count=sc.nextInt();
        if(count<=0)
        {
            System.out.println("bad number of packets to transmit");
            System.exit(0);
        }
        JavaAssignmentPingHost p= new JavaAssignmentPingHost();
        System.out.println("\nmedian of the ping time is: " +p.pingHost(host,count));


    }
}
