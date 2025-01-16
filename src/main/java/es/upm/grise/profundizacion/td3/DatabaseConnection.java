package es.upm.grise.profundizacion.td3;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public Connection connect() throws Exception {
        return DriverManager.getConnection("jdbc:sqlite:resources/orders.db");
    }
}
