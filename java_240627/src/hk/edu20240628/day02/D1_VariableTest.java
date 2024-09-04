package hk.edu20240628.day02;

public class D1_VariableTest {
	public static void main(String[] args) {
		// 기본타입의 특징

		// 1. 정수타입 (기본형 int)

		byte b = 1; // -128~127 숫자 표현
//			 b=128;	//128은 표현 범위를 벗어남
		short sh = 128; // 2byte니까 저장 가능
		int i = 500000000; // 4byte
		long l = 50000000000L; // 8byte지만 리터럴은 int로 받으므로 오류 발생할 수 있음, 끝에 L 붙여줄 것

		// 2. 실수타입 (기본형 double)
		double d = 15.8;
		float f = (float) 12.7f;
		float ff = (float) (d + f); // 다른 타입의 두 변수를 연산하면 큰 쪽의 타입으로 반환

		// 3. 다른 타입끼리 연산
		int ii = (int) (i + d); // int + double = double 반환
		double dd = i + d;
		int iii = (int) dd; // dd double -> int 형변환시 소수점이 잘림 12.3 -> 12

		// 4. 정수끼리 연산
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = (byte) (b1 + b2); // byte끼리 연산해도 int형으로 반환
	}
}
