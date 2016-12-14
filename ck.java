package CK;

import java.util.Scanner; 

public class ck {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int i,j,n;
		double e=1.0,sum=1.0;
		System.out.println("请输入一个正整数:");
		n=sc.nextInt();
		for(i=1;i<n+1;i++){
			sum=1;
			for(j=1;j<i+1;j++){
				sum=sum*j;
			}
			e=e+i/sum;
		}
		System.out.println(String.format("e=%.5f",e)); 
	}

}
