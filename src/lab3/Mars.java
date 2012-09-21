
package lab3;


public class Mars extends CelestialObject{
    
    public Mars(){
    OrbitingSun = new OrbitingSun();    
}
    public final void displayOrbit(){
        OrbitingSun.orbit();
    }
}
