/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
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
