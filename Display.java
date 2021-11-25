import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Display extends MouseMotionAdapter{
    private JFrame win;
    
    public Display() {
        initialize();
    }
    private void initialize(){
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 200));
        panel.addMouseMotionListener(new LocationPrinter());
        
        win = new JFrame();
        win.setTitle("sammy");
        win.setSize(300,200);
        win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        win.getContentPane().add(panel);
        frame.pack();

    }
    public void show(){
        win.setVisible(true);
    }
    @Override
    public void mouseMoved(MouseEvent me) {
        int screenX = me.getXOnScreen();
        int screenY = me.getYOnScreen();
        System.out.println("screen(X,Y) = " + screenX + "," + screenY);
  }
    
}