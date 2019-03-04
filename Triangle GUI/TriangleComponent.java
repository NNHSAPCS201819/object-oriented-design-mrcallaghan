import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
/**
 * TriangleGUI - a gui to draw triangles based on clicking 3 times
 * 
 * @author mcallaghan
 * @date 3/4/19
 */
public class TriangleComponent extends JComponent
{
    private int clickState; // state machine
    private int clickX;
    private int clickY;
    private Point2D[] points;
    private static final int MAX_POINTS = 3;

    public TriangleComponent()
    {
        clickState = 0;
        this.points = new Point2D[MAX_POINTS];
        this.addMouseListener( new MouseClickListener());
    }
    
    public void setPoint(int x, int y)
    {
        if (this.clickState < MAX_POINTS)
        {
            this.points[clickState] = new Point2D.Double(x, y);
            this.clickState++;
        }
        else
        {
            this.clickState = 0;
        }
        
        this.repaint();
    }
    
    @Override
    public void paintComponent(Graphics g)
    {  
        super.paintComponent( g );
        Graphics2D g2 = (Graphics2D) g;
        
        if (this.clickState > 0)
        {
            g2.draw(new Ellipse2D.Double( this.points[0].getX(), this.points[0].getY(), 1, 1));
        }
        if (this.clickState > 1)
        {
            g2.draw(new Line2D.Double( this.points[0], this.points[1]));
        }
        if (this.clickState > 2)
        {
            g2.draw(new Line2D.Double( this.points[1], this.points[2]));
            g2.draw(new Line2D.Double( this.points[2], this.points[0]));
        }
    }
    public class MouseClickListener implements MouseListener
    {
        public void mouseClicked( MouseEvent event )
        {
            clickX = event.getX();
            clickY = event.getY();
            setPoint(clickX, clickY);
        }

        public void mouseEntered( MouseEvent event )
        {
        }

        public void mouseExited( MouseEvent event )
        {
        }

        public void mousePressed( MouseEvent event )
        {
        }

        public void mouseReleased( MouseEvent event )
        {
        }
    }

}