//1부터 100까지의 3의배수만 출력하는 코드
package basicLoop;

public class LoopTest {

	public static void main(String[] args) {
		int num;
		
		for(num =1; num<=100; num++) {
			if(num % 3 != 0)
				continue;
			System.out.println(num);
		}

	}

}
