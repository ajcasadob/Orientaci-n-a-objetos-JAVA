public class Deposito {

    private int capacidad;

    public Deposito(int capacidad) {
        this.capacidad = capacidad;
    }

    public Deposito() {
        this.capacidad=40;
    }

    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public String toString() {
        return "Deposito{" +
                "capacidad=" + capacidad +
                '}';
    }
}
