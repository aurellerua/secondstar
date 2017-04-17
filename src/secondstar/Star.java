package secondstar;

import secondstar.BendaAngkasa;

/**
 *
 * @author Jacqueline
 */
public class Star implements BendaAngkasa {
	 
	public Star() {
		super();
		warna = b; //biru
		kecepatan = 30;
		isActive = false;
		score = 50;
	}
	
	public void spawn() {
		isActive = true;
	}
	
}
