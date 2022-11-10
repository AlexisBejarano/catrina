package mx.itson.DB;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Alexis Bejarano
 */
public class Movimiento {
    private Date fecha;
    private String descripcion;
    private String cantidad;
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String deposito) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}