

package biohackathon.domain;



public class Reagent implements SaveableObject{
    
    private String name;
    private String expiration;
    private String sharing;
    
    public Reagent(String name, String expiration, String sharing){
        this.name = name;
        this.expiration = expiration;
        this.sharing = sharing;
    }
    
    @Override
    public String name() {
        return this.name();
    }
    
    
}
