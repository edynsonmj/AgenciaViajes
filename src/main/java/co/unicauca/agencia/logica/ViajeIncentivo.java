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
public class ViajeIncentivo extends Viaje{
    //ATRIBUTOS
    
    /**
     * Empresa que patrocina el viaje del empleado
     */
    private String empresa;
    
    //CONSTRUCTORES
    public ViajeIncentivo(){
        this.empresa = null;
    }
    public ViajeIncentivo(String empresa){
        this.empresa = empresa;
    }
    public ViajeIncentivo(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada,String empresa) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.empresa = empresa;
    }
    //METODOS
    @Override
    public String descripcion(){
        return "viaje incentivo que te envia la empresa"+this.empresa;
    }
    @Override
    public String cualquierMetodo2(){
        return "metodo implementado en la clase hija viaje de incentivo";
    }
    //SET AND GET

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
}