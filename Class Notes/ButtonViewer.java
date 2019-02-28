import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Write a description of class ButtonViewer here.
 * 
 * @author mcallaghan
 * @version feb 25 2019
 */
public class ButtonViewer
{
    private final int FRAME_WIDTH = 400;
    private final int FRAME_HEIGHT = 100;
    
    private JFrame frame;       // container window holds all other GUI components
    private JPanel panel;       // another container to place components on to
    
    private JButton buttonA;    // button object
    private JButton buttonB;
    private JLabel label;
    
    private int clickCountA;  // state machines
    private int clickCountB;
    
    
    public ButtonViewer()
    {
        this.clickCountA = 0;
        this.clickCountB = 0;
        
        // 1. define and setup the UI components
        this.frame = new JFrame();
        this.panel = new JPanel();  // will resize to fit components, unlike the frame
        
        this.buttonA = new JButton("click A");
        this.buttonB = new JButton("click B");
        this.label = new JLabel("A: 0; B: 0");
        this.panel.add(this.label);
        
        this.panel.add(this.buttonA);
        this.panel.add(this.buttonB);
        
        this.frame.add(this.panel);
        
        this.frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);  // starts application; doesn't return until 
                                      //   application is closed
                                        
        // 2. create listener object  
        ClickListener listener = new ClickListener();  // object created from the nested class
        /*
         * anonymous class - created on the fly and tied to one instance
         * 
        ActionListener listener = new ActionListener()
        {
                public void actionPerformed(ActionEvent event)
                {
                    label.setText("Button " + event.getActionCommand() + 
                            " was clicked");
                }
        };
        */
        
        // 3. register listener object with component that generates events
        this.buttonA.addActionListener(listener);
        this.buttonB.addActionListener(listener);
        
    }
    
    public static void main(String[] args)
    {
        ButtonViewer viewer = new ButtonViewer();
    }
    
    // nested class - A class enclosed within another class.  
    //                  Useful for granting a listener access to instance variables.
    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource() == buttonA) // careful to not use the "this" keyword in a nested class
            {
                clickCountA++;
            }
            else if(event.getSource() == buttonB)
            {
                clickCountB++;
            }
            
            label.setText("A: " + clickCountA + "; B: " + clickCountB);
        }
    }
    
    
    
    
    
}
