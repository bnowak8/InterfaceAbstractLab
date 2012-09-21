
package lab3;

//  Abstract class comes first since it is the abstraction of the type of objects being created

public abstract class CelestialObject {
    private String name;
    Orbiting OrbitingSun;
    Orbiting OrbitingPlanet;
    
    public CelestialObject(){
        
    }
    
    public abstract void displayOrbit();
    
    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        if (name == null || name.length() == 0){
            //Needs Validation
        }
        this.name = name;
    }

    
}
