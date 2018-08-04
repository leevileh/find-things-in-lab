

package biohackathon.domain;

import java.util.List;


public class Box implements SaveableObject{
    
    private String name;
    private List<SaveableObject> content;
    
    public Box(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return this.name;
    }
    
    public void add(SaveableObject object) {
        content.add(object);
    }
    
    @Override
    public String toString(){
        return "Box " + name + " contains " + content.size() + " objects.";
    }

}
