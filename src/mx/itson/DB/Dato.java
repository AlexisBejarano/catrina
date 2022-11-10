package mx.itson.DB;

import com.google.gson.Gson;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Alexis Bejarano
 */
public class Dato {
    private String cuenta;
    private String clabe;
    private String moneda;
    private String codigo;    
    private Date fecha;
    private List<Movimiento> movimientos;
    private Cliente cliente;
    
    
    public Dato deserializar (String json){
        Dato dato = new Dato();
        try{
            dato= new Gson().fromJson(json, Dato.class);
            
        }catch(Exception e){
            System.err.print("Ocurrio un error: "+e.getMessage());
        }
        return dato;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }  
    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
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

    /**
     * @return the movimientos
     */
    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    /**
     * @param movimientos the movimiento to set
     */
    public void setMovimientos(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

}

