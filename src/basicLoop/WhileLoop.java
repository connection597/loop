package basicLoop;

public class WhileLoop {

	public static void main(String[] args) {
		int num =1;
		int sum = 0;
		
		while(num <= 10) { // num값이 10보다 작거나 같은때
			sum += num; //
			num++;  //num에 1씩 더해나감
		}
		System.out.println("1부터 10까지 합은" +sum+"입니다");
		
	}

}
