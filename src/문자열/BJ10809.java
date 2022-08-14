package 문자열;

import java.util.Scanner;

public class BJ10809 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		String A= sc.nextLine();
		String[] carr= A.split("");
	
		int a = -1,b= -1,c= -1,d= -1,e= -1,f= -1,g= -1,h= -1,i= -1,j= -1,k=-1,l= -1,n= -1,m= -1,o= -1,p= -1,q= -1,r= -1,s= -1,t= -1,u= -1,v= -1,w= -1,x=-1,y=-1,z=-1;
		
		for(int ii=0; ii<carr.length;ii++) {
			
			if(carr[ii].equals("a")) {
				if(a==-1) 
				a=ii;
			}
			else if (carr[ii].equals("b")) {
				if(b==-1) {
				b=ii;}
			}else if (carr[ii].equals("c")) {
				if(c==-1)c=ii;
			}else if (carr[ii].equals("d")) {
				if(d==-1)d=ii;
			}else if (carr[ii].equals("e")) {
				if(e==-1)e=ii;
			}else if (carr[ii].equals("f")) {
				if(f==-1)f=ii;
			}else if (carr[ii].equals("g")) {
				if(g==-1)g=ii;
			}else if (carr[ii].equals("h")) {
				if(h==-1)	h=ii;
			}else if (carr[ii].equals("i")) {
				if(i==-1)		i=ii;
			}else if (carr[ii].equals("j")) {
				if(j==-1)	j=ii;
			}else if (carr[ii].equals("k")) {
				if(k==-1)	k=ii;
			}else if (carr[ii].equals("l")) {
				if(l==-1)	l=ii;
			}else if (carr[ii].equals("n")) {
				if(n==-1)	n=ii;
			}else if (carr[ii].equals("m")) {
				if(m==-1)	m=ii;
			}else if (carr[ii].equals("o")) {
				if(o==-1)	o=ii;
			}else if (carr[ii].equals("p")) {
				if(p==-1)	p=ii;
			}else if (carr[ii].equals("q")) {
				if(q==-1)	q=ii;
			}else if (carr[ii].equals("r")) {
				if(r==-1)		r=ii;
			}else if (carr[ii].equals("s")) {
				if(s==-1)	s=ii;
			}else if (carr[ii].equals("t")) {
				if(t==-1)	t=ii;
			}else if (carr[ii].equals("u")) {
				if(u==-1)	u=ii;
			}else if (carr[ii].equals("v")) {
				if(v==-1)	v=ii;
			}else if (carr[ii].equals("w")) {
				if(w==-1)	w=ii;
			}else if (carr[ii].equals("x")) {
				if(x==-1)	x=ii;
			}else if (carr[ii].equals("y")) {
				if(y==-1)	y=ii;
			}else if(carr[ii].equals("z")) {
				if(z==-1)	z=ii;
			}
			
		}
		System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h+" "+i+" "+j+" "+k+" "+l+" "+m+" "+n+" "+o+" "+p+" "+q+" "+r+" "+s+" "+t+" "+u+" "+v+" "+w+" "+x+" "+y+" "+z);
	}

}
