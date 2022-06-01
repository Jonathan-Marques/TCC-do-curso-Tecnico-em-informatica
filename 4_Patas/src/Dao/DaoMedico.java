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
import modelo.ModMedico;

/**
 *
 * @author Jonathan
 */
public class DaoMedico {
    
    ConexaoBD conn = new ConexaoBD();
     
    
    public void Salvar(ModMedico medico){
        conn.conexao();
        
        try {
            PreparedStatement pst = conn.connection.prepareStatement("insert into medicos(nome, crm, especialidade, cpf, rg, telefone, celular, email, rua, numero, bairro) values (?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1,medico.getNome());
            pst.setInt(2,medico.getCrmv());
            pst.setString(3,medico.getEspecialidade());
            pst.setString(4,medico.getCpf());
            pst.setString(5,medico.getRg());
            pst.setString(6,medico.getTelefone());
            pst.setString(7,medico.getCelular());
            pst.setString(8,medico.getEmail());
            pst.setString(9,medico.getRua());
            pst.setInt(10,medico.getNumerocasa());
            pst.setString(11,medico.getBairro());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Medico Cadastrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastra!" );
        }
        
        conn.desconecta();
    }
    
    public void Editar(ModMedico mod){
        
        conn.conexao();
        
        try {
            PreparedStatement pst = conn.connection.prepareStatement("update medicos set nome=?, crm=?, especialidade=?, cpf=?, rg=?, telefone=?, celular=?, email=?, rua=?, numero=?, bairro=? where id_medico=? ");
            pst.setString(1, mod.getNome());
            pst.setInt(2, mod.getCrmv());
            pst.setString(3, mod.getEspecialidade());
            pst.setInt(4, mod.getCodigo());
             pst.setString(5,mod.getCpf());
            pst.setString(6,mod.getRg());
            pst.setString(7,mod.getTelefone());
            pst.setString(8,mod.getCelular());
            pst.setString(9,mod.getEmail());
            pst.setString(10,mod.getRua());
            pst.setInt(11,mod.getNumerocasa());
            pst.setString(12,mod.getBairro());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Medico editado com sucesso!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro na alteração dos dados!");
        }
        
        conn.desconecta();
    }
    
    public ModMedico buscaMedico(ModMedico mod){
        
        conn.conexao();
        
         conn.executaSQL("select * from medicos where nome like'%"+mod.getPesquisa()+"%'");
         
        
             
        try {
            conn.rs.first();
            mod.setCodigo(conn.rs.getInt("id_medico"));
            mod.setNome(conn.rs.getString("nome")); 
            mod.setCrmv(conn.rs.getInt("crm"));
            mod.setCpf(conn.rs.getString("cpf")); 
            mod.setRg(conn.rs.getString("rg")); 
            mod.setTelefone(conn.rs.getString("telefone")); 
            mod.setCelular(conn.rs.getString("celular")); 
            mod.setEmail(conn.rs.getString("email")); 
            mod.setRua(conn.rs.getString("rua")); 
            mod.setNumerocasa(conn.rs.getInt("numero")); 
            mod.setBairro(conn.rs.getString("bairro")); 
            mod.setEspecialidade(conn.rs.getString("especialidade"));
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Medico não cadastrado!");
        }
                       
        conn.desconecta();
        return mod;
    }
    
    public void Excluir (ModMedico mod){
        conn.conexao();
           try {
            PreparedStatement pst = conn.connection.prepareStatement("delete from medicos where id_medico=?");
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Medico excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!");
        }
        
        conn.desconecta();
    }
}
