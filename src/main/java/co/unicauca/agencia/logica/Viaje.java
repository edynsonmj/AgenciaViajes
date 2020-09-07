
package co.unicauca.agencia.logica;

import java.util.Date;

/**
 *clase general sobre viaje
 * @author edynson muñoz jimenez
 */
public abstract class Viaje {
    //ATRIBUTOS
    protected String  origen;
    protected String destino;
    protected int costo;
    protected Date fechaSalida;
    protected Date fechaLlegada;
    //CONSTRUCTORES
    public Viaje(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada){
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
    }
    public Viaje() {
        this.origen = "";
        this.destino = "";
        this.costo = 0;
        this.fechaSalida = null;
        this.fechaLlegada = null;
    }
    //METODOS
    public abstract String descripcion();
    public String cualquierMetodo(){
        return "cualquier metodo implementado en la clase base";
    }
    public String cualquierMetodo2(){
        return "Cualquier metodo2 implementado en la clase base";
    }
    //SET AND GET

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    
}
