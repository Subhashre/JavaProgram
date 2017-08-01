package org.subha.corejavapractice;

interface InterfaceDemo {

	public default void printMessage() {
		System.out.println("Message of the Day");
	}

	public static void printID() {
		System.out.println("Id of the Day");
	}
	
	public void printError();
	

	public void printError1(int i);

}

public class CallInterface {
	public static void main(String[] args) {
//		InterfaceDemo interfaceDemo = new InterfaceDemoImpl();
//		interfaceDemo.printMessage();
//		InterfaceDemo.printID();
		
//		InterfaceDemo interfaceDemo = ()-> System.out.println("Error of the daY");
//		interfaceDemo.printError();
		
//		InterfaceDemo interfaceDemo1 = (i)-> System.out.println("Error of the daY"+i);
//		interfaceDemo1.printError1(5);
	
	}

}

//class InterfaceDemoImpl implements InterfaceDemo {
//
//}
