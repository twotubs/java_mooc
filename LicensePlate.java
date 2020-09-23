
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }
    
    public String getCountry(){
        return this.country;
    }
    
    public String getRegisterationCode(){
        return this.liNumber;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (getClass() != object.getClass()) {
            return false;
        }

        LicensePlate newPlate = (LicensePlate) object;

        if (!this.country.equals(newPlate.getCountry())) {
            return false;
        }

        if (this.liNumber == null || !this.liNumber.equals(newPlate.getRegisterationCode())) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        if (this.liNumber == null) {
            return 7;
        }

        return this.country.hashCode() + this.liNumber.hashCode();
    }
}


