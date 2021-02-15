package com.cg.oopd.ui;

import com.cg.oopd.model.CircularHoarding;
import com.cg.oopd.model.Estimator;
import com.cg.oopd.model.RectangularHoarding;


public class EstimatorApp {

	public static void main(String[] args) {
		Estimator e1 = new Estimator(105, 55); 
		RectangularHoarding r = new RectangularHoarding(10, 5.2);
		CircularHoarding c = new CircularHoarding(2.5);
		
		System.out.println(e1.getBorderCost(r) + e1.getPaintCost(r));
		System.out.println(e1.getBorderCost(c) + e1.getPaintCost(c));
	}

}
