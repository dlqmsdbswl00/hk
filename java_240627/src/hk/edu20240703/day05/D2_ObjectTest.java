package hk.edu20240703.day05;

public class D2_ObjectTest {

	public static void main(String[] args) {
		String str = new String();
		System.out.println(str.getClass());

		D1_ClassTest classTest = new D1_ClassTest();
		System.out.println(classTest.getClass());

		// 문자열 반환해준다(출력ㄴ) : 객체일 경우 "위치@hashcode" 반환
		System.out.println(classTest.toString());

		// 기본타입일 경우 값을 문자열로 반환
		int a = 10;
		Integer ii = 10; // Integer는 wrapper클래스 : 기본타입을 참조타입에 저장할 수 있게
		System.out.println(ii.toString());

		// hashcode
		D1_ClassTest classTest2 = new D1_ClassTest();

		System.out.println(classTest.hashCode());
		System.out.println(classTest2.hashCode());

		// equals : 참조타입을 비교할때 -> hashcode로 비교한다 -> hashcode()사용
		System.out.println(classTest.equals(classTest2));

		// equals는 문자열 비교할 때 주로 쓰인다.
		// 리터럴선언 방식, 객체선언 방식 (문자열의 2가지 방식)

		// 리터럴 방식
		String s = "a"; // 타입 변수명 = 값; (기본타입처럼 선언하여 쓰는 방식, 실제 값을 그대로 저장하여 쓰는 방식)
		String ss = "a";
		System.out.println(s == ss); // true , ==은 주소로 비교하는 방식
		System.out.println(s.equals(ss)); // true , hashcode로 비교하는 방식

		// 객체선언 방식
		String sss = new String("a");
		System.out.println(s == sss); // false
		System.out.println(s.equals(sss)); // true (equals는 주소값이 달라도 문자열만 비교하기 때문에 true가 나올 수 있음)

		// new를 이용하면 heap메모리가 생성되고 그 안에 "a"가 들어가게 된다
		// 그러나 리터럴 방식을 사용하면 그냥 a만 저장이된다?? 이 때 hashcode는 값이 같으면 똑같이 생성된다.
		// 문자가 동일하면 hashcode가 같아서 hashcode 비교방식인 equals로 비교했을 때 true로 뜨지만
		// 주소로 비교하는 ==는 주소로 비교하는 방식이기 때문에 문자가 같아도 주소값이 달라 false로 표현된다.
		// 그래서 문자열은 equals로 비교해야 한다.
	}

}
