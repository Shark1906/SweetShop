package com.sweetshop.demo;

import java.util.ArrayList;

public class Milkcake extends Sweet {
	public Milkcake() {
		name = "Milkcake";
		shape = shape.SQUARE;
		color = color.WHITE;
		ingredient = new ArrayList();
		ingredient.add("Sugar");
		ingredient.add("Milk");
	}
}
