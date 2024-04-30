/**
 * Class representing an MP3 player, which is a subclass of the Gadget class.
 * 
 * Author: Zakareya Ahmad
 * Version: 1.0
 */
public class MP3 extends Gadget {

    private int availableMemory;  // The available memory (mb)

    /**
     * Constructor for creating an MP3 object.
     */
    public MP3(String model, double price, int weight, String size, int availableMemory) {
        super(model, price, weight, size);
        this.availableMemory = availableMemory;
    }

    /**
     * Getter for the available memory of the MP3 player.
     * 
     * Returns the available memory of the MP3 player in megabytes (MB).
     */
    public int getAvailableMemory() {
        return availableMemory;
    }

    /**
     * Method to download music to the MP3 player.
     * 
     * Utilises memoryUsage to find the amount of memory that the music will take up in megabytes (mb).
     * 
     * Displays the neccessary output.
     */
    public void downloadMusic(int memoryUsage) {
        if (memoryUsage <= availableMemory) {
            availableMemory -= memoryUsage;
            System.out.println("Sufficient Memory: music has downloaded.");
        } else {
            System.out.println("Insufficient Memory: music has not downloaded.");
        }
    }

    /**
     * Method to delete music from the MP3 player..
     */
    public void deleteMusic(int memoryUsage) {
        availableMemory += memoryUsage;
    }

    /**
     * Method to display the details of the MP3 player.
     * 
     * It utilises the display method in the Gadget class to display the model, price, weight, and size.
     * The available memory is then displayed.
     */
    public void display() {
        super.display();
        System.out.println("You have " + availableMemory + " MB of memory remaining.");
    }
}
