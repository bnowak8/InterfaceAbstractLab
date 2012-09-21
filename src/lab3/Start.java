
package lab3;


public class Start {
    
    public static void main(String[] args) {
        
        CelestialObject earth = new Earth();
        CelestialObject moon = new Moon();
        CelestialObject mars = new Mars();

        earth.displayOrbit();
        moon.displayOrbit();
        mars.displayOrbit();
        
    }
    
}
