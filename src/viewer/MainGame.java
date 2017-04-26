package viewer;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Aurelia
 */
public class MainGame extends JFrame {
    static SSGame ss = new SSGame();
    static CardLayout layout = new CardLayout();
    static JPanel panel = new JPanel();
    
    MainGame() {
        panel.setLayout(layout);
        panel.add(ss, "Second Star Game");
        layout.show(panel, "Second Star Game");
        add(panel);
        
        setTitle("Second Star");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1024, 700); //frame size
        setVisible(true);   //frame visibility
    }
    
    public static void main (String args[]) {
        new MainGame();
    }
}