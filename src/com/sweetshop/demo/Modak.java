package com.sweetshop.demo;

import java.util.ArrayList;

public class Modak extends Sweet {
	public Modak() {
		name = "Modak";
		shape = shape.ROUND;
		color = color.YELLOW;
		ingredient = new ArrayList();
		ingredient.add("Sugar");
		ingredient.add("Milk");
		ingredient.add("Dryfruits");
	}

}
