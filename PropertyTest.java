import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class PropertyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PropertyTest
{
    /**
     * Default constructor for test class PropertyTest
     */
    public PropertyTest()
    {
    }
    
    @Test
    public void testConstrutor() {
        Property property = new Property("T3 Monte Belo", 150000.0);
        assertEquals("T3 Monte Belo", property.getDescription());
        assertEquals(150000, property.getPrice());
    }
    
    @Test
    public void testToString() {
        Property property = new Property("T3 Monte Belo", 150000.0);
        assertEquals("Descricao : T3 Monte BeloPreco : 150000.0 Euros", property.toString());
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
}
