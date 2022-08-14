package 문자열;

import java.util.Scanner;

public class BJ11720 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		int b= sc.nextInt();
		sc.nextLine();
		String a=sc.nextLine();
		int sum=0;
		String arr[]= a.split("");
		
		Integer[] iarr=new Integer[100];
		
		for(int i=0; i<arr.length;i++) {
			iarr[i]=Integer.parseInt(arr[i]);
			sum+=iarr[i];
			
		}
		

		System.out.println(sum);
		
		
		
	}
}
