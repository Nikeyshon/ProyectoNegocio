package modelo.pojo;
// Generated 22/05/2017 04:20:50 by Hibernate Tools 4.3.1



/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private Integer codigo;
     private String nombre;
     private String direccion;
     private String telefono;
     private String cuit;
     private Integer cp;
     private Double saldo;
     private Double deuda;

    public Cliente() {
    }

    public Cliente(String nombre, String direccion, String telefono, String cuit, Integer cp, Double saldo, Double deuda) {
       this.nombre = nombre;
       this.direccion = direccion;
       this.telefono = telefono;
       this.cuit = cuit;
       this.cp = cp;
       this.saldo = saldo;
       this.deuda = deuda;
    }
   
    public Integer getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCuit() {
        return this.cuit;
    }
    
    public void setCuit(String cuit) {
        this.cuit = cuit;
    }
    public Integer getCp() {
        return this.cp;
    }
    
    public void setCp(Integer cp) {
        this.cp = cp;
    }
    public Double getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public Double getDeuda() {
        return this.deuda;
    }
    
    public void setDeuda(Double deuda) {
        this.deuda = deuda;
    }




}


