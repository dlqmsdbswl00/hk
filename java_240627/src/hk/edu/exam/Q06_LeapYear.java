package hk.edu.exam;

/*윤년을 구하는 조건:
년도를 4로 나누어 떨어지면서 100으로 나누어 떨어지지 않거나, 
400으로 나누어 떨어지면 윤년이다. 
(year % 4 == 0 && year % 100 != 0) && (year % 400 == 0)
*/
public class Q06_LeapYear {
	public static void main(String[] args) {
		for (int i = 2000; i <= 2024; i++) {
			leapYear2(i);
		}
	}

	private static void leapYear2(int Year) {
		if((Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0)) {
			System.out.printf("%d년은 윤년입니다\n",Year);
		}

	}
}
