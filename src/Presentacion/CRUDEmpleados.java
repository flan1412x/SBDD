/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Entidad.Empleado;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Daniel Galarza
 */
public class CRUDEmpleados {
    //Poner la Ruta del archivo Pasposos
    private final String archivo = "src//Presentacion//empleados.txt/";

    public void crearEmpleado(Empleado empleado) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(archivo, true))) {
            writer.println(empleado.getCedula() + ";" + empleado.getNombre()+ ";" + empleado.getApellido()
                            +";" + empleado.getGenero()+";" + empleado.getEdad());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
