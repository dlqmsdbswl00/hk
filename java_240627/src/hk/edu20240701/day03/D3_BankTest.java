package hk.edu20240701.day03;

import java.util.Scanner;

public class D3_BankTest {
	public static void main(String[] args) {
//		// 클래스를 객체 생성해서 변수에 저장할 때 선언되는 타입 = 참조타입
//		Scanner scan = new Scanner(System.in); // system.in = 키보드로 입력되는 정보
//		System.out.println("키보드로 입력하세요");
//		String s = scan.next();
//		//next : 한 단어만(띄어쓰기 전) nextLine : 한 줄 전체
//		System.out.println("입력된 내용 : "+s);

		// 예제
		// while문과 Scanner 객체를 이용해 키보드로부터 입력된 데이터로 예금, 출금, 조회, 종료 기능 구현
		// 예금한 금액을 저장할 변수 선언
		// 키보드로 입력받은 값을 저장할 변수 선언

		int Money = 0; // 잔고

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("----------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("----------------------");

			System.out.println("선택>");

			int SelectMenu = 0;

			if (scan.hasNextInt()) { // 입력된 값이 숫자인지 확인
				SelectMenu = scan.nextInt(); // 숫자만 읽는다
			} else {
				System.out.println("숫자를 입력해야합니다.");
				scan = new Scanner(System.in);
				continue;
			}

			if (SelectMenu == 1) {
				System.out.println("예금액>");
				int inMoney = scan.nextInt();
				Money += inMoney;
				System.out.println("입금완료");
			}

			else if (SelectMenu == 2) {
				System.out.println("출금액>");
				int outMoney = scan.nextInt();

				if (Money > outMoney) {
					Money -= outMoney;
					System.out.println("출금완료");
				} else {
					System.out.println("잔고가 부족합니다");
					continue; // 가장 가까운 반복문으로 돌아감
				}
			}

			else if (SelectMenu == 3) {
				System.out.printf("잔고>%d\n", Money);
			}

			else if (SelectMenu == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			else
				System.out.println("1~4번을 입력하세요.");
		}
	}
}
