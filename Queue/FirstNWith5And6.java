package com.rakesh.Queue;

import java.util.Scanner;

public class FirstNWith5And6 {
	
	public static void firstN(int n)
	{
		while(n!=0)
		{
			int no=5;
			int start=no;
			while(start!=0)
			{
				int lastDigit = start%10;
				if(lastDigit!=5 || lastDigit!=6)
					break;
				start=start/10;
			}
			if(start==0)
			{
				System.out.print(no+" ");
				n--;
			}
			no++;
		}

	}
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		firstN(5);

	}

}
