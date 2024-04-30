/**
 * GUI of a gadget shop, allowing the user to input multiple mobile and MP3 gadgets.
 * It stores the gadget in the ArrayList, and allows the user to make a call on a mobile and download music on the MP3.
 * 
 * Author: Zakareya Ahmad
 * Version: 1.0
 */

 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 import java.util.ArrayList;
 
 public class GadgetShop extends JFrame implements ActionListener {
     private ArrayList<Gadget> gadgets; // List to store gadgets in the inventory.
     private JTextField modelTextField; // Text field for entering gadget model.
     private JTextField priceTextField; // Text field for entering gadget price.
     private JTextField weightTextField; // Text field for entering gadget weight.
     private JTextField sizeTextField; // Text field for entering gadget size.
     private JTextField initialCreditTextField; // Text field for entering initial credit for mobile gadget.
     private JTextField phoneNumberTextField; // Text field for entering phone number for mobile gadget.
     private JTextField durationTextField; // Text field for entering call duration for mobile gadget.
     private JTextField initialMemoryTextField; // Text field for entering initial memory for MP3 gadget.
     private JTextField downloadSizeTextField; // Text field for entering download size for MP3 gadget.
     private JTextField displayNumberTextField; // Text field for entering display number to interact with gadgets.
     private JButton addMobileButton; // Button to add a mobile gadget to the inventory.
     private JButton addMP3Button; // Button to add an MP3 gadget to the inventory.
     private JButton clearButton; // Button to clear all input fields.
     private JButton makeCallButton; // Button to make a call using a mobile gadget.
     private JButton downloadMusicButton; // Button to download music to an MP3 gadget.
     private JButton displayAllButton; // Button to display details of all gadgets in the inventory.
 
     /**
      * Constructs a new GadgetShop instance.
      * Initialises the gadgets list and sets up all the GUI components.
      */
     public GadgetShop() {
         gadgets = new ArrayList<>();
 
         setTitle("Gadget Shop");
         setSize(500, 400);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setLayout(new GridLayout(14, 2, 10, 10));
 
         JLabel modelLabel = new JLabel("Model:");
         add(modelLabel);
         modelTextField = new JTextField();
         add(modelTextField);
 
         JLabel priceLabel = new JLabel("Price (£):");
         add(priceLabel);
         priceTextField = new JTextField();
         add(priceTextField);
 
         JLabel weightLabel = new JLabel("Weight (g):");
         add(weightLabel);
         weightTextField = new JTextField();
         add(weightTextField);
 
         JLabel sizeLabel = new JLabel("Size (l x w x h (mm)):");
         add(sizeLabel);
         sizeTextField = new JTextField();
         add(sizeTextField);
 
         JLabel initialCreditLabel = new JLabel("Initial Credit (mins):");
         add(initialCreditLabel);
         initialCreditTextField = new JTextField();
         add(initialCreditTextField);
 
         JLabel phoneNumberLabel = new JLabel("Phone Number:");
         add(phoneNumberLabel);
         phoneNumberTextField = new JTextField();
         add(phoneNumberTextField);
 
         JLabel durationLabel = new JLabel("Call Duration (mins):");
         add(durationLabel);
         durationTextField = new JTextField();
         add(durationTextField);
 
         JLabel initialMemoryLabel = new JLabel("Initial Memory (MB):");
         add(initialMemoryLabel);
         initialMemoryTextField = new JTextField();
         add(initialMemoryTextField);
 
         JLabel downloadSizeLabel = new JLabel("Download Size (MB):");
         add(downloadSizeLabel);
         downloadSizeTextField = new JTextField();
         add(downloadSizeTextField);
 
         JLabel displayNumberLabel = new JLabel("Display Number:");
         add(displayNumberLabel);
         displayNumberTextField = new JTextField();
         add(displayNumberTextField);
 
         addMobileButton = new JButton("Add Mobile");
         addMobileButton.addActionListener(this);
         add(addMobileButton);
 
         addMP3Button = new JButton("Add MP3");
         addMP3Button.addActionListener(this);
         add(addMP3Button);
 
         clearButton = new JButton("Clear");
         clearButton.addActionListener(this);
         add(clearButton);
 
         makeCallButton = new JButton("Make A Call");
         makeCallButton.addActionListener(this);
         add(makeCallButton);
 
         downloadMusicButton = new JButton("Download Music");
         downloadMusicButton.addActionListener(this);
         add(downloadMusicButton);
 
         displayAllButton = new JButton("Display All");
         displayAllButton.addActionListener(this);
         add(displayAllButton);
 
         setVisible(true);
     }
 
     /**
      * Allows the buttons to be clickable and initialises the actions.
      */
     public void actionPerformed(ActionEvent e) {
         if (e.getSource() == addMobileButton) {
             addMobile();
         } else if (e.getSource() == addMP3Button) {
             addMP3();
         } else if (e.getSource() == clearButton) {
             clearFields();
         } else if (e.getSource() == makeCallButton) {
             makeCall();
         } else if (e.getSource() == downloadMusicButton) {
             downloadMusic();
         } else if (e.getSource() == displayAllButton) {
             displayAll();
         }
     }
 
     /**
     * Method to read the contents of the model and return its value as a string.
     */
     private String getModelValue() {
         return modelTextField.getText();
     }
 
     /**
     * Method to read the contents of the price, and return its value as a double.
     */
     private double getPriceValue() {
         String priceText = priceTextField.getText();
         if (priceText.isEmpty()) {
             return -1; 
         }
         return Double.parseDouble(priceText);
     }
 
     /**
     * Method to read the contents of the weight, and return its value as an integer.
     */
     private int getWeightValue() {
         String weightText = weightTextField.getText();
         if (weightText.isEmpty()) {
             return -1; 
         }
         return Integer.parseInt(weightText);
     }
 
     /**
     * Method to read the contents of the size and return its value as a string.
     */
     private String getSizeValue() {
         return sizeTextField.getText();
     }
 
     /**
     * Method to read the contents of the initial credit, and return its vaue as an integer.
     */
     private int getInitialCreditValue() {
         String initialCreditText = initialCreditTextField.getText();
         if (initialCreditText.isEmpty()) {
             return -1; 
         }
         return Integer.parseInt(initialCreditText);
     } 
 
     /**
     * Method to read the contents of the initial memory, and return its value as an integer.
     */
     private int getInitialMemoryValue(JTextField textField) {
         String memoryText = textField.getText();
         if (memoryText.isEmpty()) {
             return -1; 
         }
         return Integer.parseInt(memoryText);
     }
 
     /**
     * Adds a mobile gadget to the inventory.
     */
     private void addMobile() {
         String model = getModelValue();
         double price = getPriceValue();
         int weight = getWeightValue();
         String size = getSizeValue();
         int initialCredit = getInitialCreditValue();
 
         if (model.isEmpty() || price == -1 || weight == -1 || size.isEmpty() || initialCredit == -1) {
             JOptionPane.showMessageDialog(this, "INVALID: Please enter all the information for the mobile gadget.");
             return;
         }
 
         gadgets.add(new Mobile(model, price, weight, size, initialCredit));
         clearFields();
     }
 
     /**
     * Adds an MP3 gadget to the inventory.
     */
     private void addMP3() {
         String model = getModelValue();
         double price = getPriceValue();
         int weight = getWeightValue();
         String size = getSizeValue();
         int initialMemory = getInitialMemoryValue(initialMemoryTextField);
 
         if (model.isEmpty() || price == -1 || weight == -1 || size.isEmpty() || initialMemory == -1) {
             JOptionPane.showMessageDialog(this, "INVALID: Please enter all the information for the MP3 gadget.");
             return;
         }
 
         gadgets.add(new MP3(model, price, weight, size, initialMemory));
         clearFields();
     }
 
     /**
      * Clears all of the input fields.
      */
     private void clearFields() {
         modelTextField.setText("");
         priceTextField.setText("");
         weightTextField.setText("");
         sizeTextField.setText("");
         initialCreditTextField.setText("");
         phoneNumberTextField.setText("");
         durationTextField.setText("");
         initialMemoryTextField.setText("");
         downloadSizeTextField.setText("");
         displayNumberTextField.setText("");
         JOptionPane.showMessageDialog(this, "All fields have been cleared.");
     }
     
     /**
     * Makes a call using a mobile gadget.
     */
     private void makeCall() {
         String phoneNumber = phoneNumberTextField.getText();
         int duration = parseTextField(durationTextField, "Call Duration (mins)");
         int displayNumber = getDisplayNumber();
 
         if (displayNumber != -1) {
             Mobile mobile = (Mobile) gadgets.get(displayNumber);
             mobile.makeCall(phoneNumber, duration);
         }
     }
     
     /**
     * Downloads music to an MP3 gadget.
     */
     private void downloadMusic() {
         int displayNumber = getDisplayNumber();
 
         if (displayNumber != -1) {
             MP3 mp3 = (MP3) gadgets.get(displayNumber);
             int initialMemory = mp3.getAvailableMemory();
             int downloadSize = parseTextField(downloadSizeTextField, "Download Size (MB)");
 
             if (downloadSize == -1) {
                 return; 
             }
 
             if (initialMemory >= downloadSize) {
                 mp3.downloadMusic(downloadSize);
             } else {
                 System.out.println("Insufficient Memory: Music has not been downloaded.");
             }
         } else {
             JOptionPane.showMessageDialog(this, "INVALID: Please select a valid MP3 gadget.");
         }
     }
 
     /**
      * Displays details of all the gadgets within the inventory.
      */
     private void displayAll() {
         for (int i = 0; i < gadgets.size(); i++) {
             System.out.println("Details for Gadget " + i + ":");
             displayGadgetDetails(gadgets.get(i));
             System.out.println();
         }
     }
 
     /**
      * Displays information of the specified gadget.
      */
     private void displayGadgetDetails(Gadget gadget) {
         if (gadget instanceof Mobile) {
             Mobile mobile = (Mobile) gadget;
             System.out.println("Type: Mobile");
             System.out.println("Model: " + mobile.getModel());
             System.out.println("Price: £" + mobile.getPrice());
             System.out.println("Weight: " + mobile.getWeight() + "g");
             System.out.println("Size: " + mobile.getSize());
             System.out.println("Initial Credit: " + mobile.getCallingCredit() + " mins");
         } else if (gadget instanceof MP3) {
             MP3 mp3 = (MP3) gadget;
             System.out.println("Type: MP3");
             System.out.println("Model: " + mp3.getModel());
             System.out.println("Price: £" + mp3.getPrice());
             System.out.println("Weight: " + mp3.getWeight() + "g");
             System.out.println("Size: " + mp3.getSize());
             System.out.println("Initial Memory: " + mp3.getAvailableMemory() + " MB");
         }
     }
 
     /**
      * Parses the text from the specified JTextField to a double.
      * If parsing fails, an error message is displayed.
      *
      * Returns the parsed double value, or -1 if parsing fails.
      */
     private double parseDoubleTextField(JTextField textField, String fieldName) {
         try {
             return Double.parseDouble(textField.getText());
         } catch (NumberFormatException e) {
             JOptionPane.showMessageDialog(this, "INVALID: Please enter a valid number for " + fieldName + ".");
             return -1;
         }
     }
 
     /**
      * Parses the text from the specified JTextField to an integer.
      * If parsing fails, an error message is displayed.
      *
      * Returns the parsed integer value, or -1 if parsing fails.
      */
     private int parseTextField(JTextField textField, String fieldName) {
         try {
             return Integer.parseInt(textField.getText());
         } catch (NumberFormatException e) {
             JOptionPane.showMessageDialog(this, "INVALID: Please enter a valid integer for " + fieldName + ".");
             return -1;
         }
     }
 
     /**
      * Utilizes the display number from the displayNumberTextField.
      * If the input is invalid, it will display an error message.
      *
      * Returns the display number, or -1 if the input is invalid.
      */
     private int getDisplayNumber() {
         int displayNumber = -1;
 
         try {
             displayNumber = Integer.parseInt(displayNumberTextField.getText());
 
             if (displayNumber < 0 || displayNumber >= gadgets.size()) {
                 displayNumber = -1;
                 JOptionPane.showMessageDialog(this, "INVALID: Please enter a valid index.");
             }
         } catch (NumberFormatException e) {
             displayNumber = -1;
             JOptionPane.showMessageDialog(this, "INVALID: Please enter a valid number for the display number.");
         }
 
         return displayNumber;
     }
 
     /**
      * The main method to start the GadgetShop application.
      */
     public static void main(String[] args) {
         new GadgetShop();
     }
 }
