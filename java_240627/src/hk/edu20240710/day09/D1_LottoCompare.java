package hk.edu20240710.day09;

import java.util.Arrays;

public class D1_LottoCompare {

	// 당첨번호
	public static D1_Lotto lottoBall =new D1_Lotto();
	//static 메서드는 오버라이딩 X 재정의 할 수 없다

	// 구매한 로또의 번호들
	public D1_LottoStore userBall;

	public D1_LottoCompare() {
//		this.lottoBall = new D1_Lotto();
		this.userBall = new D1_LottoStore();// 기본 5장 구매
	}

	public D1_LottoCompare(int n) {
//		this.lottoBall = new D1_Lotto();
		this.userBall = new D1_LottoStore(n);// 원하는 수량 구매
	}

	// 당첨번호를 비교하는 메서드
	public void compareBall();{
		//당첨번호출력
		System.out.println("당첨번호");
		int[] lots=lottoBall.getLots();	//lotto 객체 안에 로또 번호 가져오기
		Arrays.sort(lots);	//정렬하기
		System.out.println(Arrays.toString(lots));
		

		//사용자 구매번호 출력
		System.out.println("사용자 구매번호");
		D1_Lotto[] userLots=userBall.lottoObj;	//사용자가 구매한 로또 번호
		for (int i = 0; i < userLots.length; i++) {
			Arrays.sort(userLots[i].getLots());
			System.out.println(Arrays.toString(userLots[i].getLots()));
		}

		//당첨번호 비교하기
		System.out.println("당첨번호 확인하기");
		for (int i = 0; i < userLots.length; i++) {
			int count=0;
			System.out.println(Arrays.toString(userLots[i].getLots()));	//사용자로또
			for (int j = 0; j < lots.length; j++) {
				//				사용자 로또 배열,		당첨번호에 숫자 한 개씩 전달
				if (isSame(userLots[i].getLots(), lots[j])) {
					System.out.println(lots[j]+" ");	//당첨번호출력
					count++;
				}
			}
			System.out.println("당첨번호 개수 : "+count);
			System.out.println("--------------------------");
		}
	}

	
	

	// 배열에 중복 숫자가 있는지 확인하는 메서드: 반환타입 boolean
	// 배열하고, 숫자하나에 대한 비교
	public boolean isSame(int[] a, int b) {
		boolean isS = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b) {
				isS = true;
				break;
			}
		}
		return isS;
	}

	// 당첨개수를 확인해서 등수를 출력하는 기능
	// 6개:1등 5:2등 ......
}
