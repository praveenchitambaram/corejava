package com.chainsys.finalclass;

public class Testprivateconstructor {
	public static void testPrivateConstructor() {
		ShapeAPrivateconstructor refShapeA = ShapeAPrivateconstructor.getobject();
		refShapeA.height = 123;
		refShapeA.width = 500;
		refShapeA.echo();
	}
}
