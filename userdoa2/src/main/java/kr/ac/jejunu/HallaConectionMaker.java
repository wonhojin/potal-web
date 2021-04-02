package kr.ac.jejunu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HallaConectionMaker implements ConnectionMaker {
    @Override
        public Connection getConnection() throws ClassNotFoundException, SQLException {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost/userinfo?" +
                            "characterEncoding=utf-8&serverTimezone=UTC"
                    , "root", "123123"
            );
        }
    }

