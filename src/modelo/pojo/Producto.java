package modelo.pojo;
// Generated 27/07/2017 15:38:07 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Producto generated by hbm2java
 */
public class Producto  implements java.io.Serializable {


     private Integer codigo;
     private String nombre;
     private String descripcion;
     private Date fecha;
     private Double precio;
     private Integer stock;
     private Integer proveedor;
     private Integer rubro;
     private Integer subRubro;
     private Boolean estado;
     private Date fechaModificacion;

    public Producto() {
    }

    public Producto(String nombre, String descripcion, Date fecha, Double precio, Integer stock, Integer proveedor, Integer rubro, Integer subRubro, Boolean estado, Date fechaModificacion) {
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.fecha = fecha;
       this.precio = precio;
       this.stock = stock;
       this.proveedor = proveedor;
       this.rubro = rubro;
       this.subRubro = subRubro;
       this.estado = estado;
       this.fechaModificacion = fechaModificacion;
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
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Double getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public Integer getStock() {
        return this.stock;
    }
    
    public void setStock(Integer stock) {
        this.stock = stock;
    }
    public Integer getProveedor() {
        return this.proveedor;
    }
    
    public void setProveedor(Integer proveedor) {
        this.proveedor = proveedor;
    }
    public Integer getRubro() {
        return this.rubro;
    }
    
    public void setRubro(Integer rubro) {
        this.rubro = rubro;
    }
    public Integer getSubRubro() {
        return this.subRubro;
    }
    
    public void setSubRubro(Integer subRubro) {
        this.subRubro = subRubro;
    }
    public Boolean getEstado() {
        return this.estado;
    }
    
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    public Date getFechaModificacion() {
        return this.fechaModificacion;
    }
    
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }




}


