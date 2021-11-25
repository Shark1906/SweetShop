package com.sweetshop.demo;

import java.util.ArrayList;

public class Rasgulla extends Sweet {
	public Rasgulla() {
		name = "Rasgulla";
		shape = shape.ROUND;
		color = color.WHITE;
		ingredient = new ArrayList();
		ingredient.add("Sugar");
		ingredient.add("Milk");
	}
}
