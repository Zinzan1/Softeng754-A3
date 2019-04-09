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
// Given
        Dollar ten = new Dollar(10);
// When
        Dollar result = ten.dividedBy(2);
// Then
        assertEquals(new Dollar(5), result); // You could change 5 to 4 to see the build failure
    }
    @Test(expected=ArithmeticException.class)
    public void testDollarDividedByZero() {
// Given
        Dollar ten = new Dollar(10);
// When
        ten.dividedBy(0);
    }
    @Test
    public void testFail() {
// Given
        fail();
    }

    @Test
    public void testDollarMultiplication() {
// Given
        Dollar ten = new Dollar(10);
// When
        Dollar result = ten.times(2);
// Then
        assertEquals(new Dollar(20), result);
    }

    @Test
    public void testDollarToString() {
// Given
        Dollar ten = new Dollar(10);
// When
        String result = ten.toString();
// Then
        assertEquals("$10", result);
    }

    @Test
    public void testDollarEquals() {
// Given
        Dollar ten = new Dollar(10);
        Dollar otherten = new Dollar(10);

// Then
        assertEquals(ten, otherten);
    }
}