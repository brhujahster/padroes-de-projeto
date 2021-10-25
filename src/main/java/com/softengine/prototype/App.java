package com.softengine.prototype;

import java.util.ArrayList;
import java.util.List;

import com.softengine.prototype.shapes.Circle;
import com.softengine.prototype.shapes.Rectangle;
import com.softengine.prototype.shapes.Shape;

public class App {

	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<Shape>();
		List<Shape> shapesCopy = new ArrayList<Shape>();

		Circle circle = new Circle();
		circle.x = 10;
		circle.y = 20;
		circle.radius = 15;
		circle.color = "red";
		shapes.add(circle);

		Rectangle rectangle = new Rectangle();
		rectangle.width = 10;
		rectangle.height = 20;
		rectangle.color = "blue";
		shapes.add(rectangle);

		cloneAndCompare(shapes, shapesCopy);
	}

	private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
		for (Shape shape : shapes) {
			shapesCopy.add(shape.clone());
		}

		for (int i = 0; i < shapes.size(); i++) {
			if (shapes.get(i) != shapesCopy.get(i)) {
				System.out.println(i + ": Shapes are different objects (yay!)");
				if (shapes.get(i).equals(shapesCopy.get(i))) {
					System.out.println(i + ": And they are identical (yay!)");
				} else {
					System.out.println(i + ": But they are not identical (booo!)");
				}

			} else {
				 System.out.println(i + ": Shape objects are the same (booo!)");
			}
		}
	}
}
