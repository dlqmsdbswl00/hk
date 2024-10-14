package com.hk.board.dtos;

import java.util.Date;

//DTO객체: 데이터를 운반할때 사용할 객체
public class UserDto {
//	java 3대 개념: 은닉화, 상속, 다형성
//	필드들은 모두 **은닉화(encapsulation)**되어 있어, 
//	외부에서 직접 접근하지 못하게 하고, 
//	getter와 setter를 통해서만 접근하도록 설정되어 있습니다.
	
	private String userID;
	private String name;
	private int birthYear;
	private String addr;
	private String mobile1;
	private String mobile2;
	private int height;
	private Date mDate;
	
	
//	기본생성자 : 매개변수가 없는 기본생성자
	public UserDto() {

	}

	//생성자 오버로딩
	// 모든 필드를 초기화 할 수 있게 매개변수를 받는다
	// super(); = 상위클래스(Object)의 생성자를 호출
	public UserDto(String userID, String name, int birthYear, String addr, String mobile1, String mobile2, int height,
			Date mDate) {
		super();
		this.userID = userID;
		this.name = name;
		this.birthYear = birthYear;
		this.addr = addr;
		this.mobile1 = mobile1;
		this.mobile2 = mobile2;
		this.height = height;
		this.mDate = mDate;
	}
	
	public UserDto(String userID, String name, int birthYear, String addr, String mobile1, String mobile2, int height) {
		super();
		this.userID = userID;
		this.name = name;
		this.birthYear = birthYear;
		this.addr = addr;
		this.mobile1 = mobile1;
		this.mobile2 = mobile2;
		this.height = height;
	}

	// Getter/Setter 메서드
	// 데이터를 가져오기 위한 Getter
	// 데이터를 설정하기 위한 Setter
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getMobile1() {
		return mobile1;
	}

	public void setMobile1(String mobile1) {
		this.mobile1 = mobile1;
	}

	public String getMobile2() {
		return mobile2;
	}

	public void setMobile2(String mobile2) {
		this.mobile2 = mobile2;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Date getmDate() {
		return mDate;
	}

	public void setmDate(Date mDate) {
		this.mDate = mDate;
	}

	//toString() 메서드 : 객체의 상태를 문자로 반환
	//toString()---> Object 클래스에 구현되어 있음
	@Override
	public String toString() {
		return "UserDto [userID=" + userID + ", name=" + name + ", birthYear=" + birthYear + ", addr=" + addr
				+ ", mobile1=" + mobile1 + ", mobile2=" + mobile2 + ", height=" + height + ", mDate=" + mDate + "]";
	}
	
}



