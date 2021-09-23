package c07co.yedam.inherit;

public class IndexOfExample {
	public static void main(String[] args) {
		String name ="홍길동";
		System.out.println(name.indexOf("길동")!=-1); //문자열 포함된 걸 찾는 것, 내가 찾으려는 값이 여기 있다 !=-1
		System.out.println(name.equals("홍길동")); //찾으려는 문자열이 무족건 똑같아야함
	}

}
