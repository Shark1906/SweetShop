package com.sweetshop.demo;
import java.util.List;
import java.util.Objects;

public class Sweet {
	enum Shape {
		TRIANGLE, SQUARE, ROUND
	}

	enum Color {
		RED, GREEN, YELLOW, BLACK, BLUE, WHITE
	};
	Shape shape;
	String name;
	Color color;
	float price;
	List<String> ingredient;

	@Override
	public int hashCode() {
		return Objects.hash(color, ingredient, name, price, shape);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sweet other = (Sweet) obj;
		return color == other.color && Objects.equals(ingredient, other.ingredient) && Objects.equals(name, other.name)
				&& Float.floatToIntBits(price) == Float.floatToIntBits(other.price) && shape == other.shape;
	}


	@Override
	public String toString() {
		return "[name=" + name + ", shape=" + shape + ", color=" + color + ", price=" + price + ", ingredient="
				+ ingredient + "]";
	}
	
	

}
