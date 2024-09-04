package hk.edu20240703.day05;

public class D3_AccessTest {
	// 멤버필드
	public 	int a; // 모두 접근 가능
			int b; // 패키지 내부에서만
	private int c; // 클래스 내부에서만
	
	// 메서드
	public void aa() {
		
	}
	void bb() {
		
	}
	private void cc() {

	}
	
	//메서드를 통해 privite 접근 가능하도록 = 은닉화
	public int getC() {		//public으로 선언해 외부 접근 가능하게 할 것
		return c;			//클래스 내부 접근 가능하기 때문에 가져올 수 있음
	}
}
