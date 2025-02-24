import java.util.Arrays;

public class Automovil implements  Comparable{

    private String fabricante;
    private String modelo;
    private String color;
    private Motor motor;
    private Deposito deposito;
    private static String colorPatente;
    private static int capacidadDepositoStatic;
    private TipoAutomovil tipo;
    private Persona conductor;
    private Rueda [] ruedas;
    private int indiceRueda;

    public Automovil(String fabricante, String modelo, String color, Motor motor, Deposito deposito) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.ruedas= new Rueda[5];
    }

    public Automovil(String fabricante, String modelo, String color) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.ruedas= new Rueda[5];

    }

    public Automovil(String fabricante, String modelo, String color, Motor motor, Deposito deposito, Persona conductor, Rueda[] ruedas) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
        this.deposito = deposito;
        this.conductor = conductor;
        this.ruedas= new Rueda[5];
    }

    public Automovil() {
        this.ruedas= new Rueda[5];
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Deposito getDeposito() {
        return deposito;
    }

    public void setDeposito(Deposito deposito) {
        this.deposito = deposito;
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

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public void addRueda (Rueda rueda){
        this.ruedas[indiceRueda++]=rueda;
    }

    public static String getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(String colorPatente) {
        Automovil.colorPatente = colorPatente;
    }


    @Override
    public String toString() {
        return "Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", motor=" + (motor != null ? motor : "No especificado") +
                ", deposito=" + (deposito != null ? deposito : "No especificado") +
                ", tipo=" + (tipo != null ? tipo : "No especificado") +
                ", conductor=" + (conductor != null ? conductor : "No especificado") +
                ", ruedas=" + (ruedas != null ? Arrays.toString(ruedas) : "No especificado") +
                '}';
    }


    public double calcularConsumo(int km, double porcentajeGasolina){

        return km/(deposito.getCapacidad()*porcentajeGasolina);
    }
    public static double calcularConsumoEstatico (int km, double porcentajeGasolina){

        return km/(Automovil.capacidadDepositoStatic*porcentajeGasolina);
    }

    @Override
    public int compareTo(Object o) {
        Automovil a = (Automovil) o;
        return this.fabricante.compareTo(a.fabricante);
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
