/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenas;

/**
 *
 * @author reroes
 */
public class DemoCadenas031 {
    public static void main(String[] args) {
        String pais = "Ecuador";
        String ciudad = "Loja";
        int fechaIndependencia = 39;
        String cadenaAcumuladora = "Datos del pais\n";
        
        cadenaAcumuladora = String.format("%s%s\n", cadenaAcumuladora, pais);
        
        cadenaAcumuladora = String.format("%s%s\n", cadenaAcumuladora, ciudad);
        
        cadenaAcumuladora = String.format("%s%s\n", cadenaAcumuladora, 
                fechaIndependencia);
        
        System.out.printf("%s", cadenaAcumuladora);
        
    }
}
