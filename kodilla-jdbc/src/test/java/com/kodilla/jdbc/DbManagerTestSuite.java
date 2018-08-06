package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {
    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }
    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        //When
        String sqlQuery = "SELECT * from users";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);
        //Then
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
            rs.getString("Firstname") + ", " +
            rs.getString("Lastname"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(7, counter);
    }

    @Test
    public void testSelectedUsersAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        //When
        String sqlQuery = "select u.firstname, u.lastname, count(p.id) as Posts_QTY\n" +
                "from users u, posts p\n" +
                "where u.id = p.user_id\n" +
                "group by u.firstname\n" +
                "having count(*) > 1;";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);
        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getString("firstname") + ", " + rs.getString("lastname"));
            counter ++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(1, counter);
    }

}
