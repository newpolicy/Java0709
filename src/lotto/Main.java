package lotto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	int [] lotto = new int[6];
	int size = lotto.length;
	int i=0;
	Scanner sc = new Scanner(System.in);
	
	
	
	//배열의 모든 데이터 출력
	for(; i<size; i++)
	{
		try {
			System.out.print("정수 입력: ");
		String temp = sc.nextLine();
		lotto[i] = Integer.parseInt(temp);
		if(lotto[i] < 1 || lotto[i] > 45)
		{
			System.out.println("1~45 숫자만 입력 하세요");
			i--;
			continue;
		}
		for(int k=0; k<i; k++)
		{
			if(lotto[k] == lotto[i])
			{
				System.out.println("중복된 숫자 입력 불가");
				i--; 
				continue;
			}
		}
		}
		catch(Exception e) {
			i--;
		System.out.println("정수를 입력 하세요");
		} 
		
	}
	for(i=0; i<size; i++) {System.out.print(i+1 +"번:"+lotto[i]+ " ");}
       sc.close();
	}

}
