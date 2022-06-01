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
import modelo.ModAgenda;

/**
 *
 * @author dota-
 */
public class DaoAgenda {
    
   ModAgenda agenda = new ModAgenda();
   ConexaoBD con = new ConexaoBD();
   ConexaoBD conPaciente = new ConexaoBD();
   ConexaoBD conVeterinario = new ConexaoBD();
   
   int codVet;
   int codPac;
   
   public void Salvar (ModAgenda agenda) {
       BuscaVeterinario(agenda.getNomeVeterinario());
       BuscaPaciente(agenda.getNomePaciente());
       con.conexao();
       try{  
       PreparedStatement pst = con.connection.prepareStatement("insert into quatropatas.agenda (agenda_codpaciente, agenda_turno, agenda_codmedico, agenda_data, agenda_motivo, agenda_status ) values(?,?,?,?,?,?)");
       pst.setInt(1, codPac);
       pst.setString(2, agenda.getTurno());
       pst.setInt(3, codVet);
       pst.setDate(4, new java.sql.Date(agenda.getData().getTime()));
       pst.setString(5, agenda.getMotivo());
       pst.setString(6, agenda.getStatus());
       pst.execute();
       
       JOptionPane.showMessageDialog(null, "Agendamento Realizado com Sucesso!");
       }catch (SQLException ex){
         JOptionPane.showMessageDialog(null, "Erro ao Realizado Agendamento!"+ex);
       } 
   } 
    
   public void BuscaVeterinario (String nomeVeterinario){
       conVeterinario.conexao();
       conVeterinario.executaSQL("select * from medicos where nome='"+nomeVeterinario+"'");
       
       try{conVeterinario.rs.first();
           codVet = conVeterinario.rs.getInt("id_medico");
       }catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Veterinario não encontrado!");
           
       }
     
    }
   
   public int BuscaCodVeterinario (String nomeVeterinario){
       conVeterinario.conexao();
       conVeterinario.executaSQL("select * from medicos where nome='"+nomeVeterinario+"'");
       
       try{conVeterinario.rs.first();
           codVet = conVeterinario.rs.getInt("medicos.id_medico");
       }catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Veterinario não encontrado!");
           
       }
    return codVet;
       
    }
    
   
   public void BuscaPaciente (String nomePaciente){
       conPaciente.conexao();
       conPaciente.executaSQL("select * from animal where nome_animal='"+nomePaciente+"'");
       
       try{
          conPaciente.rs.first();
          codPac = conPaciente.rs.getInt("cod_animal");
       }catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Paciente não encontrado!"+ex);
           
       }
   }
   
   public void Altera(ModAgenda mod){
       con.conexao();
       try {
            PreparedStatement pst = con.connection.prepareStatement("update agenda set agenda_status=? where id_agenda=? ");
            pst.setString(1,mod.getStatus());
            pst.setInt(2,mod.getId_agenda());
   
            pst.execute();
            JOptionPane.showMessageDialog(null, "Agendamento em atendimento!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao Realiza o atendimento!");
        }
        
        con.desconecta();
   }
   
}
