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
public class ViajeTodoIncluido extends Viaje{
    //ATRIBUTOS
    //CONSTRUCTORES
    public ViajeTodoIncluido(){}
    public ViajeTodoIncluido(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
    }
    //METODOS
    public String descripcion(){
        return "disfruta de tu viaje todo incluido";
    }
}
