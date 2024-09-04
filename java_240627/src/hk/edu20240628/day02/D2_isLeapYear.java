package hk.edu20240628.day02;

public class D2_isLeapYear {

	public static void main(String[] args) {
		// 윤년 : 1년이 366일인 경우 (2월달이 29일)
		// 윤년 판단 조건 : 년도가 4의 배수이면서 100으로 나눠떨어지지 않는 수
		// 또는 400으로 나눠떨어지는 수
		// 2024년도가 윤년인지 아닌지 출력
		// 코드 : if{} else{}

		int year = 2024;

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + "년은 윤년입니다");
		} else
			System.out.println(year + "년은 평년입니다");

		// 2001~2030년 사이 윤년 출력
		// 메서드 이용 X
		System.out.println("메서드 X =========================================");
		for (int y = 2001; y <= 2030; y++) {
			if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
				System.out.println(y + "년은 윤년입니다");
			} else {
				System.out.println(y + "년은 평년입니다");
			}

		}

		// 메서드 이용
		System.out.println("메서드 O =========================================");
		for (int y = 2001; y <= 2030; y++) {
			if (isLeapYear(y)) {
				System.out.println(y + "년은 윤년입니다");
			} else {
				System.out.println(y + "년은 평년입니다");
			}

		}

	}

	// 윤년을 판단하는 메서드 : T/F 반환
	private static boolean isLeapYear(int y) {
		return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
	}

}