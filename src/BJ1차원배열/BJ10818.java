package BJ1차원배열;

import java.util.Arrays;
import java.util.Scanner;

public class BJ10818 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int[] Arr= new int[a];
		
		for(int i=0;i<Arr.length;i++) {
			int b= sc.nextInt();
			Arr[i]=b;
			
		}
		Arrays.sort(Arr);
		System.out.println(Arr[0]+" "+Arr[Arr.length-1]);
		
	}
}
