package Javaassignment3.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaAssignmentPingHost {

    /**
     * Calculates median of all data in the list
     * @param a list of ping time
     * @return median of the list
     */
    public static double findMedian (List<Double> a){
        int middle = a.size()/2;
         if(middle==0){
             System.out.println("\nHost error");
            return 0;
         }
        if (a.size() % 2 == 1) {
            return a.get(middle);
        } else {
            return (a.get(middle-1) + a.get(middle)) / 2.0;
        }
    }

    /**
     * Method that pings the given hostname. It executes the ping command from the terminal and
     *      * time is found by reading lines from terminal.
     * @param count ping count
     * @return median of ping time
     */
    public static Double pingHost(String host, int count) {

        String command="ping -c "+ count +" "+host ;
        List<Double> timeArray= new ArrayList<>();
        System.out.print("Finding median of ping time..");
        try {
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));
            if(inputStream.readLine()== null) {
                System.out.println("unknown host "+ host);}

            String s;
            // reading output stream of the command
            while ((s = inputStream.readLine()) != null) {
                System.out.print(".");
                int timeIndex=s.indexOf("time=");
                if(timeIndex == -1) continue;

                String time = s.substring(timeIndex, s.indexOf("ms")).trim();
                double pingTime = Double.valueOf(time.substring(5));

                //System.out.println(pingTime);
                timeArray.add(pingTime);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
            //System.out.println(timeArray);
        Collections.sort(timeArray);
        Double median=findMedian(timeArray);
        return median;
    }

}