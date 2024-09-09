package com.hk.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//JDBC 1, 2, 6단계 구현 
// 1,2,6 단계는 계속 똑같기에 한 번만 작성하여 게속 쓸 수 있게 해준다. 
public class DataBase {

	// 1단계: 드라이버 로딩
	public DataBase() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("1단계: 드라이버로딩 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("1단계: 드라이버로딩 실패");
		}
	}

	public Connection getConnection() throws SQLException {
		String url = "jdbc:mariadb://localhost:3306/hkeduweb";
		String user = "root";
		String password = "1234";

		Connection conn = DriverManager.getConnection(url, user, password);
		System.out.println("2단계: DB연결성공");

		return conn;
	}

	// 6단계: DB연결닫기
	public void close(ResultSet rs, PreparedStatement psmt, Connection conn) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
			System.out.println("6단계:DB닫기성공");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("6단계:DB닫기실패");

		}
	}

}
