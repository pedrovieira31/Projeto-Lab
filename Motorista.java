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
public class Motorista extends Funcionario{
    String venc_hab, placa_veiculo;
    double habilitaçao;

    public Motorista(String venc_hab, String placa_veiculo, double habilitaçao, String nome, String endereço, String email, int idade, int ID, double cpf, double telefone) {
        super(nome, endereço, email, idade, ID, cpf, telefone);
        this.venc_hab = venc_hab;
        this.placa_veiculo = placa_veiculo;
        this.habilitaçao = habilitaçao;
    }

    public String getVenc_hab() {
        return venc_hab;
    }

    public void setVenc_hab(String venc_hab) {
        this.venc_hab = venc_hab;
    }

    public String getPlaca_veiculo() {
        return placa_veiculo;
    }

    public void setPlaca_veiculo(String placa_veiculo) {
        this.placa_veiculo = placa_veiculo;
    }

    public double getHabilitaçao() {
        return habilitaçao;
    }

    public void setHabilitaçao(double habilitaçao) {
        this.habilitaçao = habilitaçao;
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

    @Override
    public float calculoSalario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
