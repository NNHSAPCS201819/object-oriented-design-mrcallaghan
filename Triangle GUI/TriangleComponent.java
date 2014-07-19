import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TriangleComponent extends JComponent
{
    private static final int MAX_POINTS = 3;

    public TriangleComponent()
    {
        this.addMouseListener( new MouseClickListener());
    }

    @Override
    public void paintComponent(Graphics g)
    {  
        super.paintComponent( g );
        Graphics2D g2 = (Graphics2D) g;

    }
    public class MouseClickListener implements MouseListener
    {
        public void mouseClicked( MouseEvent event )
        {
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