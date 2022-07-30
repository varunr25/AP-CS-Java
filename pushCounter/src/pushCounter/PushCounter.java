package pushCounter;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PushCounter extends JApplet{
    //Serial ID is a requirement
    private static final long serialVersionUID = 1L;
    
    private int APPLET_WIDTH = 500, APPLET_HEIGHT = 50;
    private int pushes;
    
    private JLabel label;
    private JButton push, pull;

    //private eJFrame frame
    
    //Set up the GUI
    public void init()
    {
        pushes = 0;
        push = new JButton("+1");
        pull = new JButton("-1");
        push.addActionListener(new ButtonListener());
        pull.addActionListener(new ButtonListener());
        
        label = new JLabel("Pushes: " + Integer.toString(pushes));
        
        Container cp = this.getContentPane();
        cp.setName("Hello");
        cp.setBackground(Color.magenta);
        cp.setLayout(new FlowLayout());
        cp.setMaximumSize(this.getSize());
        
        cp.add(push);
        cp.add(pull);
        cp.add(label);
        
        this.setSize(APPLET_WIDTH, APPLET_HEIGHT);
        
        //Does the JApplet have a way to control frame size.
        //frame = new JFrame();
        //frame.setResizable(false);
        //None of these worked
        
        
    }//init()
    
    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            String theButton;
            theButton = event.getActionCommand();
            
            if(theButton.equals("+1"))
            {
                plusOne();
            }
            if(theButton.equals("-1"))
            {
                minusOne();
            }
            repaint();
            
        }
    }
    public void plusOne()
    {
        pushes++;
        label.setText("Pushes: " + Integer.toString(pushes));
    }
    public void minusOne()
    {
        pushes--;
        label.setText("Pushes: " + Integer.toString(pushes));
    }
}