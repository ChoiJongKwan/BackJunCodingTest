import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		String A= sc.nextLine();
		String[] carr= A.split("");

		int a = 0,b= 0,c= 0,d= 0,e= 0,f= 0,g= 0,h= 0,i= 0,j= 0,k=0,l= 0,n= 0,m= 0,o= 0,p= 0,q= 0,r= 0,s= 0,t= 0,u= 0,v= 0,w= 0,x=0,y=0,z=0;

		for(int ii=0; ii<carr.length;ii++) {

			if(carr[ii].equals("a")||carr[ii].equals("A")) {

				a++;
			}
			else if (carr[ii].equals("b")||carr[ii].equals("B")) {

				b++;
			}else if (carr[ii].equals("c")||carr[ii].equals("C")) {
				if(c==0)c++;
			}else if (carr[ii].equals("d")||carr[ii].equals("D")) {
				if(d==0)d++;
			}else if (carr[ii].equals("e")||carr[ii].equals("E")) {
				e++;
			}else if (carr[ii].equals("f")||carr[ii].equals("F")) {
				f++;
			}else if (carr[ii].equals("g")||carr[ii].equals("G")) {
				g++;
			}else if (carr[ii].equals("h")||carr[ii].equals("H")) {
				h++;
			}else if (carr[ii].equals("i")||carr[ii].equals("I")) {
				i++;
			}else if (carr[ii].equals("j")||carr[ii].equals("J")) {
				j++;
			}else if (carr[ii].equals("k")||carr[ii].equals("K")) {
				k++;
			}else if (carr[ii].equals("l")||carr[ii].equals("L")) {
				l++;
			}else if (carr[ii].equals("m")||carr[ii].equals("M")) {
				m++;
			}else if (carr[ii].equals("n")||carr[ii].equals("N")) {
				n++;
			}else if (carr[ii].equals("o")||carr[ii].equals("O")) {
				o++;
			}else if (carr[ii].equals("p")||carr[ii].equals("P")) {
				p++;
			}else if (carr[ii].equals("q")||carr[ii].equals("Q")) {
				q++;
			}else if (carr[ii].equals("r")||carr[ii].equals("R")) {
				r++;
			}else if (carr[ii].equals("s")||carr[ii].equals("S")) {
				s++;
			}else if (carr[ii].equals("t")||carr[ii].equals("T")) {
				t++;
			}else if (carr[ii].equals("u")||carr[ii].equals("U")) {
				u++;
			}else if (carr[ii].equals("v")||carr[ii].equals("V")) {
				v++;
			}else if (carr[ii].equals("w")||carr[ii].equals("W")) {
				w++;
			}else if (carr[ii].equals("x")||carr[ii].equals("X")) {
				x++;
			}else if (carr[ii].equals("y")||carr[ii].equals("Y")) {
				y++;
			}else if(carr[ii].equals("z")||carr[ii].equals("Z")) {
				z++;
			}
			
			String AA=(String)a;
		

		}

		
		
	}
}


