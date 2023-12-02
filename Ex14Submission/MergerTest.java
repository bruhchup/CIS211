import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class MergerTest.
 *
 * @author  Hayden Banks
 * @version April 20, 2023
 */
public class MergerTest
{
    /**
     * Default constructor for test class MergerTest
     */
    public MergerTest()
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
    public void nullTest()
    {
        NameList nameList1 = new NameList();
        Teams teams1 = new Teams(1);
        Merger merger1 = new Merger(nameList1.names);
        assertNotNull(teams1.mergerTeams(4, merger1.mergeList));
    }
}

