/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.agencia.logica;

import java.util.Date;

/**
 *
 * @author edyns
 */
public class ViajeIndividual extends Viaje{
    //ATRIBUTOS
    //CONSTRUCTOR
    public ViajeIndividual(){}
    public ViajeIndividual(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
    }
    //METODOS
     @Override
    public String descripcion(){
        return "disfruta de tu viaje individual";
    }
    //SET AND GET
}
