package c01co.yedam;

import java.util.Scanner;

public class ScanUtil { // 다른 패키지에서도 접근할 수 있게 public
	static Scanner scn = new Scanner(System.in);

	public static int readInt(String msg) {
		System.out.print(msg);
		int num = scn.nextInt();
		scn.nextLine();
		return num;
	}

	public static String readStr(String msg) {
//		if(scn.hasNextLine()) { //엔트키가 없어서
//			scn.nextLine();
//		}
		System.out.println(msg);
		return scn.nextLine();
	}
}
