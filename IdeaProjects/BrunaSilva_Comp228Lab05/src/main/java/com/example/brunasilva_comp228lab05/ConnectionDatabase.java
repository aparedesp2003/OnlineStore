package com.example.brunasilva_comp228lab05;


import javafx.application.Application;
import javafx.stage.Stage;
import java.sql.*;

public class ConnectionDatabase extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            System.out.println("> Start Program ...");
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("> Driver Loaded successfully.");

            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@ 199.212.26.208 :1521: SQLD", "COMP228_F23_sy_28", "password");

            System.out.println("Database connected successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args)
    {
        ConnectionDatabase.launch();
    }
}
