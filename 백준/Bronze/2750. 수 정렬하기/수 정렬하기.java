import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    int arr[] = new int[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
	}
}