/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolab;

/**
 *
 * @author dolva
 */
public class Viagem {
    float horaIn, horaOut, valor;

    public Viagem(float horaIn, float horaOut, float valor) {
        this.horaIn = horaIn;
        this.horaOut = horaOut;
        this.valor = valor;
    }

    public float getHoraIn() {
        return horaIn;
    }

    public void setHoraIn(float horaIn) {
        this.horaIn = horaIn;
    }

    public float getHoraOut() {
        return horaOut;
    }

    public void setHoraOut(float horaOut) {
        this.horaOut = horaOut;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
