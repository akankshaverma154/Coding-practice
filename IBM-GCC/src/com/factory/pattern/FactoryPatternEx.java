package com.factory.pattern;

public class FactoryPatternEx {

	public static void main(String[] args) {

		ShapeFactory shapeFac = new ShapeFactory();
		Shape obj = shapeFac.getShape("CIRCLE");
		obj.draw();		
	}

}
