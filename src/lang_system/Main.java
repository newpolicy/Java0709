package lang_system;

//import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		 
		 for(long i=0; i<1000; i++)
		 {
			 System.out.println("hello");
		 }

		 
		 System.out.println(System.getenv("path"));
		 System.out.println(System.getProperty("user.home"));
		 Runtime r = Runtime.getRuntime();
		 /*try {
		 r.exec("\"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe\"");
		 } catch (IOException e) {
			 e.printStackTrace();
			 }*/
		 String s1 = "hi";
		 System.out.println(s1);
		 long start =  System.currentTimeMillis();
		 String str = "hello";
		 int size = str.length();
		 for(int i=0; i<size; i++)
		 {
			 char ch = str.charAt(i);
			 System.out.println(ch);
		 }
		 long end = System.currentTimeMillis();
		 System.out.println((start-end)/1000.00000000 +"초 입니다");
	}
	 

}
