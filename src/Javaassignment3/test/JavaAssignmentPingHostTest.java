package Javaassignment3.test;

import Javaassignment3.main.JavaAssignmentPingHost;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class JavaAssignmentPingHostTest {

    JavaAssignmentPingHost obj=new JavaAssignmentPingHost();
    java.util.List<Double> timeArray= new ArrayList<>();
    @Test
    public void findMedianTest1()
    {
        timeArray.add(10.5);
        timeArray.add(11.5);
        timeArray.add(12.0);
        timeArray.add(13.8);
        timeArray.add(18.5);
        Assertions.assertEquals(12.0,obj.findMedian(timeArray));

    }

    @Test
    public void findMedianTest2()
    {
        timeArray.add(10.5);
        timeArray.add(11.5);
        Assertions.assertEquals(11.0,obj.findMedian(timeArray));

    }
}
