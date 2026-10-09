/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancomacro;

/**
 *
 * @author Usuario
 */
public class Cuenta {
    private long id;
    private String numcuenta;
    private  String saldo ;
    private String password;

    public Cuenta(long id, String numcuenta, String saldo, String password) {
        this.id = id;
        this.numcuenta = numcuenta;
        this.saldo = saldo;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(String numcuenta) {
        this.numcuenta = numcuenta;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "id=" + id + ", numcuenta=" + numcuenta + ", saldo=" + saldo + ", password=" + password + '}';
    }
    
    
    
}
