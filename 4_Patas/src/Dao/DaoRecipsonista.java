/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Conexao.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.ModRecipsonista;

/**
 *
 * @author dota-
 */
public class DaoRecipsonista {
    
    ConexaoBD conn = new ConexaoBD();
     
    
    public void Salvar(ModRecipsonista mod){
        conn.conexao();
        
        try {
            PreparedStatement pst = conn.connection.prepareStatement("insert into recipsonista(r_nome, r_cpf, r_rg, r_email, r_telefone, r_celular, r_datanasci, r_endereco, r_bairro, r_cidade, r_estado) values (?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getCpf());
            pst.setString(3,mod.getRg());
            pst.setString(4,mod.getEmail());
            pst.setString(5,mod.getTelefone());
            pst.setString(6,mod.getCelular());
            pst.setDate(7, new java.sql.Date(mod.getDatasci().getTime()));
            pst.setString(8,mod.getEndereco());
            pst.setString(9,mod.getBairro());
            pst.setString(10,mod.getCidade());
            pst.setString(11,mod.getEstado());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Recipsonista Cadastrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastra!"+ex );
        }
        
        conn.desconecta();
    }
    
    public void Editar(ModRecipsonista mod){
        
        conn.conexao();
        
        try {
            PreparedStatement pst = conn.connection.prepareStatement("update recipsonista set r_nome=?, r_cpf=?, r_rg=?, r_email=?, r_telefone=?, r_celular=?, r_datanasci=?, r_endereco=?, r_bairro=?, r_cidade=?, r_estado=? ");
           pst.setString(1,mod.getNome());
            pst.setString(2,mod.getCpf());
            pst.setString(3,mod.getRg());
            pst.setString(4,mod.getEmail());
            pst.setString(5,mod.getTelefone());
            pst.setString(6,mod.getCelular());
            pst.setDate(7, new java.sql.Date(mod.getDatasci().getTime()));
            pst.setString(8,mod.getEndereco());
            pst.setString(9,mod.getBairro());
            pst.setString(10,mod.getCidade());
            pst.setString(11,mod.getEstado());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Recipsonista editado com sucesso!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro na alteração dos dados!");
        }
        
        conn.desconecta();
    }
    
    public ModRecipsonista buscaRecipsonista(ModRecipsonista mod){
        
        conn.conexao();
        
         conn.executaSQL("select * from recipsonista where r_nome like'%"+mod.getPesquisa()+"%'");
         
        
             
        try {
            conn.rs.first();
            mod.setId(conn.rs.getInt("id_recipsonista"));
            mod.setNome(conn.rs.getString("r_nome")); 
            mod.setCpf(conn.rs.getString("r_cpf"));
            mod.setRg(conn.rs.getString("r_rg")); 
            mod.setEmail(conn.rs.getString("r_email")); 
            mod.setTelefone(conn.rs.getString("r_telefone")); 
            mod.setCelular(conn.rs.getString("r_celular")); 
            mod.setDatasci(conn.rs.getDate("r_datanasci")); 
            mod.setEndereco(conn.rs.getString("r_endereco")); 
            mod.setBairro(conn.rs.getString("r_bairro")); 
            mod.setCidade(conn.rs.getString("r_cidade")); 
            mod.setEstado(conn.rs.getString("r_estado"));
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Recipsonista não cadastrado!");
        }
                       
        conn.desconecta();
        return mod;
    }
    
    public void Excluir (ModRecipsonista mod){
        conn.conexao();
           try {
            PreparedStatement pst = conn.connection.prepareStatement("delete from recipsonista where id_recipsonista=?");
            pst.setInt(1, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Recipsonista excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!");
        }
        
        conn.desconecta();
    }
    
}
