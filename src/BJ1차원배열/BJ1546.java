package BJ1차원배열;

import java.util.Arrays;
import java.util.Scanner;

public class BJ1546 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double sum = 0,avg=0,max=0;
		
		int a=sc.nextInt();
		double[] arr= new double[a];
		
		for(int i=0;i<arr.length;i++) {
			int b=sc.nextInt();
			arr[i]=b;
		}
		Arrays.sort(arr);
		max=arr[arr.length-1];
		
		for(int i=0;i<arr.length;i++) {
			sum+=(Double)arr[i]/max*100;
			
		}
		avg=sum/arr.length;
		System.out.printf("%.2f",avg);	
	}
}
