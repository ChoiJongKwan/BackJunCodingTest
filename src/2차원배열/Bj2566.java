package backjun;

import java.util.Scanner;

public class Bj2566 {

	public static void main(String[] args) {
		int[][] arr= new int[9][9];
		int x=0, y=0;
		Scanner sc= new Scanner(System.in);
		
		int max= -1;
		
		for(int i=0; i<9;i++) {
			for(int j=0; j<9;j++) {
				arr[i][j] = sc.nextInt();	
				if(arr[i][j]>max) {
					max=arr[i][j];
					x=i+1;
					y=j+1;
				}
				
			}
			
		}
		System.out.println(max);
		System.out.print(x+" "+y);
		

	}

}
