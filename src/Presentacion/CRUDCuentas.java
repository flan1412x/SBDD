/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;

import Entidad.Cuenta;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author 1214k
 */
public class CRUDCuentas {
     private final String archivo = "src//Presentacion//cuentas.txt/";
    
     public void crearCuenta(Cuenta cuenta) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(archivo, true))) {
            writer.println(cuenta.getId() + ";" + cuenta.getSaldo()+ ";" + cuenta.getTipo()
                            +";" + cuenta.getCedula());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
