package secondstar;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 *
 * @author Aurelia
 */
public class GameController extends JPanel {
    
    static int windowWidth = 1300;
    static int windowHeight = 800;
    
    int randomNumber = 0;
    int squareWidth = 25;
    int squareHeight = 25;
    int squareYLocation = -squareHeight;
    boolean numberCreated = false;
    static boolean gameRunning = false;
    
    // get spawn location
    public void getRandomNumber() {
        Random r = new Random();
        randomNumber = r.nextInt(windowWidth - squareWidth);
        numberCreated = true;
    }
    
        //paints a black screen, then paints a rectangle on top of the black screen
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, windowWidth, windowHeight);
        g.setColor(Color.BLUE);
        g.fillRect(randomNumber, squareYLocation, squareWidth, squareHeight);
    }

    public void update() {

        //calls the generateRandomNumber() method which gives the square a random x value inside the screen
        if (!numberCreated) {
            getRandomNumber();
        }
        //moves the squares y coordinate towards the bottom of the screen and stops once it hits the bottom
        if (squareYLocation <= windowHeight) {
            squareYLocation++;

            //resets the x and y location to a new position
        } else {
            numberCreated = false;
            squareYLocation = -squareHeight;
        }
    }

    //sets the while loop to true to start the game
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
