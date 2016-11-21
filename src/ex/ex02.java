package ex;
/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換
 * Date: 2016/11/21
 * Author: 105021013
 */
import java.util.Scanner;
public class ex02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
	       int a = scn.nextInt();
	       int b = scn.nextInt();
	       b = b/10;
	       int n = 0;
	       while(a>0){
	    	   n = n+(a%10)*b;
	    	   a = a/10;
	    	   b = b*b;
	       }
	       int m = scn.nextInt();
	       fun1(n,m);
		}
	   public static void fun1(int n1,int m1){
	//(n1%2)+((n1/2)%2*10)+((n1/4)%2*100)+((n1/8)%2*1000);
		   int sum = 0,sum2 = 0,a = 1;
		   while(n1>0){
	        sum = n1%2;
	        n1=n1/2;
	        sum2 = sum2+sum*a;
	        a = a*10;
		   }
		   System.out.println(sum2);
	   }
}
