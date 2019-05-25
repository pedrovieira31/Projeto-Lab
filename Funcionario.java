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
public abstract class Funcionario {
    String nome, endereço, email;
    int idade, ID;
    double cpf, telefone;
    float salario;

    public Funcionario(String nome, String endereço, String email, int idade, int ID, double cpf, double telefone) {
        this.nome = nome;
        this.endereço = endereço;
        this.email = email;
        this.idade = idade;
        this.ID = ID;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public float getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    public int getID() {
        return ID;
    }

    public double getCpf() {
        return cpf;
    }

    public double getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    /**
     *
     * @return
     */
    public abstract float calculoSalario();
}
