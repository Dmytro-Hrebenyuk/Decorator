package com.example.decorator;

import java.sql.Connection;
import java.sql.DriverManager;

import lombok.SneakyThrows;

public class DBConnection {
    private static DBConnection dbConnection;

    private Connection connection;

    @SneakyThrows
    private DBConnection() {
        this.connection = connection = DriverManager.getConnection(null, null, null);
    }

    public String getDocument(String gcsPeth){
        
        return null;
    }

    static public DBConnection getInstance {
        if (dbConnection == null) {

        }
    }
}
