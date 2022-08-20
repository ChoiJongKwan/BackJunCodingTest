package study;

import java.util.Scanner;

public class BJ10103 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=100,b=100;
		int c=sc.nextInt();
		for(int i=0; i<c;i++) {
			int d=sc.nextInt();
			int e=sc.nextInt();
			if(d>e) {
				b-=d;
			}else if (d<e) {
				a-=e;
			}else {
				continue;
			}
			
		}
		System.out.println(a);
		System.out.println(b);

	}
}
