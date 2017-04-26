package model;

/**
 *
 * @author Jacqueline
 */
public class Comet extends Asteroid {
	
	/**
	 * Konstruktor Comet
	 * Menciptakan objek Comet dan mengisi atributnya
	 */
	public Comet() {
		//super();
		warna = 'm'; //merah
		kecepatan = 100;
		isActive = false;
		score = 70;
	}
	
	/**
	 * Memberi tanda objek Comet aktif
	 */
	public void spawn() {
		isActive = true;
	}
	
}
