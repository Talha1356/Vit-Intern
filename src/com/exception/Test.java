package com.exception;

import java.io.FileInputStream;


//FileNotFoundException:-
//public class Test {
//
//	public static void main(String[] args) {
//		
//		//new FileInputStream("tt.txt");// error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//
//	}
//
//}


//InterruptedException:

//class Test 
//{
	//public static void main(String[] args) 
	//{
	//	Thread.sleep(2000);//Test.java:5: error: unreported exception InterruptedException; must be caught or declared to be thrown
     //         Thread.sleep(2000);
	//}
//}


//ClassNotFoundException:
//class A
//{
//
//	static
//	{
//		System.out.println("class- A static block");
//	}
//
//}
//class Test 
//{
//	public static void main(String[] args) 
//	{
//		//Class.forName("A"); //error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
//	}
//}


//ArithmeticException:
//class Test 
//{
//	public static void main(String[] args) 
//	{
//		//System.out.println(100/0);//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	}
//}


//ArrayIndexOutOfBoundsException:
//class Test{
//	public static void main(String[] args) {
//		int []a= {1,2,3};
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 3
//	}
//}

//StringIndexOutOfBoundsException: 

//class Test 
//{
//	public static void main(String[] args) 
//	{
//		
//		String str="Talha";
//		System.out.println(str.charAt(4));
//		System.out.println(str.charAt(6));//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 6
//
//	}
//}


//NullPointerException:-
//class Test 
//{
//	int i=10;
//	static Test t;
//	public static void main(String[] args) 
//	{
//		System.out.println(t);
//		System.out.println(t.i);//Exception in thread "main" java.lang.NullPointerException: Cannot read field "i" because "Test.t" is null
//
//	
//	}
//}


//Error
class Test 
{
	
	public static void main(String[] args) 
	{
		int[] a= new int[1000000000];//Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
	
	}
}
