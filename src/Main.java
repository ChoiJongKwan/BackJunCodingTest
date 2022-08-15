import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int point=0;
	
		for(int i=0;;i++) {
			if((A+B)-(B*i)<=0) {
			point=i;
			System.out.println((A+B)-(B*i));
				break;}
		}
		System.out.println(point);
		
		
	}
}



