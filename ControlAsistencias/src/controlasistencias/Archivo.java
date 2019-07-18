package controlasistencias;

import java.io.*;
import java.util.*;

public class Archivo {

    public Scanner entrada;
    BufferedReader br;
    FileReader frTxt;
    FileWriter fwTxt;
    PrintWriter pwTxt;
    String rutaArchivo = "datos.txt";
    public int ContUsuarios = 0;
    public int AcumEdad = 0;
    public int Promedio = 0;
    public void CrearArchivos() {
        try {
            File archivo = new File(rutaArchivo);
            archivo.createNewFile();
        } catch (Exception e) {
            System.err.println("Se presentó un problema al crear el archivo " + e);
        }
    }

    public void EscribirEnArchivo(Personas personas) {
        try {
            fwTxt = new FileWriter(rutaArchivo, true);
            pwTxt = new PrintWriter(fwTxt);
            pwTxt.print(personas.nombre + ";");
            pwTxt.print(personas.apellido + ";");
            pwTxt.print(personas.cedula + ";");
            pwTxt.print(personas.edad + ";");
            pwTxt.print(personas.horaLlegada);
            pwTxt.println("");
            pwTxt.flush();
            pwTxt.close();
        } catch (Exception e) {
            System.err.println("Se presentó un prolema al copiar en el archivo" + e);
        }
    }

    public void ImprimirDatos() {
        String texto = "";
        try {
            frTxt = new FileReader(rutaArchivo);
            br = new BufferedReader(frTxt);
            while ((texto = br.readLine()) != null) {
                String[] arr = texto.split(";");
                AcumEdad = (AcumEdad + Integer.parseInt(arr[3]));
                ContUsuarios++;
                System.out.println(arr[0]+" "+arr[1]);
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo");
        }
        Promedio = (AcumEdad / ContUsuarios);
        System.out.println("EL promedio de edades de los usuarios que ingresaron es de: " + Promedio);
    }
}
