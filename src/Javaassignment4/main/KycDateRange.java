package Javaassignment4.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class KycDateRange {
    /**
     * check whether input dates is valid or not
     * @param signUpDate input from user
     * @param currentDate input from user
     * @return true if input is valid otherwise false
     */
    public static boolean isValidInput(Date signUpDate, Date currentDate) {
        return signUpDate.compareTo(currentDate) <= 0;
    }

    /**
     * Generate the range for the form date
     * @param signUpDate signup date of customer
     * @param currentDate the current date when customer is filling the form
     * @return string for valid kyc range
     */
    public static String getkycDateRange(Date signUpDate, Date currentDate)
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        if(!isValidInput(signUpDate,currentDate))
        {
            return "No range";
        }
        else
        {
            Calendar anniversarry = Calendar.getInstance();
            anniversarry.setTime(signUpDate);

            Calendar cur = Calendar.getInstance();
            cur.setTime(currentDate);
            cur.add(Calendar.DATE,30);
            Date i1=cur.getTime();
            Date i2=anniversarry.getTime();
            anniversarry.set(Calendar.YEAR,cur.get(Calendar.YEAR));
            if(anniversarry.after(cur)){
                anniversarry.add(Calendar.YEAR,-1);
            }
            Date anniv=anniversarry.getTime();

            Calendar cal = Calendar.getInstance();
            cal.setTime(anniv);
            cal.add(Calendar.DATE, -30);
            Date start = cal.getTime();
            cal.add(Calendar.DATE, 60);
            Date end = cal.getTime();
            if(end.after(currentDate)) {
                end=currentDate;
            }
            if(start.before(signUpDate)){
                start=signUpDate;
            }
            return (dateFormat.format(start)+" "+dateFormat.format(end));

        }
    }



}