package model;

/**
 *
 * @author Jacqueline
 */
public class Planet extends Sphere {
	
	/**
	 * Konstruktor Planet
	 * Menciptakan objek Planet dan mengisi atributnya
	 */
	public Planet() {
		//super();
		warna = 'h'; //hijau
		kecepatan = 10;
		isActive = false;
		score = -20;
	}
	
	/**
	 * Memberi tanda objek Planet aktif
	 */
	public void spawn() {
		isActive = true;
	}
}
