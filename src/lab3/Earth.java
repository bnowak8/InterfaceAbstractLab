
package lab3;


public class Earth extends CelestialObject{
    
    public Earth(){
    OrbitingSun = new OrbitingSun();
    }
    public final void displayOrbit(){
        OrbitingSun.orbit();
    }
}
