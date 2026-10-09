# Clase Principal 

```java
package bancomacro;

/**
 *
 * @author Usuario
 */
public class BancoMacro {

 public static ClienteDTO convertirADTO (Cliente cli) {
     
     return new ClienteDTO (cli.getNombre(), cli.getApellido(), cli.getDNI());
 }
 public static CuentaDTO convertirADTO (Cuenta cuen){
      return new CuentaDTO(cuen.getNumcuenta());
 
 }
    public static void main(String[] args) {
        
        
        Cliente cli = new Cliente(234L, "MARCO", "FERREYRA", "43243", "CIN");
        ClienteDTO cliDTO = convertirADTO(cli);
        System.out.println(cliDTO);
        Cuenta cuen = new Cuenta(454L, "53543", "5000", "123");
        CuentaDTO cueDTO = convertirADTO(cuen);
        System.out.println(cueDTO);
      RespuestaDTO  <ClienteDTO> respuesta = new RespuestaDTO<>(true,"encontrado",cliDTO);
    }
    
}
```
# Clase Cliente
```java

package bancomacro;

/**
 *
 * @author Usuario
 */
public class Cliente {
    private long id;
    private String nombre;
    private String apellido;
    private String DNI;
    private String pass;

    public Cliente(long id, String nombre, String apellido, String DNI, String pass) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.pass = pass;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}
```
# Clase ClienteDTO
```java
package bancomacro;

/**
 *
 * @author Usuario
 */
public class ClienteDTO {
    private String nombre;
    private String apellido;
    private String DNI;

    public ClienteDTO(String nombre, String apellido, String DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDNI() {
        return DNI;
    }

    @Override
    public String toString() {
        return "ClienteDTO{" + "nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + '}';
    }   
}
```
# Clase Cuenta
```java
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
```
# Clase CuentaDTO
```java
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
```
# Clase RespuestaDTO
```java
package bancomacro;

/**
 *
 * @author Usuario
 */
public class RespuestaDTO <T>{
    
    private boolean exito;
    private String mensaje;
    private T datos;

    public RespuestaDTO(boolean exito, String mensaje, T datos) {
        this.exito = exito;
        this.mensaje = mensaje;
        this.datos = datos;
    }

    public boolean isExito() {
        return exito;
    }

    public String getMensaje() {
        return mensaje;
    }

    public T getDatos() {
        return datos;
    }   
}
```

