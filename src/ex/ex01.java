package ex;
/*
 * Topic: 請寫一個函式 (不是遞迴) 進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 105021013
 */
import java.util.*;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       fun1(n);
	}
   public static void fun1(int n1){
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
