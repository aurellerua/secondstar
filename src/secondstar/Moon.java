package secondstar;

/**
 *
 * @author Jacqueline
 */
public class Moon extends Sphere {
	
	public Moon() {
		super();
		warna = k; //kuning
		kecepatan = 10;
		isActive = false;
		score = 30;
	}
	
	public void spawn() {
		isActive = true;
	}
}
