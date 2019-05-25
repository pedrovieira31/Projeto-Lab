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
public class Veiculo {
    String modelo, placa, tipoComb, motor;
    int ano, km;

    public Veiculo(String modelo, String placa, String tipoComb, String motor, int ano, int km) {
        this.modelo = modelo;
        this.placa = placa;
        this.tipoComb = tipoComb;
        this.motor = motor;
        this.ano = ano;
        this.km = km;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoComb() {
        return tipoComb;
    }

    public void setTipoComb(String tipoComb) {
        this.tipoComb = tipoComb;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
    
    public void mostrarKm(){
        System.out.println("A última quilometragem registrada do veículo com a placa "+ getPlaca()+" é de: "+getKm());
    }
}
