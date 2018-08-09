package Javaassignment4.test;

import Javaassignment4.main.KycDateRange;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KycDateRangeTest {

    KycDateRange obj=new KycDateRange();
    Date signUp, currentDate;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    @Test
    public void isValidInputTest1() throws ParseException {

        signUp = dateFormat.parse("01-01-2001");
        currentDate = dateFormat.parse("01-03-2013");
        Assertions.assertTrue(obj.isValidInput(signUp, currentDate));

    }
    @Test
    public void isValidInputTest2() throws ParseException {
        signUp = dateFormat.parse("01-03-2001");
        currentDate = dateFormat.parse("01-08-2013");
        Assertions.assertTrue(obj.isValidInput(signUp, currentDate));
    }
    @Test
    public void isValidInputTest3() throws ParseException {
        signUp = dateFormat.parse("01-03-2013");
        currentDate = dateFormat.parse("01-08-2011");
        Assertions.assertFalse(obj.isValidInput(signUp,currentDate));


    }


    @Test
    public void getKycDateRangeTest1() throws ParseException{
        signUp = dateFormat.parse("16-07-1998");
        currentDate = dateFormat.parse("27-06-2017");
        Assertions.assertEquals("16-06-2017 27-06-2017",obj.getkycDateRange(signUp,currentDate));
    }

    @Test
    public void getKycDateRangeTest2() throws ParseException{
        signUp = dateFormat.parse("04-05-2017");
        currentDate = dateFormat.parse("04-04-2017");
        Assertions.assertEquals("No range",obj.getkycDateRange(signUp,currentDate));
    }
    @Test
    public void getKycDateRangeTest3() throws ParseException{
        signUp = dateFormat.parse("04-04-2015");
        currentDate = dateFormat.parse("15-03-2016");
        Assertions.assertEquals("05-03-2016 15-03-2016",obj.getkycDateRange(signUp,currentDate));
    }
}
