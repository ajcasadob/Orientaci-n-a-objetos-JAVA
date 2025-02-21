import java.util.Date;
import java.util.Scanner;

public class EjemploAutomovil {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String fabricante,modelo,color;
        double cilindrada;
        int deposito;
        Date fecha = new Date();
        Automovil seat = new Automovil("Seat","Leon","Gris",2.0,50);

        System.out.println("auto = " + seat);

        Automovil audi = new Automovil("Audi","Q8","Blanco",3.0,60);

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


        Automovil kia = new Automovil(fabricante,modelo,color,cilindrada,deposito);

        System.out.println(kia.calcularConsumo(20,60));

        //Comparando con equals ambos objetos si son iguales.
        System.out.println(kia.equals(audi));
        System.out.println(kia==audi);
        System.out.println("kia = " + kia);



        sc.close();
    }
}
