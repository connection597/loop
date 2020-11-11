package basicLoop;

public class ContinuteLoop {

	public static void main(String[] args) {
		int total =0;
		int num;
		
		for(num=1; num<=100; num++) { // 100까지 반복
			if(num%2 ==0)  // num짝수인 경우
				continue;   // 이후 수행 생략하고 num++만 수행
			total +=num;   // num은 홀수인 경우에만 수행
		}
        System.out.println("1부터 100까지 홀수의 합은" +total+"입니다");
	}

}
