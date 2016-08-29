package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberTable {

    public static void main(String args[]) throws Exception {
        Member m ;
        m = findByid(0);
        if (m != null) {
            System.out.println("id : " + m.getId());
            System.out.println("name : " + m.getName());
            System.out.println("password : " + m.getPassword());
            System.out.println("email : " + m.getEmail());
        }

    }

    public static Member findByid(int id) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            final String conStr = "jdbc:mysql://localhost/bookshop";
            final String user = "root";
            final String pass = "vibharam";

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(conStr, user, pass);
            String sql = "select * from member1 "
                    + "where id=?";
            ps = con.prepareCall(sql);
            ps.setInt(1, id);

            rs = ps.executeQuery();
            if (rs.next()) {
                Member m = new Member();
                m.setId(rs.getInt("id"));
                m.setName(rs.getString("name"));
                m.setPassword(rs.getString("password"));
                m.setEmail(rs.getString("email"));
                return m;
            } else {
                return null;
            }

        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception ex) {

                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (Exception ex) {

                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (Exception ex) {

                }
            }
        }

    }
}
