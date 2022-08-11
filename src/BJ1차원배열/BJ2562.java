package BJ1차원배열;

import java.util.Scanner;

public class BJ2562 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] arr= new int[9];
		int max= 0;
		int num=0;
		for(int i=0; i<arr.length;i++) {
			int a= sc.nextInt();
			arr[i]= a;
		}
				
		for(int i=0; i<arr.length;i++) {
			if(max<arr[i])
				max=arr[i];
		}
		for(int i=0;i<arr.length;i++) {
			if(max==arr[i])
				num=i+1;
		}
		
		System.out.println(max);
		System.out.println(num);
		
	}
}
