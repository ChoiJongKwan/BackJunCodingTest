package study;

import java.util.Scanner;

public class BJ15953 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);	
		
		int a=sc.nextInt();
		int[] sum=new int[a];
		for(int i=0;i<a;i++) {
			int b=sc.nextInt();
			int c=sc.nextInt();
			
			switch (b) {
			case 1:
				sum[i]+=5000000;
				break;

			case 2 :case 3:
				sum[i]+=3000000;
				break;
				
			case 4 :case 5 :case 6:
				sum[i]+=2000000;
				break;	
				
			case 7 :case 8:case 9 :case 10:
				sum[i]+=500000;
				break;	
			case 11 :case 12:case 13 :case 14:case 15 :
				sum[i]+=300000;
				break;	
			case 16:case 17 :case 18:case 19 :case 20: case 21:
				sum[i]+=100000;
				break;
			default:
				break;
			}
			switch (c) {
			case 1:
				sum[i]+=5120000;
				break;

			case 2 :case 3:
				sum[i]+=2560000;
				break;
				
			case 4 :case 5 :case 6:case 7:
				sum[i]+=1280000;
				break;	
				
			case 8:case 9 :case 10:case 11 :case 12:case 13 :case 14:case 15 :
				sum[i]+=640000;
				break;	
			
				
			case 16:case 17 :case 18:case 19 :case 20:case 21:case 22 :case 23:case 24:case 25:case 26 :case 27:case 28 :case 29:case 30:case 31:
				sum[i]+=320000;
				break;
				
			default:
				break;
			}
			
		}
		for(int i=0; i<sum.length;i++) {
			System.out.println(sum[i]);
		}
		
	}

}
