package practice01;

public class Prob05 {

	public static void main(String[] args) {
		
		
	
		int num_hun,num_ten, num_one;
		//백,십,일의 자리이면 짝 
		for(int i=1; i<101;i++) {
			num_hun = i/100;
			num_ten = (i%100)/10;
			num_one = (i%100)%10;
			
			int count=0; // 짝 갯수 세기
			
			System.out.println("백의자리"+num_hun+"십의 자리 "+num_ten+"일의 자리 "+num_one);
			
			if((num_one == 3 || num_one == 6 || num_one == 9  )&& (num_ten == 3 || num_ten == 6 || num_ten == 9 ) && (num_hun == 3 || num_hun == 6 || num_hun == 9 )){
				count++;
			}
			else {
				
			}
			if(count>=1) {
			System.out.print(i);
			for(int j=0;count>=j;j++) {
				System.out.print("짝");
			}
			System.out.println(" ");
			}
			
			
		} 
	}
}
