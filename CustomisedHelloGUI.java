package Mini_Proj;

import javax.swing.JOptionPane;

public class CustomisedHelloGUI {
  public static void main(String[] args) {
            String name = JOptionPane.showInputDialog(null,
                        "What is your name? ");
            JOptionPane.showMessageDialog(null,
                        "Hello " + name + "!",
                	   "Customised Hello Output", JOptionPane.PLAIN_MESSAGE);
          }
}