package hk.edu.exam;

public class Q02_GCD {
	public static void main(String[] args) {
		greatestCommonDivisor(15, 40);
	}

	// 최대공약수를 구하는 메서드
	// a와 b가 같아질 때 까지 큰 수에서 작은 수를 빼기
	private static void greatestCommonDivisor(int a, int b) {
		while (a != b) { // a와 b가 같아질 때 까지 반복
			if (a > b) { // a가 큰 수이면
				a = a - b; // 큰 수에서 작은 수를 뺀다
			} else { // b가 큰 수이면
				b = b - a; // 큰 수에서 작은 수를 뺀다
			}
		}
		System.out.println(a);
	}
}
