package Javaassignment2.test;

import Javaassignment2.main.IsContainAllTheAlbhabets;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class IsContainAllTheAlphabetsTest {
    private IsContainAllTheAlbhabets check = new IsContainAllTheAlbhabets();

    @Test
    public void test1()
    {
        String s="abcdefghijklmnopqrstuvwxyz";
        Assertions.assertTrue(check.checkString(s));
    }

    @Test
    public void test2()
    {
        String s="123456789";
        Assertions.assertFalse(check.checkString(s));
    }

    @Test
    public void test3()
    {
        Assertions.assertFalse(check.checkString(null));
    }
}
