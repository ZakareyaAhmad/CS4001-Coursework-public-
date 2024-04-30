/**
 * Class representing a Gadget.
 * 
 * Author: Zakareya Ahmad
 * Version: 1.0
 */
public class Gadget {

    private String model; //The model of the gadget 
    private double price; //The price of the gadget (£)
    private int weight; //The weight of the gadget (g)
    private String size; //The Size of the gadget (format l x w x h (mm))

    /**
     * Constructor for creating the Gadget object.
     */
    public Gadget(String model, double cost, int weight, String size) {
        this.model = model;
        price = cost;
        this.weight = weight;
        this.size = size;
    }

    /**
     * Getter for the model of the gadget.
     * 
     * Returns the model of the gadget.
     */
    public String getModel() {
        return model;
    }

    /**
     * Getter for the price of the gadget.
     * 
     * Returns the price of the gadget in pounds.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Getter for the weight of the gadget.
     * 
     * Returns the weight of the gadget in grams.
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Getter for the size of the gadget.
     * 
     * Returns the size of the gadget.
     */
    public String getSize() {
        return size;
    }

    /**
     * Method to display the details of the gadget.
     */
    public void display() {
        System.out.println("The model of this gadget is " + model + ".");
        System.out.println("The price of this " + model + " gadget is £" + price  + ".");
        System.out.println("This " + model + " gadget weighs " + weight + " g.");
        System.out.println("This " + model + " gadget is " + size + " mm.");
    }
}
