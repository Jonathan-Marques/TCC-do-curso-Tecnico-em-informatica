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
import modelo.ModProprietario;

/**
 *
 * @author dota-
 */
public class DaoProprietario {
    
ConexaoBD conn = new ConexaoBD();
     
    
    public void Salvar(ModProprietario proprietario){
        conn.conexao();
        
        try {
            PreparedStatement pst = conn.connection.prepareStatement("insert into cliente(nome_proprietario, RG, cpf, sexo_proprietario, data_nasci, telefone, celular, email, nome_rua, numero_casa, cep, bairro, estado, cidade) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1,proprietario.getNomeProprietario());
            pst.setString(2,proprietario.getRg());
            pst.setString(3,proprietario.getCpf());
            pst.setString(4,proprietario.getSexoPro());
            pst.setString(5,proprietario.getDatanascimentoProietario());
            pst.setString(6,proprietario.getTelefone());
            pst.setString(7,proprietario.getCelular());
            pst.setString(8,proprietario.getEmail());
            pst.setString(9,proprietario.getRua());
            pst.setString(10,proprietario.getNumero());
            pst.setString(11,proprietario.getCep());
            pst.setString(12,proprietario.getBairro());
            pst.setString(13,proprietario.getEstado());
            pst.setString(14,proprietario.getCidade());
            pst.execute();
            JOptionPane.showMessageDialog(null, " Proprietario Cadastrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastra!"+ex );
        }
        
        conn.desconecta();
    }
    
    public void Editar(ModProprietario mod){
        
        conn.conexao();
        
        try {
            PreparedStatement pst = conn.connection.prepareStatement("update cliente set nome_proprietario=?, rg=?, cpf=?, sexo_proprietario=?, data_nasci=?, telefone=?, celular=?, email=?, nome_rua=?, numero_casa=?, cep=?, bairro=?, estado=?, cidade=?");
            pst.setString(1,mod.getNomeProprietario());
            pst.setString(2,mod.getRg());
            pst.setString(3,mod.getCpf());
            pst.setString(4,mod.getSexoPro());
            pst.setString(5,mod.getDatanascimentoProietario());
            pst.setString(6,mod.getTelefone());
            pst.setString(7,mod.getCelular());
            pst.setString(8,mod.getEmail());
            pst.setString(9,mod.getRua());
            pst.setString(10,mod.getNumero());
            pst.setString(11,mod.getCep());
            pst.setString(12,mod.getBairro());
            pst.setString(13,mod.getEstado());
            pst.setString(14,mod.getCidade());
            JOptionPane.showMessageDialog(null, "Proprietario alterado com sucesso!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro na alteração dos dados!"+ex);
        }
        
        conn.desconecta();
    }
    
    public ModProprietario buscaProprietario(ModProprietario mod){
        
        conn.conexao();
        
        conn.executaSQL("select * from cliente where nome_proprietario like'%"+mod.getPesquisa()+"%'");
        try {
            conn.rs.first();
            mod.setId(conn.rs.getInt("cod_proprietario"));
            mod.setNomeProprietario(conn.rs.getString("nome_proprietario")); 
            mod.setRg(conn.rs.getString("RG"));
            mod.setCpf(conn.rs.getString("cpf"));
            mod.setSexoPro(conn.rs.getString("sexo_proprietario"));
            mod.setDatanascimentoProietario(conn.rs.getString("data_nasci"));
            mod.setTelefone(conn.rs.getString("telefone"));
            mod.setCelular(conn.rs.getString("celular"));
            mod.setEmail(conn.rs.getString("email"));
            mod.setRua(conn.rs.getString("nome_rua"));
            mod.setNumero(conn.rs.getString("numero_casa"));
            mod.setCep(conn.rs.getString("cep"));
            mod.setBairro(conn.rs.getString("bairro"));
            mod.setEstado(conn.rs.getString("estado"));
            mod.setCidade(conn.rs.getString("cidade"));
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dono de Animal não cadastrado!");
        }
                       
        conn.desconecta();
        return mod;
        
    }
    
    public ModProprietario buscaProprietarioCPF(ModProprietario mod){
        
        conn.conexao();
        
        conn.executaSQL("select * from cliente where cpf like'%"+mod.getPesquisa()+"%'");
        try {
            conn.rs.first();
            mod.setId(conn.rs.getInt("cod_proprietario"));
            mod.setNomeProprietario(conn.rs.getString("nome_proprietario")); 
            mod.setRg(conn.rs.getString("RG"));
            mod.setCpf(conn.rs.getString("cpf"));
            mod.setSexoPro(conn.rs.getString("sexo_proprietario"));
            mod.setDatanascimentoProietario(conn.rs.getString("data_nasci"));
            mod.setTelefone(conn.rs.getString("telefone"));
            mod.setCelular(conn.rs.getString("celular"));
            mod.setEmail(conn.rs.getString("email"));
            mod.setRua(conn.rs.getString("nome_rua"));
            mod.setNumero(conn.rs.getString("numero_casa"));
            mod.setCep(conn.rs.getString("cep"));
            mod.setBairro(conn.rs.getString("bairro"));
            mod.setEstado(conn.rs.getString("estado"));
            mod.setCidade(conn.rs.getString("cidade"));
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dono de Animal não cadastrado!");
        }
                       
        conn.desconecta();
        return mod;
    }
    
    public void Excluir (ModProprietario mod){
        conn.conexao();
           try {
            PreparedStatement pst = conn.connection.prepareStatement("delete from cliente where cod_proprietario=?");
            pst.setInt(1, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Proprietario excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!");
        }
        
        conn.desconecta();
    }
}    

