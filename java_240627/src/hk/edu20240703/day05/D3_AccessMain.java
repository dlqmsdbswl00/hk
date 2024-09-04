package hk.edu20240703.day05;

public class D3_AccessMain {

	public static void main(String[] args) {
		D3_AccessTest access=new D3_AccessTest();
		
		int a = access.a;	//public 선언 : 접근가능
		int b = access.b;	//default선언 : 접근가능
//		int c = access.c;	//private선언 : 접근불가
		int c = access.getC();		//메서드를 통해 접근 가능(은닉화)
		
		//사람들이 자꾸 무더바~
		//윤지 경추 안 좋은지 자꾸 무더바~ 
		//답은 하나야~ 그냥 다 안 좋아~! 
		//행복하면 됐지~ 
		//허리 안쓰면 됐지~
		//내가 되고싶은건 
		//허리 없는 여자~ 
	}

}
