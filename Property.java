

/**
 * A property to sell.
 *
 * @author POO
 * @version 03/2024
 */
public class Property {

    private static int NUMBER_OF_PROPERTIES = 0;
    private final String id;
    private String model;
    private double price;

    /**
     * Constructor of class Property
     *
     * @param description The property description.
     * @param price The property price.
     */
    public Property(String description, double price) {
        this.model = description;
        this.price = price;
        this.id = "property1";
        this.NUMBER_OF_PROPERTIES++;
    }

    /**
     * Id selector.
     */
    public String getId() {
        return id;
    }

    /**
     * Description selector.
     */
    public String getDescription() {
        return model;
    }

    /**
     * Description modifier.
     * 
     * @param description The new description. Must not be null.
     */
    public void setDescription(String description) {
        this.model = description;
    }

    /**
     * Price selector.
     */
    public double getPrice() {
        return price;
    }
    
    /**
     * Price modifier.
     * 
     * @param price The new price. Must not be negative.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return null;
    }
}
