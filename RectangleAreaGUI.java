package Mini_Proj;

import javax.swing.JOptionPane;
public class RectangleAreaGUI {
  public static void main(String[] args) {
            int area, width, height;

            String input = JOptionPane.showInputDialog(null,
                      "Enter width ", "Rectangle Area Input",
                       JOptionPane.PLAIN_MESSAGE);
           width = Integer.parseInt(input);
           input = JOptionPane.showInputDialog(null,
                       "Enter height ", "Rectangle Area Input",
                     JOptionPane.PLAIN_MESSAGE);
           height = Integer.parseInt(input);
           area = width * height;
           JOptionPane.showMessageDialog(null,
                        "Area of Rectangle: " + area,
                        "Rectangle Area Output", JOptionPane.PLAIN_MESSAGE);
        }
}
