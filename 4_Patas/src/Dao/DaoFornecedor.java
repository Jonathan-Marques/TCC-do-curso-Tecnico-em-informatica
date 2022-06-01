/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import modelo.ModFornecedor;
import Conexao.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author dota-
 */
public class DaoFornecedor {
    ConexaoBD con = new ConexaoBD();
    
   public void Salvar(ModFornecedor mod){
       
    con.conexao();
        
        try {
            PreparedStatement pst = con.connection.prepareStatement("insert into fornecedor(fornecedor_nome, fornecedor_endereco, fornecedor_bairro, fornecedor_cidade, fornecedor_estado, fornecedor_cnpj, fornecedor_telefone) values (?,?,?,?,?,?,?)");
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getEndereco());
            pst.setString(3,mod.getBairro());
            pst.setString(4,mod.getCidade());
            pst.setString(5,mod.getEstado());
            pst.setString(6,mod.getCnpj());
            pst.setString(7, mod.getTelefone());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Fornecedor Cadastrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastra!"+ex );
        }
        
        con.desconecta();
    }
    
    public void Editar(ModFornecedor  mod){
        
        con.conexao();
        
        try {
            PreparedStatement pst = con.connection.prepareStatement("update fornecedor set fornecedor_nome=?, fornecedor_endereco=?, fornecedor_bairro=?, fornecedor_cidade=?, fornecedor_estado=?, fornecedor_cnpj=?, fornecedor_telefone=? where id_fornecedor=? ");
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getEndereco());
            pst.setString(3,mod.getBairro());
            pst.setString(4,mod.getCidade());
            pst.setString(5,mod.getEstado());
            pst.setString(6,mod.getCnpj());
            pst.setString(7,mod.getTelefone());
            pst.setInt(8,mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Fornecedor alterado com sucesso!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro na alteração dos dados!"+ex);
        }
        
        con.desconecta();
    }
    
    public ModFornecedor buscaFornecedor(ModFornecedor mod){
        
        con.conexao();
        
         con.executaSQL("select * from fornecedor where fornecedor_nome like'%"+mod.getPesquisa()+"%'");
         
        
             
        try {
            con.rs.first();
            mod.setId(con.rs.getInt("id_fornecedor"));
            mod.setNome(con.rs.getString("fornecedor_nome"));
            mod.setEndereco(con.rs.getString("fornecedor_endereco")); 
            mod.setBairro(con.rs.getString("fornecedor_bairro"));
            mod.setCidade(con.rs.getString("fornecedor_cidade")); 
            mod.setEstado(con.rs.getString("fornecedor_estado")); 
            mod.setCnpj(con.rs.getString("fornecedor_cnpj")); 
            mod.setTelefone(con.rs.getString("fornecedor_telefone")); 
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Fornecedor não cadastrado!"+ex);
        }
                       
        con.desconecta();
        return mod;
    }
    
    public void Excluir (ModFornecedor mod){
        con.conexao();
           try {
            PreparedStatement pst = con.connection.prepareStatement("delete from fornecedor where id_fornecedor=?");
            pst.setInt(1, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "fornecedor excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!");
        }
        
        con.desconecta();
    }    
   
    
}
