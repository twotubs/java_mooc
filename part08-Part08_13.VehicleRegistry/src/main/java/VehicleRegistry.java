
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jongore
 */
public class VehicleRegistry {
    
    private final HashMap<LicensePlate, String> owners;

    public VehicleRegistry() {
        this.owners = new HashMap<LicensePlate, String>();
    }

    public boolean add(LicensePlate plate, String owner) {
        if (owners.get(plate) == null) {
            owners.put(plate, owner);
            return true;
        } else {
            return false;
        }
    }

    public String get(LicensePlate plate) {
        if (owners.containsKey(plate)) {
            return owners.get(plate);
        } else {
            return null;
        }
    }

    public boolean remove(LicensePlate plate) {
        if (owners.containsKey(plate)) {
            owners.remove(plate);
            return true;
        } else {
            return false;
        }
    }

    public void printLicensePlates() {
        for (LicensePlate key : owners.keySet()) {
            System.out.println(key);
        }
    }

    public void printOwners() {
        
        ArrayList<String> owner = new ArrayList<String>();
        
        for (LicensePlate key : owners.keySet()) {
            String ownerName = owners.get(key);
            if (!owner.contains(ownerName)) {
                owner.add(ownerName);
            }
        }
        
        for (String name : owner) {
            System.out.println(name);
        }
    }
}
    

