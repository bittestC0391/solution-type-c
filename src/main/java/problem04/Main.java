package problem04;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan1 = sc.nextInt();
		int dan2 = sc.nextInt();
		int d1=dan1;
		int num = sc.nextInt();
		int total_num = sc.nextInt();
		int t=total_num;
		int[][] arr = new int[dan2+1][num];
		
		while(total_num > 0) {
			for(int i=0;i<num;i++) {
				int randomNumber1 = new Random().nextInt(dan2)+1;
				System.out.print(dan1 + "x" + randomNumber1 +" ");
				arr[dan1][i]=randomNumber1;
			}
			System.out.println();
			dan1++;
			total_num=total_num-num;
		}
		int sum=0;
		for(int i=0;i<t;i++) {
			System.out.println(i+". "+ d1+"x"+arr[d1][i] +"?");
			sum=sum+d1*arr[d1][i];
			System.out.println(sum);
			System.out.println(".  "+sum+" . ");
			d1++;
		}
		
		
		
	}
}