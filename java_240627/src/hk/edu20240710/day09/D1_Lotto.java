package hk.edu20240710.day09;

<<<<<<< HEAD
//Lotto클래스 ---> 로또한장
public class D1_Lotto {

	// 6개의 번호를 저장할 배열
	private int[] lots;// 배열선언

	// 생성자: 클래스 맴버필드를 초기화
	public D1_Lotto() {
		lots = new int[6];
		makeLotto();
	}

	// 생성자 오버로딩
	public D1_Lotto(int n) {
		lots = new int[n];
		makeLotto();
	}

	// 1~45까지의 숫자를 랜덤하게 생성하는 기능
	public int makeBall() {
		// Math클래스에 random()메서드를 활용
		// 0부터 1사이의 실수를 반환 : 0.0000000...1 ~ 0.9999999....
		// 0.99999 *45 ----> 1*45 --> 44.99999 ---> 0~44 + 1 = 1~45
		return (int) (Math.random() * 45) + 1;
	}

	// 1~45 사이의 숫자를 배열에 넣어주는 메서드
	public void makeLotto() {
//		for (int i = 0; i < this.lots.length; i++) {
//			lots[i]=makeBall();//중복된 숫자가 포함되어 있는지 판별이 필요
//		}

		int count = 0;
		while (count < lots.length) {
			int b = makeBall();// 랜덤숫자 생성
			if (!Util.isSame(lots, b)) {// 중복숫자가 없다면
				lots[count++] = b;// 배열에 숫자 저장
			}
		}
	}

	// 배열에 중복 숫자가 있는지 확인하는 메서드: 반환타입 boolean
	// 배열하고, 숫자하나에 대한 비교
//	public boolean isSame(int[] a, int b) {
//		boolean isS=false;
//		for (int i = 0; i < a.length; i++) {
//			if(a[i]==b) {
//				isS=true;
//				break;
//			}
//		}
//		return isS;
//	}

	// 배열lots가 private으로 선언되어 있어
	// 메서드를 통해서 가져올 수 있도록한다.
	public int[] getLots() {
		return lots;
	}

=======
//Lotto클래스 ---> 로또 한 장
public class D1_Lotto {
	// 6개의 번호를 저장할 배열 선언
	private int[] lots;

	// 생성자 : 클래스 멤버필드를 초기화
	public D1_Lotto() {
		lots = new int[6]; // 객체 생성 하면 lots 배열 6가지로 초기화
		makeLotto();
	}

	// 생성자 오버로딩
	public D1_Lotto(int n) {
		lots = new int[n];
		makeLotto();
	}

	// 1~45까지의 숫자를 랜덤하게 생성하는 기능
	public int makeBall() {
		// Math클래스의 random()메서드 활용
		// 0~1사이의 실수 반환 : 0.0000~0.99999...
		// 0.9999*45 -> 1*45보단 작다d -> 최대가 44.9999
		// -> int 변환시 0~44까지만 나옴 -> 값에 1을 더해준다 > 1~45 랜덤값 출력

		return (int) (Math.random() * 45) + 1;
	}

	// 1~45까지 숫자를 배열에 저장하는 메서드
	public void makeLotto() {
//		for (int i = 0; i < this.lots.length; i++) {
//			lots[i]=makeBall();	//중복된 숫자가 나올 수 있음
//		}

		int count = 0;
		while (count < lots.length) {
			int b = makeBall();// 랜덤숫자 생성
			if (!Util.isSame(lots, b)) {// 중복숫자가 없다면
				lots[count++] = b;// 배열에 숫자 저장
			}
		}
	}

	// 배열에 중복 숫자가 있는지 확인하는 메서드 : 반환타입 boolean
	// 배열하고, 숫자 하나에 대한 비교
//	public boolean isSame(int[] a, int b) {
//		boolean isS=false;
//		
//		return isS;
//	} 판별 메서드의 기본 형식

	// 배열에 중복 숫자가 있는지 확인하는 메서드: 반환타입 boolean
	// 배열하고, 숫자하나에 대한 비교
//		public boolean isSame(int[] a, int b) {
//			boolean isS=false;
//			for (int i = 0; i < a.length; i++) {
//				if(a[i]==b) {
//					isS=true;
//					break;
//				}
//			}
//			return isS;
//		}


	// 배열 lots가 private로 선언되어있으므로
	// 메서드를 통해 가져올 수 있게 한다
	public int[] getLots() {
		return lots;
	}
>>>>>>> refs/remotes/origin/main
}
