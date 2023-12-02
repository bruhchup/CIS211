

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class TeamsTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TeamsTest
{
    /**
     * Default constructor for test class TeamsTest
     */
    public TeamsTest()
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
    public void nullCheck()
    {
        Teams teams2 = new Teams(3);
        teams2.sortTeamByAge();
        teams2.sortTeamByFirst();
        teams2.sortTeamByLast();
        teams2.sortTeams();
        assertNotNull(teams2.toString());
    }
}

