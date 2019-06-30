/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author dolva
 */
public class Conexao {
    private final String url;
    private final String usuario;
    private final String senha;
    private String stg;
    private Connection con;
    private Statement stmt;
    
    Conexao(){
        url = "jdbc:postgresql://localhost:5432/Karrara_Taxi";
        usuario = "postgres";
        senha = "haninha";
        
        con = null;
        stmt = null;
    }
    public boolean Conectar(){
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url,usuario,senha);
            System.out.println("Conexão realizada com sucesso!");
            return true;
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Erro ao conectar!" +e);
            return false;
        }
    }
    public boolean Desconectar(){
            try {
                con.close();
                System.out.println("Conexão desfeita com sucesso!");
                return true;
            } catch (SQLException e) {
                System.err.println("Erro ao desconectar"+e);
                return false;
            }
    
    }
    
    public boolean deletardoBanco(String stng){
        try {
            stmt = con.createStatement();
            stmt.executeUpdate(stng);
            System.out.println("Exclusão realizada com sucesso!");
            return true;
        } catch (SQLException e) {
            System.err.println("Erro ao deletar"+e);
            return false;
        } 
    }
    
    public boolean updateBanco(String stng){
        try {
            stmt = con.createStatement();
            stmt.executeUpdate(stng);
            System.out.println("Atualização do banco realizada com sucesso!");
            return true;
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar banco!"+e);
            return false;
        }
    
    }
    
    public ResultSet selectBanco(String stng){
        try {
            ResultSet resultado;
            stmt = con.createStatement();
            resultado = stmt.executeQuery(stng);
            System.out.println("Busca no banco realizada com sucesso!");
            return resultado;
        } catch (SQLException e) {
            System.err.println("Erro ao inserir no banco!"+e);
            return null;
        }
    
    }
    
   /* public ArrayList<Motorista> viewMotoBanco(Connection con) throws SQLException{
        ArrayList<Motorista> listaMoto = new ArrayList<Motorista>();
        String sql = "SELECT * FROM public.\"Motorista\"";
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            listaMoto.add(new Motorista(rs.getString("Nome"),rs.getString("Idade"),rs.getString("CPF"),rs.getString("Endereco"),rs.getString("email"),rs.getString("Telefone"),rs.getString("Habitacao"),rs.getString("Placa Veiculo")));
            
        }
        return listaMoto;
    }*/
    
}
