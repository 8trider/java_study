package day4_ex;

public class MethodLab1 {

	public static void main(String[] args) {
		printTitle();
		System.out.println();
		System.out.printf("가격은 %,d원입니다.", getPrice()); // 천원 단위로 ,를 적용하려면 printf 쓰기
	}

	static void printTitle() {
		System.out.print("우리의 자바교재명은 <혼자 공부하는 자바>입니다.");
	}

	static int getPrice() {
		return 24000;
	}

}
/*
 * 1. 클래스명 : MethodLab1
 * 
 * 2. 구현해야 하는 추가 메서드 2개 (static 붙여서)
 * 
 * 매개변수 : 없음 리턴값 : 없음 메서드명 : printTitle 기능 : 우리 자바 교재의 책제목을 화면에 출력한다.(개행처리 제외)
 * 
 * 매개변수 : 없음 리턴값 : int 메서드명 : getPrice 기능 : 우리 자바 교재의 책 가격을 리턴한다.
 * 
 * 3. main() 메서드에서는 위에 정의한 메서드들을 호출하고 다음과 같은 결과가 출력되도록 구현한다.
 * 
 * [ 실행 결과 ]
 * 
 * 우리의 자바교재명은 <혼자 공부하는 자바>입니다. 가격은 24,000원입니다.
 */
