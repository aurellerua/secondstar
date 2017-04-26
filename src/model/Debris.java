package model;

/**
 *
 * @author Jacqueline
 */
public class Debris extends Asteroid {
	
	/**
	 * Konstruktor Debris
	 * Menciptakan objek Debris dan mengisi atributnya
	 */
	public Debris() {
		//super();
		warna = 'p'; //putih
		kecepatan = 50;
		isActive = false;
		score = -10;
	}
	
	/**
	 * Memberi tanda objek Debris aktif
	 */
	public void spawn() {
		isActive = true;
	}
}
