
package lab3;


public class Moon extends CelestialObject{
    
    public Moon(){
    OrbitingPlanet = new OrbitingPlanet();
    }
    public final void displayOrbit(){
        OrbitingPlanet.orbit();
    }
}
