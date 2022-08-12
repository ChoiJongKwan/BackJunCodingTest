package BJ1차원배열;

import java.util.ArrayList;
import java.util.Scanner;

public class BJ4344 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int a= sc.nextInt();
		int[] arr= new int[a];
		ArrayList<Integer> al= new ArrayList();
		for(int i=0;i<arr.length;i++) {
			int b= sc.nextInt();
			double sum=0;
			double avg=0;
			double stdavg=0;
			int std=0;
			for(int j=0; j<b;j++) {
			Integer c=sc.nextInt();
			al.add(c);
			}
			for(int j=0; j<al.size();j++) {
				sum+=al.get(j);
			}
			avg=(Double)sum/b;
			for(int j=0;j<al.size();j++) {
				if(al.get(j)>avg)
					std++;
			}
			
			
			

			stdavg=(double)std/b*100;
			
			System.out.println(al.get(2));
			System.out.println(al.toString());
			System.out.printf("%.3f%% \n",stdavg);
			al.removeAll(al);
		}
	
		
		
		
	}
}
