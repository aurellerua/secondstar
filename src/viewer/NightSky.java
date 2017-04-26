package viewer;

import javax.swing.JFrame;

/**
 *
 * @author Aurelia
 */
@SuppressWarnings("serial")
public class NightSky extends JFrame {
    
    private GamePanel newGamePanel;
    
    public NightSky() {
        super("Second Star");
        newGamePanel = new GamePanel();
        start();
    }
    
    public void start() {
        setVisible(true);
        buildGUI();
    }
    
    private void buildGUI() {
        add(newGamePanel);
        pack();
    }
}
