package secondstar;

/**
 *
 * @author Jacqueline
 */
public class Debris extends Asteroid {
	
	public Debris() {
		//super();
		warna = 'p'; //putih
		kecepatan = 50;
		isActive = false;
		score = -10;
	}
	
	public void spawn() {
		isActive = true;
	}
}
