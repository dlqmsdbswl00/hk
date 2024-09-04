package hk.edu20240627.day01;
//명명법, 식별자 확인
//클래스명 : 파스칼(첫글자 대문자로 시작)

public class a001_hello {
	// main 메서드 : 자바코드를 실행시켜줌
	   public static void main(String[] args) {
	      
	      System.out.println("Hello Java!");
	      
	      //testMethod();
	      
	      a001_hello hello= new a001_hello();// new 이용해서 객체 생성 후 호출
	      hello.testMethod();
	      hello.testMethod2();
	      
	   }
	   
	   //메서드 선언
	   //메서드명 정의 : 카멜방식 - 소문자로 시작
	   public void testMethod() {
	      //변수 선언 : 타입 + 변수명 = 값
	      boolean isS = true;
	      int i = 100;
	      i=200;
	      System.out.println("메서드 실행 :"+i);
	      
	   }
	   
	   //블럭변수: 변수의 사용범위(Scope)
	   public void testMethod2() {
	      int i=10;
	      if(i<15) {
	         int ii=5;
	         ii=ii+i;  //ii=5+10
	         
	      }
	      // i=ii+i; //오류 발생
	   }
	   
	}
