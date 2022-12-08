public class Car {
    private int doorsNumber = 4;

    public void doorsIncrement() {
        this.doorsNumber++;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    @Override
    public String toString() {
        return "Numero De Puertas Del Vehiculo Al Final: " + this.doorsNumber;
    }
}
