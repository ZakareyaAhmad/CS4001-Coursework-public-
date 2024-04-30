/**
 * Class representing a Mobile phone, which is a subclass of the Gadget class.
 * 
 * Author: Zakareya Ahmad
 * Version: 1.0
 */
public class Mobile extends Gadget {

    private int callingCredit;  //The number of minutes of calling credit remaining (minutes)

    /**
     * Constructor for creating a Mobile object.
     */
    public Mobile(String model, double price, int weight, String size, int callingCredit) {
        super(model, price, weight, size);
        this.callingCredit = callingCredit;
    }

    /**
     * Getter for the calling credit of the mobile phone.
     */
    public int getCallingCredit() {
        return callingCredit;
    }

    /**
     * Method to add calling credit to the mobile phone.
     */
    public void addCallingCredit(int amount) {
        if (amount > 0) {
            callingCredit += amount;
        } else {
            System.out.println("Please enter a positive amount for calling credit.");
        }
    }

    /**
     * Method to make a phone call from the mobile phone.
     */
    public void makeCall(String phoneNumber, int duration) {
        if (callingCredit >= duration) {
            System.out.println("Calling " + phoneNumber + " for " + duration + " minutes.");
            callingCredit -= duration;
        } else {
            System.out.println("Insufficient calling credit to make the call.");
        }
    }

    /**
     * Method to display the details of the mobile phone.
     * 
     * It utilises the display method in the Gadget class to display the model, price, weight, and size.
     * The number of minutes of calling credit remaining is then displayed.
     */
    public void display() {
        super.display();
        System.out.println("You have " + callingCredit + " minutes of credit remaining.");
    }
}
