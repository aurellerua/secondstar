package model;

/**
 *
 * @author Jacqueline
 */
public class Comet extends Asteroid {
	
	public Comet() {
		//super();
		warna = 'm'; //merah
		kecepatan = 100;
		isActive = false;
		score = 70;
	}
	
	public void spawn() {
		isActive = true;
	}
	
}
