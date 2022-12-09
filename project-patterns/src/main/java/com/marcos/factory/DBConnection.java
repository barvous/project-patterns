package com.marcos.factory;

public abstract class DBConnection {

    public abstract void getDescricao();
    public abstract String getLogin();
    public abstract String getSenha();
    public abstract String getConexao();

    @Override
    public String toString(){
        return "Login: " + getLogin() 
        + "\nSenha: " + getSenha()
        + "\nConexão: " + getConexao();
    }
}
