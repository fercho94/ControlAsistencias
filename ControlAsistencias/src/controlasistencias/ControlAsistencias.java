package controlasistencias;

import java.util.Scanner;

public class ControlAsistencias {

    public static void main (String[] args) {
        boolean Continuar = true;
        //Crear archivo "datos.txt" si no existe
        Archivo archivo = new Archivo();
        archivo.CrearArchivos();
        //Solicitar datos de la persona
        Personas persona = new Personas();
        Scanner Teclado = new Scanner(System.in);
        //Escribir datos de usuario en txt
        Archivo imprimir = new Archivo();
        String Seleccion = "";
        while (Continuar == true) {
            persona.DatosPersonales(persona);
            archivo.EscribirEnArchivo(persona);
            System.out.print("Desea agregar otra persona? S/N");
            System.out.print("");
            Seleccion = Teclado.nextLine();
            if (Seleccion.equalsIgnoreCase("S")) {
                Continuar = true;
            } else if (Seleccion.equalsIgnoreCase("N")) {
                Continuar = false;
                System.out.println("Gracias por usar el programa");
                System.out.println("");
            } else {
                System.out.println("Opcion no valida");
            }
        }
        //Imprimir lista de usuarios
        System.out.println("Lista de usuarios registrados:");
        imprimir.ImprimirDatos();
    }
}
