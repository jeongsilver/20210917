package c07co.yedam.inherit;

import c01co.yedam.ScanUtil;

public class C08FriendExe {

	private static C08FriendExe singleton = new C08FriendExe();
	private C04Friend[] friends;

	private C08FriendExe() {

		// 친구, 학교친구, 회사친구 => 배열에 저장
		// CompFriend -> Friend, UnivFriend -> Friend
		friends = new C04Friend[100];
		friends[0] = new C04Friend("홍길동", "1111-1211");
		friends[5] = new C04Friend("홍길동", "1111-1234");
		friends[1] = new C04Friend("김길동", "2222-1211");
		friends[2] = new C04Friend("이길동", "1111-3333");
		friends[3] = new C05UnivFriend("박수진", "2345-1234", "수학가");
		friends[4] = new C06CompFriend("김철수", "2222-1212", "영업부");
	}

	public static C08FriendExe getInstance() {
		return singleton;
	}

	public void execute() {
		while (true) {
			System.out.println("-------------------------------");
			System.out.println("1.친구등록 2.조회 3.수정 4.삭제 5.종료");
			System.out.println("-------------------------------");
			int menu = ScanUtil.readInt("메뉴를 선택하세요."); // static경우 인스턴스 메모리 할당
			System.out.println("");

			if (menu == 1) { // 친구등록
				System.out.println("친구등록");
				addFriend();
			} else if (menu == 2) { // 조회
				System.out.println("조회");
				showList();
			} else if (menu == 3) { // 수정
				System.out.println("수정");
				modify();
			} else if (menu == 4) { // 삭제
				System.out.println("삭제");
				delete();
			} else if (menu == 5) {
				System.out.println("종료합니다");
				break;
			}
		}
		System.out.println("끝.");

	}

	private void addFriend() {
		// 친구, 학교친구, 회사친구
		System.out.println("1.친구 |2.학교친구 |3.회사친구");
		int choice = ScanUtil.readInt("메뉴를 선택하세요");

		String name = ScanUtil.readStr("친구이름을 입력하세요");
		String phone = ScanUtil.readStr("연락처를 입력하세요");
		C04Friend friend = null;

		if (choice == 1) {
			friend = new C04Friend(name, phone);

		} else if (choice == 2) {
			String major = ScanUtil.readStr("전공입력");
			friend = new C05UnivFriend(name, phone, major);

		} else if (choice == 3) {
			String depart = ScanUtil.readStr("부서입력");
			friend = new C06CompFriend(name, phone, depart);

		}
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
		System.out.println("등록 성공");
	}

