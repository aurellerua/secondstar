package viewer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Aurelia
 */
public class SSGame extends JPanel {
    Image sky = new ImageIcon("nighsky.png").getImage();
    Image star = new ImageIcon("star.png").getImage();
    Image tray = new ImageIcon("tray.png").getImage();
    Image gameOverPic = new ImageIcon("nighsky.png").getImage();
    Image temp;
    
    int x_tray, y_tray;
    int x_star, y_star;
    Random rand = new Random();
    
    JLabel time;
    JLabel score;
    
    int scoreCount = 0;
    int timeLeft = 59;
    int counter = 0;
    
    boolean gameOver = false;
    
    SSGame() {
        setLayout(null);
	setFocusable(true);
	temp = sky;
 
	x_tray = 450; y_tray = 600;
	x_star = (int)rand.nextInt(1000);
	y_star = 0;
 
	time = new JLabel("Time: 59");
	time.setBounds(20, 10, 50, 20); //setting the time label on screen    
 
	score = new JLabel("Points: 0");
	score.setBounds(100,10,100,20);
 
	/*adding both components in jpanel*/
	add(time);
	add(score);
 
	addKeyListener(new KeyAdapter(){
	public void keyPressed(KeyEvent ke){
 
		if(ke.getKeyCode() == ke.VK_LEFT & x_tray>10){
			x_tray-=10;
			repaint(); // redraw at new position
		}
		if(ke.getKeyCode() == ke.VK_RIGHT & x_tray<1000){
			x_tray+=10; // redraw at new position
			repaint();
		}
	}//end keypressed
    });	
    }
    
    void fallingStar() {
        if(y_star >=650){ //when one star has completely fallen
		y_star = 0;   //set the y cord of next star to 0
		x_star = rand.nextInt(1000); // randomize next star x coord
	}
	else
		y_star++;
    }
    
    void updateTime() {
        counter++;
		if(counter == 100) //we count to 60 and then dec timeleft by 1 for slowing speed
		{
		   timeLeft--;  //dec time left after 60 counts
		   counter = 0; //reset counter
		}
		time.setText("Time:"+timeLeft);
    }
    
    void detectCollision() {
        Rectangle trayRect = new Rectangle(x_tray,y_tray,100,65); //making a rectangle on the tray
	Rectangle starRect    = new Rectangle(x_star,y_star,45,67); //making a rectangle on star
 
	if(starRect.intersects(trayRect)){
	   scoreCount+=5; // give 5 score on each catch
	   score.setText("Points:"+scoreCount); // set the count
    	   y_star = 0; // for next star
	   x_star = rand.nextInt(1000); // again randomizing x axis of star
	}
    }
    
    void checkGameOver() {
        if(timeLeft <= 0)
	   {
		JLabel yourScore = new JLabel("Your Score :" + scoreCount);
		temp = gameOverPic;
		yourScore.setBounds(400, 400, 200, 100);
		gameOver = true;
		yourScore.setForeground(Color.RED);
		add(yourScore);
	    }
    }
    
    public void paintComponent(Graphics g){
	super.paintComponent(g);
	Graphics2D g2d = (Graphics2D)g;
	g2d.drawImage(temp,0,0,null); //game background
 
	checkGameOver();
 
	if(gameOver == false){
	   setFocusable(true);
	   grabFocus();
	   updateTime();
 
	   fallingStar();
   	   detectCollision();
 
	   g2d.drawImage(star, x_star, y_star,null); //drawing star at new position
	   g2d.drawImage(tray, x_tray, y_tray, null); //drawing tray
	}	
	repaint();	
    }//end paintComponent
    
}//end class

