package basicLoop;

public class BreakLoop2 {

	public static void main(String[] args) {
		int sum =0;
		int num =0;
		
		for(num =0; ; num++) {
			sum += num;
			if(sum>=100)  //sum이 100보다 크거거 같을때
				break; //반복문 중단
		}
		System.out.println("num: " +num);
		System.out.println("sum: " +sum);

	}

}
