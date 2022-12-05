//relacio de tipo herencia se declara en java con la palabra reservada extends
class UberX extends Car{
    String brand;
    String model;

    public UberX(String license, Account driver, String brand, String model){
        //super palabra reservada que refiere a constructor de otra clase
        super(license, driver);
        this.brand=brand;
        this.model=model;
    }
}
