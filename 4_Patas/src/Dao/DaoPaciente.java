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
import modelo.ModPaciente;


/**
 *
 * @author dota-
 */
public class DaoPaciente {
ConexaoBD conn = new ConexaoBD();
     
    
    public void Salvar(ModPaciente paciente){
        conn.conexao();
        
        try {
            PreparedStatement pst = conn.connection.prepareStatement("insert into animal(nome_animal, especie, pelagem, sexo_animal, raca, peso, data_nasci, porte, idade, cod_proprietario ) values (?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1,paciente.getNomeAnimal());
            pst.setString(2,paciente.getEspecie());
            pst.setString(3,paciente.getPelagem());
            pst.setString(4,paciente.getSexo());
            pst.setString(5,paciente.getRaça());
            pst.setString(6,paciente.getPeso());
            pst.setString(7,paciente.getDatanascimento());
            pst.setString(8,paciente.getPorte());
            pst.setInt(9,paciente.getIdade());
            pst.setInt(10, paciente.getCodProprietario());
            pst.execute();
            JOptionPane.showMessageDialog(null, " Paciente Cadastrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastra!"+ex );
        }
        
        conn.desconecta();
    }
    
    public void Editar(ModPaciente mod){
        
        conn.conexao();
        
        try {
            PreparedStatement pst = conn.connection.prepareStatement("update animal set cod_animal=?, nome_animal=?, especie=?, pelagem=?, sexo_animal=?, raca=?, peso=?, data_nasci=?, porte=?, idade=?, cod_proprietario=? ");
            pst.setString(1,mod.getNomeAnimal());
            pst.setString(2,mod.getEspecie());
            pst.setString(3,mod.getPelagem());
            pst.setString(4,mod.getSexo());
            pst.setString(5,mod.getRaça());
            pst.setString(6,mod.getPeso());
            pst.setString(7,mod.getDatanascimento());
            pst.setString(8,mod.getPorte());
            pst.setInt(9,mod.getIdade());
            pst.setInt(10,mod.getCodProprietario());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Paciente alterado com sucesso!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro na alteração dos dados!"+ex);
        }
        
        conn.desconecta();
    }
    
    public ModPaciente buscaPaciente(ModPaciente mod){
        
        conn.conexao();
        
        conn.executaSQL("select * from animal where cod_animal like'%"+mod.getPesquisa()+"%'");
        try {
            conn.rs.first();
            mod.setId(conn.rs.getInt("cod_animal"));
            mod.setNomeAnimal(conn.rs.getString("nome_animal")); 
            mod.setEspecie(conn.rs.getString("especie"));
            mod.setPelagem(conn.rs.getString("pelagem"));
            mod.setSexo(conn.rs.getString("sexo_animal"));
            mod.setRaça(conn.rs.getString("raca"));
            mod.setPeso(conn.rs.getString("peso"));
            mod.setDatanascimento(conn.rs.getString("data_nasci"));
            mod.setPorte(conn.rs.getString("Porte"));
            mod.setIdade(conn.rs.getInt("idade"));
            mod.setCodProprietario(conn.rs.getInt("cod_proprietario"));
           
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuario não cadastrado!");
        }
                       
        conn.desconecta();
        return mod;
    }
    
    public void Excluir (ModPaciente mod){
        conn.conexao();
           try {
            PreparedStatement pst = conn.connection.prepareStatement("delete from animal where cod_animal=?");
            pst.setInt(1, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Animal excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!");
        }
        
        conn.desconecta();
    }
}    