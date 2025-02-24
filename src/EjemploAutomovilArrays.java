public class EjemploAutomovilArrays {
    public static void main(String[] args) {

        Persona conductorSeat = new Persona("Luci","Martinez");



        Automovil seat = new Automovil("Seat","Leon","Gris",new Motor(5.0, TipoMotor.DIESEL),new Deposito(60));
        //seat.setRuedas(ruedasSeat);

        //seat.setTipo(TipoAutomovil.HATBACK);
        TipoAutomovil tipoSeat = seat.getTipo();
        System.out.println("auto = " + seat);

        Automovil audi = new Automovil("Audi","Q8","Blanco");
        Persona conductorAudi = new Persona("Pato","Rodríguez");


       // audi.setRuedas(ruedasAudi);
        System.out.println("audi = " + audi);

        Automovil [] autos = new Automovil[2];
        autos [0]= seat;
        autos [1]= audi;

        for (Automovil auto : autos) {
            System.out.println(auto);
        }


    }
}
