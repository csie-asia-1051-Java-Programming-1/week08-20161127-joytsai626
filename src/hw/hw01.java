package hw;

import java.util.Scanner;

/*
 * Topic: 請寫一個 遞迴函式)進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 1050210XX 周永振老師
 */
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	       int n = scn.nextInt();
	       System.out.println(fun1(n));
		}
	   public static int fun1(int n1){
	//(n1%2)+((n1/2)%2*10)+((n1/4)%2*100)+((n1/8)%2*1000);
		   int sum = 0,sum2 = 0,a = 1;
		   if(n1 == 0){
		 return  n1;
		   }else{
         return (n1/2%2)*(a*10) ;
	}
  }
}
//sum = n1%2;
//n1=n1/2;
//sum2 = sum2+sum*a;
//a = a*10;
