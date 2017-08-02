package org.subha.concept.anonymous;

public class AnonymousWithArgument {

	public static void main(String[] args) {

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i < 10; i++) {
					System.out.println("Inside the Child Thread");
				}
			}
		});
		thread.start();
		for(int i=1;i<10 ; i++){
			System.out.println("Inside the Main Thread");
		}
	}

}
