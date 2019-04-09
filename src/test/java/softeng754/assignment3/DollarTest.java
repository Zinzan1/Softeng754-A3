package softeng754.assignment3;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
import static org.junit.Assert.*;
import org.bson.Document;
import org.junit.Test;
//import com.mongodb.MongoClient;
//import com.mongodb.client.MongoCollection;
//import com.mongodb.client.MongoDatabase;

public class DollarTest {
    @Test
    public void testDollarDivision() {
        Dollar ten = new Dollar(10);
        Dollar result = ten.dividedBy(2);
        assertEquals(new Dollar(5), result); // You could change 5 to 4 to see the build failure
    }
    @Test(expected=ArithmeticException.class)
    public void testDollarDividedByZero() {
        Dollar ten = new Dollar(10);
        ten.dividedBy(0);
    }
    @Test
    public void testFail() {
//        fail();
    }

    @Test
    public void testDollarMultiplication() {
        Dollar ten = new Dollar(10);
        Dollar result = ten.times(2);
        assertEquals(new Dollar(20), result);
    }

    @Test
    public void testDollarToString() {
        Dollar ten = new Dollar(10);
        String result = ten.toString();
        assertEquals("$10", result);
    }

    @Test
    public void testDollarEquals() {
        Dollar ten = new Dollar(10);
        Dollar otherten = new Dollar(10);
        assertEquals(ten, otherten);
    }
}