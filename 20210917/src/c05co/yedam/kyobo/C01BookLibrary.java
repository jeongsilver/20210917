package c05co.yedam.kyobo;

import java.util.Scanner;

/*
 * 1.도서등록  2.도서수정  3.도서목록  4.도서조회  5.도서삭제  9.종료
 * 도서정보: 도서제목/저자/출판사/가격
 */
public class C01BookLibrary {
	static Scanner sc = new Scanner(System.in); // 클래스 전체에 선언

	public static void main(String[] args) {
		C02BookInfo[] kyoboLib = new C02BookInfo[100];
		kyoboLib[0] = new C02BookInfo("혼자공부하는 자바","신용권","한빛출판사",25000);
		kyoboLib[1] = new C02BookInfo("이것이자바다","신용권","한빛출판사",25000);
		kyoboLib[2] = new C02BookInfo("아직끝나지않았다","김연경","한빛출판사",13000);

		while (true) {
			System.out.println("1.도서등록 2.도서수정 3.도서목록 4.도서조회 5.도서삭제 9.종료");
			int menu = readInt("번호를 선택하세요");
			if (menu == 1) {
				System.out.println("도서등록 메뉴입니다");
				// 도서등록: 제목, 저자,출판사, 가격
				String title = readStr("책제목을 입력하세요.");
				String auth = readStr("저자를 입력하세요.");
				String press = readStr("출판사를 입력하세요.");
				int price = readInt("가격을 입력하세요.");
				C02BookInfo book = new C02BookInfo(title, auth, press, price);
				for (int i = 0; i < kyoboLib.length; i++) {
					if (kyoboLib[i] == null) { // 배열의 비어있는 위치에 저장
						kyoboLib[i] = book;
						break;
					}
				}
				System.out.println("저장완료");
			} else if (menu == 2) {
				System.out.println("도서수정 메뉴입니다");
				//도서로 찾아와서 도서명(키)
				//저자, 출판사, 가격 => 항목변경
				String search = readStr("수정할 도서명을 입력하세요");
				String author = readStr("변경할 저자 입력하세요[변경 안 할 경우 엔터]");
				String press = readStr("변경할 출판사 입력[변경 안 할 경우 엔터]");
				String price = readStr("변경할 금액 입력 [변경 안 할 경우 엔터]");
				boolean isExit=false;
				for(int i=0; i< kyoboLib.length;i++) {
					//한 건 찾아온 경우
					if(kyoboLib[i]!=null && kyoboLib[i].getBookName().equals(search)) {
						if(!author.equals("")) {
							kyoboLib[i].setAuthor(author);
						}
						if(!press.equals("")) {
							kyoboLib[i].setAuthor(author);
						}
						if(!price.equals("")) {
							kyoboLib[i].setPrice(Integer.parseInt(price));
						}
						isExit = true;
					}
				}
				if(isExit)
					System.out.println("정상적으로 수정");
				else
					System.out.println("존재하지 않는 책입니다");
				
			} else if (menu == 3) {
				System.out.println("도서목록 메뉴입니다");
				for (C02BookInfo book : kyoboLib) {
					if (book != null) {
						book.showInfo();
					}
				}
			} else if (menu == 4) {
				String search = readStr("도서조회 메뉴입니다");
				for(C02BookInfo book : kyoboLib) {
					if(book != null && book.getBookName().indexOf(search)!=-1)
						book.showInfo();
				}
			} else if (menu == 5) {
				System.out.println("도서삭제 메뉴입니다");
				String search = readStr("삭제할 도서명을 입력하세요.");
				for(int i=0; i<kyoboLib.length;i++) {
					if(kyoboLib[i] != null && kyoboLib[i].getBookName().indexOf(search)!=-1)
						kyoboLib[i]=null;
				}
				System.out.println("삭제 완료");
			} else if (menu == 9) {
				System.out.println("도서수정 메뉴입니다");
				break;
			}
		} // end of while
		System.out.println("끝.");

	} // end of main

	// 사용자 입력값을 반환
	public static String readStr(String msg) {
		System.out.println(msg);
		return sc.nextLine();

	}
	// 사용자 입력값을 반환(int)

	public static int readInt(String msg) {
		System.out.println(msg);
		int result = 0;
		while (true) {
			String val = sc.nextLine();
			try {
				result = Integer.parseInt(val);
				break;
			} catch (Exception e) {
				System.out.println("잘못된 값을 입력했습니다. 다시 입력하세요");
			}
		}
		return result;
	}
}
