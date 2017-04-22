package secondstar;

/**
 *
 * @author Jacqueline
 */
public abstract class Asteroid implements BendaAngkasa {
	
	protected char warna;
    protected int kecepatan;
    protected boolean isActive;
    protected int score;
	
	public Asteroid() {
		//super();
	}
	
	public abstract void spawn();
	
}
