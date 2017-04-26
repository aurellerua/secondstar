import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

class GameController extends JPanel{
	Image tray = new ImageIcon("images\\basket.png").getImage();
	int x_tray, y_tray; // Tray coordinates

	GameController(){ // Constructor
		x_tray = 450;
		y_tray = 600;

		/* Tray Movement */
		addKeyListener(new KeyAdapter()){
			public void keyPressed(KeyEvent ke){
				if(ke.getKeyCode() == ke.VK_LEFT & x_tray > 10){
					x_tray -= 20;
					repaint();
				}
				if(ke.getKeyCode()) == ke.VK_RIGHT & x_tray < 1000){
					x_tray += 20;
					repaint();
				}
			}
		}
		/* end of Tray Movement */
	}

	void detectCollision(Rectangle bendaAngkasaHitbox){ // Collision handler, object vs tray
		Rectangle trayHitbox = new Rectangle(x_tray, y_tray, 100, 65); // Hitbox at tray

		if(bendaAngkasaHitbox.intersects(trayHitbox)){
			UserScore.addScore();
			// call catched object destructor
		}
	}
}