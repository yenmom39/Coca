package fistProgram;

public class DemoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="My name is sokha Dyna";
		
		String str1 ="I am a student.";
		//Primitive	
		int num = 1000;
		
		//output
		
		System.out.println("String str" + str);
		
		//length
		System.out.println("Leagth " + str.length());
		
		//uppercase
		System.out.println("Uppercase " + str.toLowerCase());
		
		//search
		System.out.println("Index " + str.indexOf("sokha"));
		
		//concat
		System.out.print("str1" + str + str1);
		System.out.print(str.concat(str1));
		System.out.println("Int Value : " + num);
		
		
	}

}
