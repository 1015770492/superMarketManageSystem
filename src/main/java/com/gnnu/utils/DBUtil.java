package com.gnnu.utils;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class DBUtil {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/supermarket?characterEncoding=utf-8&?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456";


    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    private CachedRowSet cachedRowSet;

    public Connection getConnection() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public int update(String sql, Object... objects) {
        int num = 0;
        try {
            getConnection();
            preparedStatement = connection.prepareStatement(sql);

            if (objects != null) {

                for (int i = 0; i < objects.length; i++) {
                    preparedStatement.setObject(i + 1, objects[i]);
                }
            }
            num = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return num;
    }

    public CachedRowSet query(String sql, Object... objects) {
        try {
            getConnection();
            preparedStatement = connection.prepareStatement(sql);
            if (objects != null) {
                for (int i = 0; i < objects.length; i++) {
                    preparedStatement.setObject(i + 1, objects[i]);
                }
            }
            resultSet = preparedStatement.executeQuery();

            RowSetFactory factory= RowSetProvider.newFactory();
            cachedRowSet=factory.createCachedRowSet();
            cachedRowSet.populate(resultSet);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return cachedRowSet;
    }

    public void close() {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}

