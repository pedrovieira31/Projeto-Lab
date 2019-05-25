/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolab;

import java.util.Scanner;

/**
 *
 * @author dolva
 */
public class Gerente extends Funcionario {

    String telComercial, RG;

    public Gerente(String telComercial, String RG, String nome, String endereço, String email, int idade, int ID, double cpf, double telefone) {
        super(nome, endereço, email, idade, ID, cpf, telefone);
        this.telComercial = telComercial;
        this.RG = RG;
    }

    public String getTelComercial() {
        return telComercial;
    }

    public void setTelComercial(String telComercial) {
        this.telComercial = telComercial;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getEndereço() {
        return endereço;
    }

    @Override
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public double getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    @Override
    public double getTelefone() {
        return telefone;
    }

    @Override
    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }

    @Override
    public float getSalario() {
        return salario;
    }

    @Override
    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void registrarViagem() {
        Scanner ler = new Scanner(System.in);
        float horaIn, horaOut, valor;
        System.out.println("Entre com o horário de inicio:\n");
        horaIn = ler.nextFloat();
        System.out.println("Entre com o horário de término:\n");
        horaOut = ler.nextFloat();
        System.out.println("Entre com o valor da corrida:\n");
        valor = ler.nextFloat();
    }
    
    public void registrarVeiculo(){
        Scanner ler = new Scanner(System.in);
        String placa, modelo,tipoComb,motor;
        int ano;
        System.out.println("Entre com a placa do veículo:\n");
        placa = ler.next();
        System.out.println("Entre com o modelo do veículo:\n");
        modelo = ler.next();
        System.out.println("Entre com o ano do veículo:\n");
        ano = ler.nextInt();
        System.out.println("Entre com o tipo de combustível do veículo:\n");
        tipoComb = ler.next();
        System.out.println("Entre com o motor do veículo:\n");
        motor = ler.next();
    }
    
    public void registrarMotorista(){
        Scanner ler = new Scanner(System.in);
        String nome, endereço, email,vencHab,hab,placaVeic;
        int idade, ID;
        double tel, cpf;
        System.out.println("Entre com o nome do motorista:\n");
        nome = ler.next();
        System.out.println("Entre com o CPF do motorista:\n");
        cpf = ler.nextDouble();
        System.out.println("Entre com a idade do motorista:\n");
        idade = ler.nextInt();
        System.out.println("Entre com o endereço do motorista:\n");
        endereço = ler.next();
        System.out.println("Entre com o e-mail do motorista:\n");
        email = ler.next();
        System.out.println("Entre com o telefone do motorista:\n");
        tel = ler.nextDouble();
        System.out.println("Entre com o código do motorista:\n");
        ID = ler.nextInt();
        System.out.println("Entre com a habilitação do motorista:\n");
        hab = ler.next();
        System.out.println("Entre com o vecimento da habilitação do motorista:\n");
        vencHab = ler.next();
        System.out.println("Entre com a placa do veículo do motorista:\n");
        placaVeic = ler.next();
    }

    @Override
    public float calculoSalario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
