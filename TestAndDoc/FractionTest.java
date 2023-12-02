

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class FractionTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FractionTest
{
    /**
     * Default constructor for test class FractionTest
     */
    public FractionTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void MultTest()
    {
        Fraction fraction1 = new Fraction(1, 2);
        assertEquals("3/8", fraction1.multFrac(3, 4));
    }
}

