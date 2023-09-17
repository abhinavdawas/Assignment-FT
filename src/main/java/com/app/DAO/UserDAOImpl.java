package com.app.DAO;

import com.app.model.User;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAOImpl implements UserDAO {

    private DataSource dataSource;

    public UserDAOImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void addUser(User user) {
        String SQL = "INSERT INTO userInfo " +
                "(id, name, email) VALUES (?, ?, ?)";
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(SQL);

            ps.setString(1, user.getId());
            ps.setString(2, user.getName());
            ps.setString(3, user.getEMail());
            System.out.println(ps.execute());
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
    }

}





























