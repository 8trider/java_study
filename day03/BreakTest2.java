package day03;

public class BreakTest2 {      

	public static void main(String[] args) {
		int result;
		unico: for(int dan = 1; dan <= 9; dan++) {
			for(int num=1; num <= 9; num++) {
				result = dan*num;
				if (result >= 30)
					break unico; // 라벨 지정 기능
				System.out.print(dan + "x" + num + "=" + result + "\t");
			}
			System.out.println();
		}		
	}
}