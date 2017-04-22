package secondstar;

/**
 *
 * @author Jacqueline
 */
public class Planet extends Sphere {
	
	public Planet() {
		//super();
		warna = 'h'; //hijau
		kecepatan = 10;
		isActive = false;
		score = -20;
	}
	
	public void spawn() {
		isActive = true;
	}
}
