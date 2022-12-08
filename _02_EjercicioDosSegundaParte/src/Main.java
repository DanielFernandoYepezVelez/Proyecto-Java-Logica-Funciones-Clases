public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println("Puertas Del Vehiculo Inicialmente: " + car.getDoorsNumber());
        car.doorsIncrement();
        System.out.println(car.toString());
    }
}