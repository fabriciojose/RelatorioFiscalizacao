/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexaosql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fabmu
 */
public class Conexao {
    
    public Connection Connect() {
        try {
            String URL = "jdbc:mysql://br234.hostgator.com.br:2083/somde078_EstudosMySQL";
            String USER = "somde078";
            String PASSWORD = "1.juetania";
        
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            return conn;
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
        //primeiro push
    
}}
