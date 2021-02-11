package com.cg.oopd.ui;

import com.cg.oopd.model.ComplexNumber;

public class ComplexNumberApp {

	public static void main(String[] args) {
		ComplexNumber c1 = new ComplexNumber();
		System.out.println(c1.getRealPart());
		System.out.println(c1.getImaginaryPart());
		
		ComplexNumber c2 = new ComplexNumber();
		System.out.println(c2.getRealPart());
		System.out.println(c2.getImaginaryPart());
		
		ComplexNumber c3 = new ComplexNumber(5);
		System.out.println(c3.getRealPart());
		System.out.println(c3.getImaginaryPart());
		
		ComplexNumber c4 = new ComplexNumber(4,7);
		System.out.println(c4.getRealPart());
		System.out.println(c4.getImaginaryPart());
		
		ComplexNumber c5 = c4;		// object initialization statement - no new object is created.
		System.out.println(c5.getRealPart());
		System.out.println(c5.getImaginaryPart());
		
		System.out.println("----------------------------");
		
		c5.setRealPart(5);
		c5.setImaginaryPart(8);
		System.out.println(c5.getRealPart());
		System.out.println(c5.getImaginaryPart());
		
		System.out.println("----------------------------");
		
		System.out.println(c4.getRealPart());
		System.out.println(c4.getImaginaryPart());
		
		System.out.println("----------------------------");
		
		ComplexNumber c6 = new ComplexNumber(c4);	// copy constructor is called
		System.out.println(c6.getRealPart());
		System.out.println(c6.getImaginaryPart());
		
		c4.setRealPart(40);
		c4.setImaginaryPart(70);
		
		System.out.println("----------------------------");
		
		System.out.println(c4.getRealPart());
		System.out.println(c4.getImaginaryPart());
		
		System.out.println(c6.getRealPart());
		System.out.println(c6.getImaginaryPart());
		
		
		
		
		
		
	
		
//		c1.setRealPart(5);
//		c1.setImaginaryPart(6);
//		
//		System.out.println(c1.getRealPart());
//		System.out.println(c1.getImaginaryPart());
//		
//		ComplexNumber c2 = new ComplexNumber();
//		c2.setRealPart(-2);
//		c2.setImaginaryPart(4);
//		System.out.println(c2.getRealPart());
//		System.out.println(c2.getImaginaryPart());
//		
//		c1.setRealPart(50);
//		System.out.println(c1.getRealPart());
//		System.out.println(c1.getImaginaryPart());
	}

}
