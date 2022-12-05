class Car {
    Integer id;
    String license;
    Account driver;
    Integer passengenger;

    //constructor CAR
    public Car(String license, Account driver){
        //this palabra reservada que refiere a los atributos
        this.license = license;
        this.driver = driver;
    }

    //Metodo para mostrar datos
    void printDataCar() {
        System.out.println("License: " + license + " Driver: " + driver.name);
    }
}
