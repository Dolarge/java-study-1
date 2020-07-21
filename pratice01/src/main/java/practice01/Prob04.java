package practice01;

import java.util.Scanner;

public class Prob04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String word;  			//문자열
		
		System.out.println(" 문자열을 입력하세요. : ");
		word = scanner.nextLine();
		
		for(int i=0; i<word.length(); i++) {
			for(int j=0; j<word.length();i++) {
				int num = i + j;
			System.out.println(word.charAt(num));
			}
		}
	}
}

//실패