/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.agencia.logica;

import java.util.Date;

/**
 *
 * @author edynson muñoz jimenez
 */
public class ViajeFamiliar extends Viaje{
    //ATRIBUTOS
    /**
     * cantidad de integrantes de la familia
     */
    private int familia;
    //COSTRUCTORES
    public ViajeFamiliar(){
        this.familia = 0;
    }
    public ViajeFamiliar(int familia) {
        this.familia = familia;
    }

    public ViajeFamiliar( String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada,int familia) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.familia = familia;
    }

  
    //METODOS
    @Override
    public String descripcion(){
        return "viaje para disfrutar con toda la familia";
    }
    @Override
    public String cualquierMetodo2(){
        return "Metodo implementadoen la clase hija viaje familiar";
    }
    //SET AND GET
    public int getFamilia() {
        return familia;
    }

    public void setFamilia(int familia) {
        this.familia = familia;
    }
}
