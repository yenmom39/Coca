package fistProgram;

public class DemoTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c = 127;
		int a = c;
		double b = a;
		
		System.out.println(a);
		System.out.println(b);
		
		//2 Narrowing casting -> manual
		// double >> float >> int >> char >>short >>byte 
		
		double d = 3.14;
		int i  = (int)d; 
		long l = (long)d;
		
		System.out.println("Double to int : " + i);
		System.out.println("Double to long : " + l);
		
		//String -> int -> double -> long -> byte....
		
		String  s = "3.14";
		double sDoub = Double.valueOf(s);
		double sumDoub = sDoub + 3.1;
		System.out.println("String -> double : " + sDoub);
		System.out.println("Sum Double : " + sumDoub);
		
		
		String s1 = "127";
		byte sByte = Byte.valueOf(s1);
		System.out.println("String -> byte : " + sByte);
		
		// int , long , short ,double -> string;
		
		long num =1234;
		String stNum = String.valueOf(num);
		System.out.print("long -> string : " + stNum + 567);
		
	}

}
