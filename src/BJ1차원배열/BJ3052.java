package BJ1차원배열;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class BJ3052 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Integer[] arr= new Integer[10];

		for(int i=0; i<arr.length;i++) {
			int a= sc.nextInt();
			arr[i]= a;
		}
		for(int i=0; i<arr.length;i++) {
			arr[i]=arr[i]%42;
			
		}
		HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(arr));
		Integer[] rArr= hashSet.toArray(new Integer[0]);
		
		System.out.println(rArr.length);
	}
}
