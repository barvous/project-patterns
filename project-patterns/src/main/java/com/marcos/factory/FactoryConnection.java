package com.marcos.factory;

public class FactoryConnection {
    
    public static DBConnection getConnection(String nomeDB, String login, String senha, String conexao){

        nomeDB = nomeDB.toUpperCase();

        DBConnection connection = null;

        switch(nomeDB){
            case "MYSQL":
            connection = new DBMySQL(login, senha, conexao);
            break;

            case "ORACLE":
            connection = new DBOracle(login, senha, conexao);
            break;
        }


        return connection;
    }
}
