package model;

//import secondstar.BendaAngkasa;

/**
 *
 * @author Jacqueline
 */
public class Star implements BendaAngkasa {
	 
	protected char warna;
    protected int kecepatan;
    protected boolean isActive;
    protected int score;
	
	/**
	 * Konstruktor Star
	 * Menciptakan objek Star dan mengisi atributnya
	 */
	public Star() {
		//super();
		warna = 'b'; //biru
		kecepatan = 30;
		isActive = false;
		score = 50;
	}
	
	/**
	 * Memberi tanda objek Star aktif
	 */
	public void spawn() {
		isActive = true;
	}
	
}
