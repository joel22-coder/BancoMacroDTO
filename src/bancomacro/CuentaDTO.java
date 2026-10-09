/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancomacro;

/**
 *
 * @author Usuario
 */
public class CuentaDTO {
    private String numcuenta;

    public CuentaDTO(String numcuenta) {
        this.numcuenta = numcuenta;
    }

    public String getNumcuenta() {
        return numcuenta;
    }

    @Override
    public String toString() {
        return "CuentaDTO{" + "numcuenta=" + numcuenta + '}';
    }
    
}


