package com.marcos.factory;

public class DBMySQL extends DBConnection{

    private String login;
    private String senha;
    private String conexao;


    public DBMySQL(String login, String senha, String conexao) {
        this.login = login;
        this.senha = senha;
        this.conexao = conexao;
    }

    @Override
    public String getLogin() {
        return this.login;
    }

    @Override
    public String getSenha() {
        return this.senha;
    }

    @Override
    public String getConexao() {
        return this.conexao;
    }
    
    @Override
    public void getDescricao() {
        System.out.println("Iniciando conexão com o MySQL.");
    }
}
