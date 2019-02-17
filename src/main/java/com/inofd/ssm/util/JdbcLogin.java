package com.inofd.ssm.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcLogin {
    ResultSet rs = null;
    PreparedStatement pstmt = null;
    Connection con = null;
    public boolean login(String username,String password){
        if (username == null || password == null) {
            return false;
        }
        try {
            con = DBUtil.getConn();
            con.setAutoCommit(false);
            String sql = "select * from user where username = ? and password = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            rs = pstmt.executeQuery();
            con.commit();
            return rs.next();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (Exception e) {
            try {
                if (con != null) {
                    con.rollback();
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();

        }finally {
            DBUtil.close(rs,pstmt,con);
        }
        return false;
    }

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        String password = sc.nextLine();
        boolean login1 = new JdbcLogin().login(username,password);
        if (login1){
            System.out.println("success");
        }else {
            System.out.println("failure");
        }

    }
}
