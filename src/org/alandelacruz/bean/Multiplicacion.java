/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.alandelacruz.bean;

/**
 * 
 * @author Alan Eduardo De La Cruz Najera
 * @date 21 abr. 2021
 * @time 14:18:25
 * Carnet:2020390
 * Codigo Tecnico: IN5BV
 */
public class Multiplicacion extends Operacion{

    @Override
    public float operar(float numero1, float numero2) {
         this.setNumero1(numero1);
         this.setNumero2(numero2);
         this.setOperador('*');
         this.setResultado(this.getNumero1() * this.getNumero2());
         return getResultado();
    }

}
