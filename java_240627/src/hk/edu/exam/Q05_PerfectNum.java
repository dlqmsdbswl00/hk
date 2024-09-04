package hk.edu.exam;

public class Q05_PerfectNum {

//	완전수 : 진약수의 합이 본인과 같은 것
	public static void main(String[] args) {
		for (int i = 1; i < 2000; i++) {
			perfectnum(i);
		}
	}

	private static void perfectnum(int A) {
		int sum = 0;
		for (int i = 1; i < A; i++) {
			if (A % i == 0) {
				sum += i;
			}
		}
		if (sum == A) {
			System.out.println(A);
		}
	}

}
