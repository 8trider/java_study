package day1;

public class OperTest9 {
	public static void main(String[] args) {
		int num = 100;
		num++;
		System.out.println(num); // 101
		++num;
		System.out.println(num); // 102
		--num;
		System.out.println(num); // 101
		num--;
		System.out.println(num); // 100
		System.out.println("---------------------");
		int result;
		result = num;
		System.out.println(result + " : " + num);
		result = num + 1;
		System.out.println(result + " : " + num);
		result = ++num;
		System.out.println(result + " : " + num);
		result = num++;
		System.out.println(result + " : " + num);
	}
}
