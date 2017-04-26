package model;

/**
 *
 * @author Jacqueline
 */
public class Moon extends Sphere {
	/**
	 * Konstruktor Moon
	 * Menciptakan objek Moon dan mengisi atributnya
	 */
	public Moon() {
		//super();
		warna = 'k'; //kuning
		kecepatan = 10;
		isActive = false;
		score = 30;
	}
	/**
	 * Memberi tanda objek Moon aktif
	 */
	public void spawn() {
		isActive = true;
	}
}
