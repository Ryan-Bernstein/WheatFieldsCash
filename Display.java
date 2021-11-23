
import javax.swing.*;
public class Display {
    private JFrame win;
    
    public Display() {
        initialize();
    }
    private void initialize(){
        win = new JFrame();
        win.setTitle("sammy");
        win.setSize(200,300);
        win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
    private void show(){
        win.setVisible(true);
    }
    
}