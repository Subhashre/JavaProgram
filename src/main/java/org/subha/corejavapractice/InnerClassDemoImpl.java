package org.subha.corejavapractice;

public class InnerClassDemoImpl {
	
	public static void main(String[] arr)
	{
		InnerClassDemo innerClassDemo = new InnerClassDemo();
		InnerClassDemo.InnerClass innerClass = innerClassDemo.new InnerClass();
		innerClass.printId();
	}
}

class InnerClassDemo{
	private int id;
	String name;
	
	class InnerClass{
		public void printId(){
			System.out.println("Id is :" + id);
		}
	}	
}

