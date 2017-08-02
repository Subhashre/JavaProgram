package org.subha.concept.anonymous;

public class AnonymousClass1 {

	public static void main(String[] args) {

		A a = new A() {
			void showMessage() {
				System.out.println("Anonymous class method.");
			}
		};
		a.showMessage(); // Anonymous class method.

		System.out.println(a.getClass().getName());
		a = new A();
		a.showMessage(); // A class method.
		System.out.println(a.getClass().getName());
		Interface i = new Interface() {

			@Override
			public void showError() {
				System.out.println("override method of Interface . ");
			}
		};

		i.showError();// override method of Interface .
		System.out.println(i.getClass().getName());

		int[] intArr = new int[] { 10, 20, 30 };

		for (int arr : intArr) {
			System.out.println(arr);

		}
		
		Thread thread = new Thread(){
			
			public void run(){
				for(int i=0;i<10;i++){
					System.out.println("Inside Child Thread");
				}
			}
		};
		thread.start();

		for(int ii=0;ii<10;ii++){
			System.out.println("Inside main Thread");
		}
		
		Runnable runnable = new Runnable() {
			public void run() {
				for(int ii=0;ii<10;ii++){
					System.out.println("Inside1 Child Thread");
				}		
			}
		};
		Thread thread2 = new Thread(runnable);
		thread2.start();
		for(int ii=0;ii<10;ii++){
			System.out.println("Inside main1 Thread");
		}
	}

}

class A {
	void showMessage() {
		System.out.println("A class method.");
	}
}

interface Interface {
	void showError();
}

/*
 * Output: Anonymous class method.
 *  A class method.
 *  override method of Interface
 * . 10 20 30
 */