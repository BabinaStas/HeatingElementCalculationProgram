package by.calculate.heatingelementcalculationprogram.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDao {

    public Connection getConnection() {
        String url = "jdbc:mysql://localhost/calculate_Ten";
        String userName = "root";
        String password = "root";
        try {
            return DriverManager.getConnection(url, userName, password);
        } catch (SQLException  e) {
            e.printStackTrace();
        }
        return null;
    }
}

