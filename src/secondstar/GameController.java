package secondstar;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 *
 * @author Aurelia
 */
public class GameController extends JPanel {
    
    private static final int windowWidth = 1300;
    private static final int windowHeight = 800;
    private static final int squareWidth = 25;
    private static final int squareHeight = 25;
    
    private int randomNumber = 0;
    private int squareYLocation = -squareHeight;
    private boolean numberCreated = false;
    private static boolean gameRunning = false;
    
    Random r = new Random();
    
    /**
  * method to get random number
  */
    public void getRandomNumber() {
        randomNumber = r.nextInt(windowWidth - squareWidth);
        numberCreated = true;
    }
    
    /**
  * Paint a black screen and blue rectangle 
  * @param graphics 
  */
    public void paint(Graphics graphics) {
        graphics.setColor(Color.black);
        graphics.fillRect(0, 0, windowWidth, windowHeight);
        graphics.setColor(Color.BLUE);
        graphics.fillRect(randomNumber, squareYLocation, squareWidth, squareHeight);
    }
    
    /**
  * Get random number for x value of the object, then move it y coordinate towards the bottom and stop once it hits the botton 
  * Reset after done 
  */
    public void update() {

        if (!numberCreated) {
            getRandomNumber();
        }
        
        if (squareYLocation <= windowHeight) {
            squareYLocation++;

        } else {
            numberCreated = false;
            squareYLocation = -squareHeight;
        }
    }

    /**
  * Method to start the game.
  */
    public void start() {
        gameRunning = true;
    }

    public static void main(String[] args) throws InterruptedException {

        GameController game = new GameController();
        JFrame frame = new JFrame();
        frame.add(game);
        frame.setVisible(true);
        frame.setSize(windowWidth, windowHeight);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Raining Squares");
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        game.start();

        //updates square position, repaints square, and slows down update and paint speed.
        while (gameRunning) {
            game.update();
            game.repaint();
            Thread.sleep(1);
        }
    }

}
