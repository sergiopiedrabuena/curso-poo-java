import java.util.ArrayList;
import java.util.Map;

//relacio de tipo herencia se declara en java con la palabra reservada extends
class UberVan extends Car{
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberVan(String license, Account driver, Map<String, Map<String,Integer>> typeCarAccepted, ArrayList<String> seatsMaterial){
        //super palabra reservada que refiere a constructor de otra clase
        super(license, driver);
        this.typeCarAccepted=typeCarAccepted;
        this.seatsMaterial=seatsMaterial;
    }
}