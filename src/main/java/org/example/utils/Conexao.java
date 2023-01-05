package org.example.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    //Por ser static e final, significa que ele tem que ser inicializado no ato da criação da classe.
    private static final Connection connection = construirConexao();

    private static Connection construirConexao() {
        try {
            Class.forName("org.postgresql.Driver"); //coloca em memória o driver do postgresql
            return DriverManager.getConnection( //utiliza o método getConnection para se conectar com o banco
                    "jdbc:postgresql://localhost:5432/jax-ws-crud-service", "postgres", "mysecretpassword"
            );
        } catch (Exception ex) {
            System.out.println("Conexão falhou: " + ex.getMessage());
            ex.printStackTrace();
        }
        return null;
    }

    public static Connection getConnection() {
        return connection;
    }
}
