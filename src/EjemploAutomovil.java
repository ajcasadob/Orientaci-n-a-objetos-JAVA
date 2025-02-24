import java.util.Date;
import java.util.Scanner;

public class EjemploAutomovil {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String fabricante,modelo,color;
        double cilindrada;
        int deposito;
        Date fecha = new Date();
        Motor motorSeat = new Motor(2.0,TipoMotor.DIESEL);
        Deposito deposito1= new Deposito();
        Persona conductor= new Persona("Pepe","Lopez");
        Automovil seat = new Automovil("Seat","Leon","Gris",motorSeat,deposito1);
        seat.setMotor(motorSeat);



        System.out.println("auto = " + seat);
        Motor motorAudi = new Motor(3.0,TipoMotor.GASOLINA);
        Deposito deposito2= new Deposito(60);
        Automovil audi = new Automovil("Audi","Q8","Blanco",motorAudi,deposito2);

        System.out.println("audi = " + audi);

        System.out.println("Indica el fabricante del vehículo");
        fabricante=sc.nextLine();

        System.out.println("Indica el modelo del vehículo");
        modelo=sc.nextLine();

        System.out.println("Indica el color del vehículo");
        color=sc.nextLine();

        System.out.println("Indica la cilindrada del vehículo");
        cilindrada=Double.parseDouble(sc.nextLine());

        System.out.println("Indica la capacidad del deposito");
        deposito=Integer.parseInt(sc.nextLine());


       // Automovil kia = new Automovil(fabricante,modelo,color,cilindrada,deposito);

        //System.out.println(kia.calcularConsumo(20,60));

        //Comparando con equals ambos objetos si son iguales.
        //System.out.println(kia.equals(audi));
        //System.out.println(kia==audi);
        //System.out.println("kia = " + kia);



        sc.close();
    }
}
