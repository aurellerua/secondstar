/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package viewer;

import controller.TrayController;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 *
 * @author Aurelia
 */
public class SecondStar extends javax.swing.JPanel {

    /**
     * Creates new form SecondStar
     */
    private static final int windowWidth = 800;
    private static final int windowHeight = 600;
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
        Image obj = new ImageIcon("bebek.jpg").getImage();
        graphics.drawImage(obj, 10, 10, this);
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

        SecondStar game = new SecondStar();
        JFrame frame = new JFrame();
        frame.add(game);
        
        frame.setVisible(true);
        frame.setSize(windowWidth, windowHeight);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Second Star");
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        game.start();
        
        //JFrame frame2 = new JFrame();
        //TrayController tray = new TrayController();
        //tray.paint(null);
        //frame2.add(tray);

        //updates square position, repaints square, and slows down update and paint speed.
        while (gameRunning) {
            game.update();
            game.repaint();
            Thread.sleep(2);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
