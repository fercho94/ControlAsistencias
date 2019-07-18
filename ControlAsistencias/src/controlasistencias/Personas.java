package controlasistencias;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Personas {

    public String nombre;
    public String apellido;
    public String cedula;
    public int edad;
    public Date fechaLlegada;
    public String horaLlegada;
    //public int AcumEdad = 0;

    public Personas DatosPersonales(Personas personas) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Igrese el nombre");
        nombre = entrada.next();

        System.out.println("Igrese el apellido");
        apellido = entrada.next();

        System.out.println("Igrese la cédula");
        cedula = entrada.next();

        System.out.println("Igrese la edad");
        edad = entrada.nextInt();
        //AcumEdad = +edad;

        SimpleDateFormat formato = new SimpleDateFormat("yy-MM-dd/HH:mm");
        fechaLlegada = new Date();
        horaLlegada = fechaLlegada.getHours()+":"+fechaLlegada.getMinutes();
        //System.out.println("Hora de entrada " + formato.format(horaLlegada));*/

        return (personas);

    }

}
