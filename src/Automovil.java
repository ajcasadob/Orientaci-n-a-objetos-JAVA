public class Automovil {

    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;
    private int capacidadDeposito;
    private static String colorPatente;
    private static int capacidadDepositoStatic;

    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadDeposito) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
        this.capacidadDeposito = capacidadDeposito;
    }

    public Automovil() {
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadDeposito() {
        return capacidadDeposito;
    }

    public static String getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(String colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public void setCapacidadDeposito(int capacidadDeposito) {
        this.capacidadDeposito = capacidadDeposito;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadDeposito=" + capacidadDeposito +
                '}';
    }

    public double calcularConsumo(int km, double porcentajeGasolina){

        return km/(capacidadDeposito*porcentajeGasolina);
    }
    public static double calcularConsumoEstatico (int km, double porcentajeGasolina){

        return km/(Automovil.capacidadDepositoStatic*porcentajeGasolina);
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }

        if(!(obj instanceof Automovil)){
            return false;
        }

        Automovil a = (Automovil) obj;

        return (this.fabricante!= null &&
                this.fabricante.equalsIgnoreCase(a.getFabricante())
                && modelo.equalsIgnoreCase(a.getModelo()));
    }
}
