package viewer;

/**
 *
 * @author Aurelia
 */
public class Main {
    
    private static NightSky newNightSky;
    
    public static void main(String[] args) {
        newNightSky = new NightSky();
        newNightSky.start();
    }

}
