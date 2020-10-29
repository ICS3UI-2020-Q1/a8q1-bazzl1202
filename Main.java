import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables 
  JPanel mainPanel;

  JTextField nameInput;

  JButton helloButton;

  JLabel helloLabel;

  Font biggerText;

  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Title");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);
    
    // initialize the main JPanel
    mainPanel = new JPanel();
    // disable any layout helpers
    mainPanel.setLayout(null);

    // initilaize and input text field 
    nameInput = new JTextField();
    // set the locate and size
    nameInput.setBounds(150, 100, 500, 40);
    // add the text fields to the main panel 
    mainPanel.add(nameInput);

    // initialize and input the JButton
    helloButton = new JButton("Say Hello");
    // set the locate and size
    helloButton.setBounds(400, 340, 150, 40);
    // add an action listener to the buttons
    helloButton.addActionListener(this);
    // set the action command on the buttons
    helloButton.setActionCommand("Say Hello");
    // add the JButton to the main panel 
    mainPanel.add(helloButton);

    // create label
    helloLabel = new JLabel();
    // set location and size
    helloLabel.setBounds(150, 240, 150, 40);
    // add the JLabel to the main panel
    mainPanel.add(helloLabel);

    // create a bigger font to use
    biggerText = new Font("Times New Roman",Font.PLAIN, 20);
    // set the font on the area I want to use it
    nameInput.setFont(biggerText);
    helloButton.setFont(biggerText);

    // add the main panel to the window
    frame.add(mainPanel);
 
    

  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

    if(command.equals("Say Hello")){
      // get text from the input box
      String nameText = nameInput.getText();
      // say hello to the person
      helloLabel.setText("Hello " + nameText);
    }

  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
