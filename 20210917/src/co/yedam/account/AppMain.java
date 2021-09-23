package co.yedam.account;

import java.util.Scanner;

public class AppMain {
	
	//싱글톤 : new 생성자 호출하면 새로운 인스턴스가 만들어진다
	private static AppMain singleton = new AppMain();
	
	//생성자 private -> 외부접근 막기
	private AppMain() {
		
	}
	
	// method getInstance()
	public static AppMain getInstance() {
		return singleton;
	}

	
	Account[] accountArray = new Account[100];
	 Scanner scanner = new Scanner(System.in);
	
	public void createAccount() { // 이정은 - 메소드 구현 1,2,3
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
//		String ano = readStr("계좌번호:");
//		String owner = readStr("계좌주:");
//		int balance = readInt("초기금액");
//		Account ac = new Account(ano, owner, balance);
//		for (int i = 0; i < accountArray.length; i++) {
//			if (accountArray[i] == null) {
//				accountArray[i] = ac;
//				break;
//			}
//		}
		System.out.println("결과: 계좌가 생성되었습니다.");

	}

	public void accountList() {
		System.out.println("계좌목록");
//		for (Account ac : accountArray) {
//			if (ac != null) {
//				System.out.printf("%s \t %s \t %d\n", ac.getAno(), ac.getOwner(), ac.getBalance());
//			}
//		}
	}

	public void deposit() {
		System.out.println("------");
		System.out.println("예금하기");
		System.out.println("------");
//		String searchAno = readStr("계좌번호: ");
//
//		if (findAccount(searchAno) != null) {
//			int money = readInt("예금액: ");
//			int newMoney = findAccount(searchAno).getBalance() + money;
//			findAccount(searchAno).setBalance(newMoney);
//			System.out.println("결과: 예금이 성공되었습니다.");
//		}
	}

	public void withdraw() { // 이정은
//		String searchAno = readStr("계좌번호: ");
//		if (findAccount(searchAno) != null) {
//			int money = readInt("출금액: ");
//			int minusMoney = findAccount(searchAno).getBalance() - money;
//			if (minusMoney < 0) {
//				System.out.println("출금가능액을 초과했습니다");
//			} else {
//				findAccount(searchAno).setBalance(minusMoney);
//				System.out.println("결과: 출금이 성공되었습니다");
//			}
//
//		}

	}

	public Account findAccount(String ano) {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null && accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		System.out.println("계좌를 잘못 입력하셨습니다");
		return null;
	}

	public void execute() {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("-------------");
		System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5종료");
		System.out.println("-------------");
		System.out.println("선택>>");
		int selectNo = scanner.nextInt();

		while (run) {
			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			} else {
				System.out.println("잘못된 값을 입력하였습니다");
			}

		}
	}
}
