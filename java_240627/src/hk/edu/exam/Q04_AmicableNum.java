package hk.edu.exam;

// 친화수 구하기 : A 진약수의 합(B)을 구해 
// 그 결과(B)의 진약수의 합을 구한 값이 A
public class Q04_AmicableNum {
	public static void main(String[] args) {

		for (int i = 1; i < 2000; i++) {
			aminum(i);
		}

	}

	private static void aminum(int A) {
		int sum = 0;
		int sum2 = 0;

		for (int i = 1; i < A; i++) {
			if (A % i == 0) {
				sum += i; // 약수의 합을 구한다
			}
		}

		for (int i = 1; i < sum; i++) {
			if (sum % i == 0) {
				sum2 += i; // 약수의 합의 약수 합을 구한다 = 친화수
			}
		}

		if (A == sum2 && A != sum) { // 친화수이면서 완전수인 수는 제거(완전수 : 자신을 제외한 약수의 합이 본인과 같은 것)
			System.out.println(sum);
		}

		else {
//			System.out.printf("%d는 친화수가 없습니다", A);
		}

	}
}
