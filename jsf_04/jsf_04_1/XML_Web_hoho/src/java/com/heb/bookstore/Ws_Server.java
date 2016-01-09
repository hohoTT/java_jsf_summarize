/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heb.bookstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author user
 */
@WebService(serviceName = "Ws_Server")
public class Ws_Server {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web 服务操作
     * 服务：查询图书详细信息
     */
    @WebMethod(operationName = "searchBook")
    public String searchBook(@WebParam(name = "book_name") String book_name) {
        String sql = "select * from BOOKSTORE.DETAILS where bookname = ?"; //sql
        List<String> result = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/BookStore", 
                                                      "BookStore", "admin"); //URL dn_name user_password
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, book_name);
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()){
                result.add(resultSet.getString("bookname") + ",");
                result.add(resultSet.getString("authorname") + ",");
                result.add(resultSet.getString("publishingyear") + ",");
                result.add(resultSet.getString("price") + ",");
                result.add(resultSet.getString("description") + ",");
                result.add(resultSet.getString("isbn") + "\n");
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ws_Server.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Ws_Server.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if(resultSet != null){
                try {
                    resultSet.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Ws_Server.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Ws_Server.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Ws_Server.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        return result.toString();
    }
}
