package 수학1;

import java.util.Scanner;

public class BJ10250 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		
		
		for(int i=0;i<a;i++) {
			int b=sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			int sum= d/b;
			int tmp= d%b;
			if(tmp==0) {
				System.out.println(b*100+ sum);
			}else {
				System.out.println(tmp*100+(sum+1));
			}

		}
	
	}
}
