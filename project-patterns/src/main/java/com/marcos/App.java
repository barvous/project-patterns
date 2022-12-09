package com.marcos;

import javax.ws.rs.ApplicationPath;

import com.marcos.factory.DBConnection;
import com.marcos.factory.FactoryConnection;

@ApplicationPath("app")
public class App {

    public static void main(String[] args) {

        final String CONST_MYSQL = "MYSQL"; 
        final String CONST_ORACLE = "ORACLE";

        DBConnection db = FactoryConnection.getConnection(CONST_MYSQL, "marcos.coelho",
         "senha123", "192.168.1.116:8080");

        //  DBConnection db = FactoryConnection.getConnection(CONST_ORACLE, "silas.cunha",
        //   "minecraft", "192.168.1.118:8080");

         db.getDescricao();
         System.out.println(db.toString());

         

    }


}
