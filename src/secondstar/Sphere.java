package secondstar;

//import secondstar.BendaAngkasa;

/**
 *
 * @author Jacqueline
 */
public abstract class Sphere implements BendaAngkasa {
	
	protected char warna;
    protected int kecepatan;
    protected boolean isActive;
    protected int score;
	
	public Sphere() {
		//super();
	}
	
	public abstract void spawn();
	
}
