package BJ1차원배열;

import java.util.Scanner;

public class Bj8958 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		String[] sarr= new String[a];
		sc.nextLine();
		for(int i=0; i<sarr.length;i++) {
			
			String b= sc.nextLine();
			sarr[i]=b;
		}
		int count=0;
		int sum=0;
		for(int i=0; i<sarr.length;i++) {
			for(int j=0;j<sarr[i].length();j++) {
				char ch=sarr[i].charAt(j);
				if(ch=='O') {
					count+=1;
					sum+=count;
				}else {
					count=0;
				}
			
			}		
			System.out.println(sum);
			sum=0;
			count=0;
		}
		
	}
}
