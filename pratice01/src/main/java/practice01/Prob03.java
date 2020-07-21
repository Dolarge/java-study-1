package practice01;

import java.util.Scanner;

public class Prob03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in );
		int num, total = 0;
		System.out.println("숫자를 입력하세요");
		num= scanner.nextInt();
		
		if(num%2 == 0) {
			for(int i=2;i<=num;i=i+2) {
				total = total + i;
			}
		}
		else {
			for(int i=1;i<=num;i=i+2) {
				total = total + i;
			}
		}
		
		System.out.println("결과 값 : " + total);
		
	}
}
