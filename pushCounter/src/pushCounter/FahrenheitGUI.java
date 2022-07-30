package pushCounter;
//FarenheitGUI
//AWT - Abstract Windows Toolkit
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class FahrenheitGUI 
{
  private int WIDTH = 300;
  private int LENGTH = 75;
  
  private JFrame frame;
  private JPanel panel;
  private JLabel inputLabel, outputLabel, resultLabel;
  private JTextField fahrenheit;
  
  public FahrenheitGUI()
  {
      //create the frame
      frame = new JFrame("Temperature Conversion");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      inputLabel = new JLabel("Enter Farenheit Temperature: ");
      outputLabel = new JLabel("Temperature in Celcius: ");
      resultLabel = new JLabel("---");
      
      fahrenheit = new JTextField(5);
      fahrenheit.addActionListener(new TempListener()); 
      
      //create the panel
      panel = new JPanel();
      panel.setPreferredSize(new Dimension(WIDTH, LENGTH));
      panel.setBackground(Color.cyan);
      
      //add components
      panel.add(inputLabel);
      panel.add(fahrenheit);
      panel.add(outputLabel);
      panel.add(resultLabel);
      
      //add panel to the frame
      frame.getContentPane().add(panel);
  }    
  
  private class TempListener implements ActionListener
  {
      public void actionPerformed(ActionEvent event)
      {
          int fahrenheitTemp, celciusTemp;
          String text = fahrenheit.getText();
          
          fahrenheitTemp = Integer.parseInt(text);
          celciusTemp = (fahrenheitTemp - 32) * 5 / 9;
          
          resultLabel.setText(Integer.toString(celciusTemp));
      }
  }
  
  public void display()
  {
      frame.pack();
      frame.show();
  }    
}