import javax.swing.text.Document;

//la clase/class debe tener el mismo nombre que el archivo
class Main {
    public static void main(String[] args) {
        //Delclaracion mediante acceso a atributo de clase Car
        //declaracion car 1
        Car car = new Car ("AMQ123", new Account("Andres Herrera","DNI123"));
        car.passengenger = 4;
        //declaracion car 2
        Car car2 = new Car ("ZYQ987", new Account("Zaira Gomez","DNI987"));
        car.passengenger = 4;//impresion mediante acceso a metodo de clase Car
        car.printDataCar();
        car2.printDataCar();
    }
}