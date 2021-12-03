package JavaPackage;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Arithmetic operators

		System.out.println("------------Arithmetic Operators--------");
		
		int a=10;
		int b=5;
		
		System.out.println("sum of a and b: " + (a+b));
		
		
		System.out.println("diff of a and b: " + (a-b));
		System.out.println("multi of a and b: " + (a*b));
		System.out.println("div of a and b: " + (a/b));
		System.out.println("mod of a and b: " + (a%b));
		
		//Relational operators
		
		System.out.println("-----------Relational Operators-----------");
		
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		
		//LOgical operators
		
		System.out.println("----------LOgical Operators----------");
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y);
		
		//Increment or Decrement operators
		
		System.out.println("----------Increment or Decrement Operators----------");
		
		//a++; //a+1
		//++a;
		//int z=a++;
		int z=++a;
		//System.out.println("c value: " +a);
		System.out.println("c value: " +z);
		b--; //b-1
		System.out.println("d value: " +b);
		
		
		
		
		
		
		
		
	}

}
