
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jongore
 */
public class MisplacingBox extends Box{
    
     private List<Item> misplacingBox;
    
    public MisplacingBox(){
        misplacingBox = new ArrayList<Item>();
    }
    
    @Override
    public void add(Item item) {
       misplacingBox.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
    
}
