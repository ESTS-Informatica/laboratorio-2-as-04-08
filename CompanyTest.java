
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CompanyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CompanyTest
{
    /**
     * Default constructor for test class CompanyTest
     */
    public CompanyTest()
    {
    }
    

    @Test
    public void testConstrutor() {
        Company company = new Company();
        assertNotNull(company.getClients());
    }
    
    @Test
    public void testRegisterClient() {
        Company company = new Company();
        company.registerClient(new User("José Manuel", "911111111", "zemanel@yahoo.com"));
        assertEquals(1, company.getClients().size());
    }
    
    @Test
    public void testRegisterClients() {
        Company company = new Company();
        company.registerClient(new User("José Manuel", "911111111", "zemanel@yahoo.com"));
        company.registerClient(new User("António Francisco ", "922222222 ", "tochico@hotmail.com"));
        assertEquals(2, company.getClients().size());
    }
    
    @Test
    public void testRegisterClientDuplicate() {
        Company company = new Company();
        User user = new User("José Manuel", "911111111", "zemanel@yahoo.com");
        company.registerClient(user);
        assertFalse(company.registerClient(user));
    }
    
    @Test 
    public void testRegisterClientNull() {
        Company company = new Company();
        User user = null;
        assertFalse(company.registerClient(user));
    }
    
    @Test
    public void testRegisterSeller() {
        Company company = new Company();
        company.registerSeller(new User("José Manuel", "911111111", "zemanel@yahoo.com"));
        assertEquals(1, company.getSellers().size());
    }
    
    @Test
    public void testRegisterSellerDuplicate() {
        Company company = new Company();
        User user = new User("José Manuel", "911111111", "zemanel@yahoo.com");
        company.registerSeller(user);
        assertFalse(company.registerSeller(user));
    }
    
    @Test 
    public void testRegisterSellerNull() {
        Company company = new Company();
        User user = null;
        assertFalse(company.registerSeller(user));
    }
    
    @Test
    public void testRegisterProperty() {
        Company company = new Company();
        Property property = new Property("T3 Monte Belo", 150000.0);
        Property property1 = null;
        assertTrue(company.registerProperty(property));
        assertFalse(company.registerProperty(property));
        assertFalse(company.registerProperty(property1));
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        Company company = new Company();
        company.registerClient(new User("José Manuel", "911111111", "zemanel@yahoo.com"));
        company.registerClient(new User("António Francisco ", "922222222 ", "tochico@hotmail.com"));
        company.registerClient(new User("Fernando Fernandes", " 966777101", "966777101"));
        company.registerClient(new User("Rodrigo Rodrigues ", "966777152 ", "roro@remax.pt"));
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
