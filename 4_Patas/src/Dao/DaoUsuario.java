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
import modelo.ModUsuario;

/**
 *
 * @author Jonathan
 */
public class DaoUsuario {
    
    ConexaoBD conn = new ConexaoBD();
     
    
    public void Salvar(ModUsuario usuario){
        conn.conexao();
        
        try {
            PreparedStatement pst = conn.connection.prepareStatement("insert into usuarios(use_nome, use_usuario, use_senha, use_tipo) values (?,?,?,?)");
            pst.setString(1,usuario.getNome());
            pst.setString(2,usuario.getUsuario());
            pst.setString(3,usuario.getSenha());
            pst.setString(4, usuario.getTipo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuario Cadastrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastra!" );
        }
        
        conn.desconecta();
    }
    
    public void Editar(ModUsuario mod){
        
        conn.conexao();
        
        try {
            PreparedStatement pst = conn.connection.prepareStatement("update usuarios set use_nome=?, use_usuario=?, use_senha=?, use_tipo=? where use_cod=? ");
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getUsuario());
            pst.setString(3,mod.getSenha());
            pst.setString(4, mod.getTipo());
            pst.setInt(5, mod.getCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuario alterado com sucesso!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro na alteração dos dados!"+ex);
        }
        
        conn.desconecta();
    }
    
    public ModUsuario buscaUsuario(ModUsuario mod){
        
        conn.conexao();
        
        conn.executaSQL("select * from usuarios where use_usuario like'%"+mod.getPesquisa()+"%'");
        try {
            conn.rs.first();
            mod.setCod(conn.rs.getInt("use_cod"));
            mod.setNome(conn.rs.getString("use_nome")); 
            mod.setUsuario(conn.rs.getString("use_usuario"));
            mod.setSenha(conn.rs.getString("use_senha"));
            mod.setTipo(conn.rs.getString("use_tipo"));
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuario não cadastrado!");
        }
                       
        conn.desconecta();
        return mod;
    }
    
    public void Excluir (ModUsuario mod){
        conn.conexao();
           try {
            PreparedStatement pst = conn.connection.prepareStatement("delete from usuarios where use_cod=?");
            pst.setInt(1, mod.getCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuario excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!");
        }
        
        conn.desconecta();
    }
}
    

