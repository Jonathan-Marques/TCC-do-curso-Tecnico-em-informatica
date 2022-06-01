/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;
/**
 *
 * @author Jonathan
 */
import java.sql.Connection; // conexão SQL para Java
import java.sql.DriverManager; // driver de conexão SQL para Java
import java.sql.SQLException; // classe para tratamento de exceções
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexaoBD {
    
public void executaSQL(String sql) { 
          try {
           stm = connection.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
           rs = stm.executeQuery(sql);
           } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"ERRO: " + ex.getMessage());
       }
  }
    
       public Statement stm;// responsavel por preparar e realizar pesquisa no banco de dados
       public ResultSet rs;// responsavel por armazenar o resultado de uma pesquisa passada para o statement
       private String driver = "com.mysql.jdbc.Driver";// responsavel por identificar o serviço de banco de dados
       private String caminho = "jdbc:mysql://localhost:3306/quatropatas";// responsavel por setar o local do banco de dados
       private String usuario = "root";
       private String senha = "admin";
       public Connection connection;// responsavel por realiza conecxão com banco de dados
       
  public void conexao(){// metodo responsavel do driver de conexão
           try {//tentativa inicial
           System.setProperty("jdbc.Drivers", driver);// seta a propriedade do driver de conexão
           connection= DriverManager.getConnection(caminho, usuario, senha);// realizar a conexão com o banco
           } catch (SQLException ex) {// excessão
               Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
           }
       
        }
  
 
  
  public void desconecta(){//metodo para feichar a conexao com banco de dados
      
      try{
          connection.close();// fechar a conexão
       } catch (SQLException ex) {    
      
  }
  
  }     
  }
