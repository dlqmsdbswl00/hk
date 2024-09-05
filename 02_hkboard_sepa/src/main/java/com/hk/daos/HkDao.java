package com.hk.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hk.database.DataBase;
import com.hk.dtos.HkDto;

//DAO객체 : Database에 접근하여 작업하는 객체
public class HkDao extends DataBase {

	public HkDao() {// 생략가능
		super();// 생략가능 -> 부모 생성자 호출 -> 생성자 호출은 객체를 생성한다는 것
	}

	// 글목록 조회 기능 : 여러개의 행이 반환 -> 반환타입 : List
//										하나의 행 -> DTO
	public List<HkDto> getAllList() {
		List<HkDto> list = new ArrayList<>();

		Connection conn = null; // DB연결 객체
		PreparedStatement psmt = null; // 쿼리준비 객체
		ResultSet rs = null; // 쿼리 결과 받을 객체

		String sql = " SELECT SEQ, ID, TITLE, CONTENT, REGDATE " + " FROM HKBOARD ORDER BY REGDATE DESC ";

		try {
			conn = getConnection(); // 2단계 : DB연결
			psmt = conn.prepareStatement(sql); // 3단계 : 쿼리 준비
			rs = psmt.executeQuery(); // 4단계 : 쿼리 실행
			while (rs.next()) {
				HkDto dto = new HkDto();
				dto.setSeq(rs.getInt(1)); // DB는 인덱스 체계가 1부터 시작
				dto.setId(rs.getString(2));
				dto.setTitle(rs.getString(3));
				dto.setContent(rs.getString(4));
				dto.setRegDate(rs.getDate(5));
				list.add(dto);
				System.out.println(dto);
			}
			System.out.println("5단계:쿼리결과받기");
		} catch (SQLException e) {
			System.out.println("6단계:");
			e.printStackTrace();
		}
		return list;
	}
	
	
	//글 추가하기 : insert문, 파라미터 : id, title, content
	//테이블을 변경하는 작업 -> 처리만 하고 결과 X, seq, regdate -> 쿼리 추가
	
}
