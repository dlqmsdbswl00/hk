package hk.edu.exam;

// 최소공배수 구하기 : 두 수를 곱하고 최대공약수로 나누기

public class Q03_LCM {
	public static void main(String[] args) {
		leastCommonMultiple(2, 9);
	}

	private static void leastCommonMultiple(int a, int b) {
		int gcd = 0; // 최대공약수 변수 생성
		int orA = a;
		int orB = b; // 상태 변하기 전 a, b 저장
		while (a != b) { // a와 b가 같아질 때 까지 반복
			if (a > b) { // a가 큰 수이면
				a = a - b; // 큰 수에서 작은 수를 뺀다
			} else { // b가 큰 수이면
				b = b - a; // 큰 수에서 작은 수를 뺀다
			}
		}
		gcd = a;

		int lcm = (orA * orB) / gcd;
		System.out.println(lcm);
	}
}
