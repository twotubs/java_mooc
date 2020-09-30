/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jongore
 */

import java.util.ArrayList;
import java.util.List;

public class BoxWithMaxWeight extends Box{
    
    private int maxBoxWeight;
    private List<Item> boxOfThings;
    
     public BoxWithMaxWeight(int capacity){
         this.maxBoxWeight = capacity;
         this.boxOfThings = new ArrayList<Item>();
         
     }
     
    @Override
    public void add(Item item) {
        int weightBox = 0;
        for (Item t : boxOfThings) {
            weightBox += t.getWeight();
        }
        if (weightBox + item.getWeight() <= this.maxBoxWeight) {
            boxOfThings.add(item);
        }
    }
    
    @Override
    public boolean isInBox(Item item) {
        return boxOfThings.contains(item);
    }
    
    
}
