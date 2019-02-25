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
    
    private JFrame frame;  // container window holds all other GUI components
    private JPanel panel; // another container to place components on to
    
    private JButton button; // button object
    
    
    public ButtonViewer()
    {
        // 1. define and setup the UI components
        this.frame = new JFrame();
        this.panel = new JPanel();  // will resize to fit components, unlike the frame
        
        this.button = new JButton("click me");
        this.panel.add(this.button);
        
        this.frame.add(this.panel);
        
        this.frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);  // starts application; doesn't return until 
                                        // application is closed
    }
    
    public static void main(String[] args)
    {
        ButtonViewer viewer = new ButtonViewer();
    }
    
    
    
    
    
    
    
    
}
