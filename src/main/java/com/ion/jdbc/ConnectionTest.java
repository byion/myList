package com.ion.jdbc;

import java.sql.*;
import java.util.HashMap;

/**
 * Created by iieseanu on 3/20/2017.
 */
public class ConnectionTest {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/data?useSSL=false";
        // String url ="jdbc:mysql://localhost:3306/sakila?profileSQL=true";
        String user = "root";
        String pass = "123qwe123";
        Connection conn = DriverManager.getConnection(url, user, pass);


        Statement stat = conn.createStatement();
        //int result =stat.executeUpdate("insert into species values(10, 'Deer', 3)");
        ResultSet rs = stat.executeQuery("SELECT * FROM species");

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            //  double num = rs.getDouble("num_acres");
            map.put(id, name);
        }

        System.out.println(map);
        System.out.println(conn);

    }

}
