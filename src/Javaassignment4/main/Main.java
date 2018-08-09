package Javaassignment4.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    /**
     * Main Method that takes input from user which is the signup date and the current date in a particular format.
     * It prints the range of form date for filling the KYC form
     * @param args no use
     * @throws ParseException
     */
    public static void main(String[] args) throws ParseException {
        System.out.println("Enter the no of test cases");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String signUpDate1 = sc.next();
            String currentDate1 = sc.next();

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date signUp = dateFormat.parse(signUpDate1);
            Date currentDate = dateFormat.parse(currentDate1);

            KycDateRange obj = new KycDateRange();
            System.out.println(obj.getkycDateRange(signUp, currentDate));
        }
    }
}