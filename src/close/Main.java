package close;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x= -1;
		Scanner sc =new Scanner(System.in);
		while (true)
		{
			
			System.out.println("숫자 입력: ");
			String temp = sc.nextLine();
			
			try{ 
			x= Integer.parseInt(temp);
			break;
			}
			catch(Exception e) {System.out.println("숫자만 입력 가능합니다.");}
		}
		System.out.println(x);
	    sc.close();

	}

}
