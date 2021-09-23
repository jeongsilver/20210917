package c06co.yedam.friend;

import java.util.Scanner;

import c05co.yedam.kyobo.C02BookInfo;

/*
 * 친구 목록 관리
 * 이름, 나이, 키, 연락처, email
 * 친구등록, 조회(이름), 목록, 수정, 삭제, 종료
 */
public class C01FriendMain {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		C02FriendInfo[] friend = new C02FriendInfo[3];
		friend[0] = new C02FriendInfo("해리포터", 31, 168.5, "010-1111-5555", "harrypotter@hogwarts.ac.uk");
		friend[1] = new C02FriendInfo("헤르미온느", 30, 165, "010-4444-4444", "hermione@hogwarts.ac.uk");
		friend[2] = new C02FriendInfo("론위즐리", 32, 178.5, "010-1010-1010", "ronweasly@hogwarts.ac.uk");
		System.out.println("=========================친구 등록=========================");
		while (true) {
			// 친구등록, 조회(이름), 목록, 수정, 삭제, 종료 메소드
			showMenu();
			System.out.println("===========================================================");
			int choice = readInt("번호를 선택하세요!");
			// if문
			if (choice == 1) {
				System.out.println("친구 등록");
				String name = readStr("친구이름을 입력하세요");
				int age = readInt("친구 나이를 입력하세요");
				double height = readDouble("친구 키를 입력하세요");
				String phone = readStr("친구 연락처를 입력하세요");
				String email = readStr("친구 이메일을 입력하세요");
				C02FriendInfo friends = new C02FriendInfo(name, age, height, phone, email);
				for (int i = 0; i < friend.length; i++) {
					if (friend[i] == null) {
						friend[i] = friends;
						break;
					}
				}
				System.out.println("저장완료");
			} else if (choice == 2) {
				String search = readStr("친구 조회: 이름");
				for (C02FriendInfo friendInfo : friend) {
					if (friendInfo != null && friendInfo.getName().indexOf(search) != -1)
						friendInfo.showInfo();
				}

			} else if (choice == 3) {
				System.out.println("친구 목록");
				for (C02FriendInfo friendInfo : friend) {
					if (friendInfo != null) {
						friendInfo.showInfo();
					}
				}
			} else if (choice == 4) {
				System.out.println("친구 수정");
				String search = readStr("수정할 친구이름을 입력하세요");
				String age = readStr("수정할 나이를 입력하세요");
				String height = readStr("수정할 키를 입력하세요");
				String phone = readStr("수정할 연락처를 입력하세요");
				String email = readStr("수정할 이메일을 입력하세요");
				boolean isExit = false;
				for (int i = 0; i < friend.length; i++) {
					// 한 건 찾아온 경우
					if (friend[i] != null && friend[i].getName().equals(search)) {
						if (!age.equals("")) {
							friend[i].setAge(Integer.parseInt(age));
							;
						}
						if (!height.equals("")) {
							friend[i].setHeight(Double.parseDouble(height));
						}
						if (!phone.equals("")) {
							friend[i].setPhone(phone);
						}
						if (!email.equals("")) {
							friend[i].setEmail(email);
						}
						isExit = true;
					}
				}
				if (isExit)
					System.out.println("정상적으로 수정");
				else
					System.out.println("존재하지 않는 이름입니다");

			} else if (choice == 5) {
				System.out.println("삭제");
				String search = readStr("삭제할 이름을 입력하세요.");
				for (int i = 0; i < friend.length; i++) {
					if (friend[i] != null && friend[i].getName().indexOf(search) != -1)
						friend[i] = null;
				}
				System.out.println("삭제 완료");
			} else if (choice == 6) {
				System.out.println("종료합니다.");
				break;
			}

		} // end of while
		System.out.println("정상적으로 등록 되었습니다.");
	}

	// 메소드
	public static void showMenu() {
		System.out.println("1.친구등록, 2.조회(이름), 3.목록, 4.수정, 5.삭제, 6.종료");
	}

	public static int readInt(String msg) {
		Scanner scn = new Scanner(System.in);
		System.out.println(msg);
		int menu = scn.nextInt();
		return menu;
	}

	public static String readStr(String msg) {
		System.out.println(msg);
		return sc.nextLine();
	}

	public static double readDouble(String msg) {
		Scanner scn = new Scanner(System.in);
		System.out.println(msg);
		double menu = scn.nextDouble();
		return menu;
	}
//	double val = Double.parseDouble("23.5");
}
