package incremental.java5.test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static incremental.java5.main.PatternMatcher.isValidPattern;


public class PatternMatcherTest{
    String pattern;
    @Test
    public void isValidPatternTest1()
    {
        pattern=".";
       Assertions.assertFalse(isValidPattern(pattern));
    }
    @Test
    public void isValidPatternTest2()
    {
        pattern="";
        Assertions.assertFalse(isValidPattern(pattern));
    }
    @Test
    public void isValidPatternTest3()
    {
        pattern="aABC.";
        Assertions.assertFalse(isValidPattern(pattern));
    }
    @Test
    public void isValidPatternTest4()
    {
        pattern="A.";
        Assertions.assertTrue(isValidPattern(pattern));
    }
}
