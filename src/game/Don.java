package game;

import java.util.Scanner;

public class Don {
	public static void money() {
		System.out.print("얼마 입니까?: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a/50000 >= 1)
		{
			int k = a/50000;
			int j = (a%50000)/10000;
			System.out.print("5만원권 " + k +"장, 1만원권 " +j+"장 입니다.");
		}
		else
		{
			int j=a/10000;
			System.out.println("1만원권 "+j+"장 입니다.");
		}
		System.out.println("\n");
	}

}
