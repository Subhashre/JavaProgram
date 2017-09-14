package org.subha.concept.inheritance;

import org.subha.dto.Car;
import org.subha.dto.Maruti;

public class inheritanceCovariant {

	public static void main(String[] args) {
		Car c=new BB().printCarDetails();
		c.setName("barsha");
		System.out.println(c.toString());
	}
}

interface AAAA{
	Car printCarDetails();
}

class BB implements AAAA{

	public Maruti printCarDetails(){
		return new Maruti();
	}

}