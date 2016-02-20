package davis.john;

import davis.john.DataValidator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jrdavis on 2/19/16.
 */
public class DataValidatorTest {
DataValidator dataValidator;
    @Before
    public void setUp() throws Exception {
    dataValidator  = new DataValidator();
    }

    @Test
    public void testIsValidUsername() throws Exception {
        String example = "derp";
        boolean expected = true;
        boolean actual = dataValidator.isValidUsername(example);
        assertEquals("username is less then 25 greater then 3, and lowercase,", expected, actual);
        System.out.println("Test Passed");
    }

    @Test
    public void testIsValidEnhancedUsername() throws Exception {
        String example1 = "dErp_123";
        boolean expected1 = true;
        boolean actual1 = dataValidator.isValidEnhancedUsername(example1);
        assertEquals("username greate then 3, less then 25, _ and numbers, first ahs to be letter,", expected1, actual1);
        System.out.println("Test Passed");
    }

    @Test
    public void testIsValidIP() throws Exception {
        String ip = "192.168.1.777";
        boolean expected2 = true;
        boolean actual2 = dataValidator.isValidIP(ip);
        assertEquals("tets ip addresses", expected2, actual2);
        System.out.println("Test Passed");

    }
}