	private void showList() {
		// 이름, 연락처, 입력 = > 홍길동, 김길동 -> 길동
		// 1111-1211,2222-1211=> "1211" 조회
		// 길동, 1211 -> 이름 & 연락처
//		for(int i=0; i<friends.length;i++) {
//			if(friends[i] != null ) {
//				System.out.println(friends[i].toString());
//			}
//		}

//		for (int i = 0; i < friends.length; i++) {
//			if (friends[i] != null && friends[i].getName().indexOf(nameSearch) != -1) {
//				System.out.println(friends[i].toString());
//			}
//		}

//		String nameSearch = ScanUtil.readStr("이름 조회: ");

//		for (C04Friend friendInfo : friends) {
//			if (friendInfo != null && friendInfo.getName().indexOf(nameSearch) != -1) {
//				System.out.println(friendInfo.toString());
//				
//			} else if(nameSearch.equals("")){
//				String phoneSearch = ScanUtil.readStr("번호 조회: ");
//				for (int i = 0; i < friends.length; i++) {
//					if (friends[i] != null && friends[i].getPhone().indexOf(phoneSearch) != -1) {
//						System.out.println(friends[i].toString());
//
//					}
//				}
//			}
//		}

//		String nameSearch = ScanUtil.readStr("이름 조회: ");
//		String phoneSearch = ScanUtil.readStr("번호 조회: ");
//		for(int i=0;i<friends.length;i++) {
//			if(nameSearch !=null)
//				if(friends[i].getName().indexOf(nameSearch)!=-1) {
//					System.out.println(friends[i].toString());
//				}
//				else if(nameSearch.equals("")) {
////					String nameSearch = ScanUtil.readStr("이름 조회: ");
//					if(friends[i].getPhone().indexOf(phoneSearch)!=-1) {
//						System.out.println(friends[i].toString());
//					}
//				}
//		}
//		

		String name = ScanUtil.readStr("이름 조회: ");
		String phone = ScanUtil.readStr("번호 조회: ");

//		for(int i=0;i<friends.length;i++) {
//			if(friends[i]!=null) {
//				//이름
//				if (!nameSearch.equals("") && !phoneSearch.equals("")) { //이름 && 전화번호
//					if(friends[i].getName().indexOf(nameSearch)!=-1 && friends[i].getPhone().indexOf(phoneSearch)!=-1) { 
//						System.out.println(friends[i].toString());
//					}
//				} else if (!phoneSearch.equals("")) { //전화번호
//					if( friends[i].getPhone().indexOf(phoneSearch)!=-1) {
//						System.out.println(friends[i].toString());
//					
//				} else if(!nameSearch.equals("")) { //이름
//					if(friends[i].getName().indexOf(nameSearch)!=-1 ) {
//						
//						System.out.println(friends[i].toString());
//					}
//					
//				}else {//엔터
//					System.out.println(friends[i].toString());
//				}
//			}
//		

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {

				// 이름 && 전화번호 -> 첫번째로 써주기
				if (!name.equals("") && !phone.equals("")) {
					if (friends[i].getName().indexOf(name) != -1 && friends[i].getPhone().indexOf(phone) != -1) {
						System.out.println(friends[i].toString());
					}
					// 전화번호
				} else if (!phone.equals("")) {
					if (friends[i].getPhone().indexOf(phone) != -1) {
						System.out.println(friends[i].toString());
					}
					// 이름
				} else if (!name.equals("")) {
					if (friends[i].getName().indexOf(name) != -1) {
						System.out.println(friends[i].toString());
					}
				} else { // 엔터, 엔터 ->전체 값 출력
					System.out.println(friends[i].toString());
				}
			}
		} // end of for

	}

	private void modify() {

		System.out.println("[친구목록]");
		for (int i = 0; i < friends.length; i++) {
			if(friends[i] != null)
			System.out.println("[" + i + "]" + friends[i].toString());
		}

		int num = ScanUtil.readInt("친구를 선택하세요");
		String phone = ScanUtil.readStr("바꿀 번호를 입력하세요");
		if(phone.equals("")) {
			friends[num].getPhone();
		}else {
		friends[num].setPhone(phone);
		}
		//if(!phone.equals(""))
//		friends[num].setPhone(phone); ->if와 else 대신 이렇게 하면 됨....

		if (friends[num] instanceof C05UnivFriend) {
			String major = ScanUtil.readStr("바꿀 전공을 입력하세요");
			if(major.equals("")) {
				((C05UnivFriend) friends[num]).getMajor();
			}else
			((C05UnivFriend) friends[num]).setMajor(major);
		} else if (friends[num] instanceof C06CompFriend) {
			String depart = ScanUtil.readStr("바꿀 부서를 입력하세요");
			if(depart.equals("")) {
				((C06CompFriend) friends[num]).getDepart();
			}else
			((C06CompFriend) friends[num]).setDepart(depart);
		}
		System.out.println("수정완료");
	}
	
	private void delete() {
		System.out.println("[친구목록]");
		for(int i=0; i<friends.length;i++) {
			if(friends[i] != null)
				System.out.println("[" + i + "]" + friends[i].toString());
		}
		int num = ScanUtil.readInt("삭제할 번호를 입력하세요");
//		for(int i=0;i<friends.length;i++) {
//			if(friends[i]!=null && friends[i].getName().indexOf(num)!=-1)
//				friends[i] =null;
//		}
		if(friends[num] !=null) {
			friends[num]=null;
			System.out.println("삭제 완료");
		}
		else if(friends[num] == null) {
			System.out.println("정보가 없습니다");
		}
	}
}

//		
//		
