package game;

public class Game {
	
	public static void ma() {
	    int x=0;
		int y=0;
		for(; x<5; x++)
		{
			if(x<3) {
			for(y=0; y<3-x; y++)
			{
				System.out.print("*");
			}
			System.out.println("");
			}
			else {
				for(y=0; y<x-1; y++)
				{
					System.out.print("*");
				}
				System.out.println("");
			}
			
			}
		System.out.println("------------------------------\n");
		for(x=0; x<5; x++)
		{
			for(y=1; y<=9-(2*x); y++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		int k=0;
		int o=0;
		for(x=5; x<=5+k; x++)
			System.out.println(o);
			for(y=5; y>=5-k; y--)
			{
				o++;
				System.out.println(o);
				
			}
		
		k++;
		
	}
		
		
	}


