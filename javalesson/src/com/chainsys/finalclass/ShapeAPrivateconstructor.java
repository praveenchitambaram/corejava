package com.chainsys.finalclass;

public class ShapeAPrivateconstructor {
	public int height;
	public int width;

	private ShapeAPrivateconstructor() {
		System.out.println("Shapea CreatedA" + hashCode());
	}

	private ShapeAPrivateconstructor(int x) {
		height = x;
		width = x;
		System.out.println(x + "ShapeA CreatedB" + hashCode());
	}

	public void echo() {
		System.out.println("ShapeA Echo...");
		System.out.println(height+""+width);
	}

	public static ShapeAPrivateconstructor getobject() // factory method
	{
		return new ShapeAPrivateconstructor();// call to private constructor
	}
}