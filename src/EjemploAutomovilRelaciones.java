
import java.util.Scanner;

public class EjemploAutomovilRelaciones {
    public static void main(String[] args) {

        Persona conductorSeat = new Persona("Luci","Martinez");



        Automovil seat = new Automovil("Seat","Leon","Gris",new Motor(5.0, TipoMotor.DIESEL),new Deposito(60));
        //seat.setRuedas(ruedasSeat);
        Rueda [] ruedasSeat = new Rueda[5];
        for (int i = 0; i < ruedasSeat.length; i++) {
            seat.addRueda(new Rueda("Yokohoma",4,7.5));
        }
        //seat.setTipo(TipoAutomovil.HATBACK);
        TipoAutomovil tipoSeat = seat.getTipo();
        System.out.println("auto = " + seat);

        Automovil audi = new Automovil("Audi","Q8","Blanco");
        Persona conductorAudi = new Persona("Pato","Rodríguez");
        Rueda [] ruedasAudi= new Rueda[5];
        for (int i = 0; i < ruedasAudi.length; i++) {
            audi.addRueda(new Rueda("Michelin",18,7.5));
        }

       // audi.setRuedas(ruedasAudi);
        System.out.println("audi = " + audi);




    }
}
