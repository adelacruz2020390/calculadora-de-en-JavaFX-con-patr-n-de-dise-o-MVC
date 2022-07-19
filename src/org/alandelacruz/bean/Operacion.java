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
 * @time 14:08:18
 * Carnet:2020390
 * Codigo Tecnico: IN5BV
 */
public abstract class Operacion {
    //atributos
    private float numero1;
    private float numero2;
    private float resultado;
    private float operador;
    //contructor

    public Operacion() {
        
    }
    //metodos setters getters;

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public float getOperador() {
        return operador;
    }

    public void setOperador(float operador) {
        this.operador = operador;
    }
    
    public abstract float operar(float numero1,float numero2);
    
    @Override
    public String toString(){
        return "" + this.getNumero1() + " " + this.getOperador() + " " + this.getNumero2() + "=" +this.getResultado();
    }
    
    

}
