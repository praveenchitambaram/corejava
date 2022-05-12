package com.chainsys.strings;

public class StringBuilderDemo {
	public static void testA() {
		String fristString = "Hello how are you today.is the weather hot or cold.";
		StringBuilder stringbuilder = new StringBuilder();
		stringbuilder.ensureCapacity(250);
		System.out.println("length=" + stringbuilder.length());
		System.out.println("capacity= " + stringbuilder.capacity());
		stringbuilder.append(fristString);
		System.out.println("buffer=" + stringbuilder);
		System.out.println("length=" + stringbuilder.length());
		System.out.println("capacity= " + stringbuilder.capacity());

		fristString = "Wish it rains this week";
		stringbuilder.append(fristString);
		System.out.println("buffer=" + stringbuilder);
		System.out.println("length=" + stringbuilder.length());
		System.out.println("capacity= " + stringbuilder.capacity());

		// reduce capacity to length
		stringbuilder.trimToSize();
		System.out.println("\tlength=" + stringbuilder.length());
		System.out.println("\tcapacity" + stringbuilder.capacity());

		stringbuilder.replace(3, 8, "this is atest--");
		System.out.println("replace=" + stringbuilder);

		stringbuilder.insert(10, "this is a august");
		System.out.println("buffer=" + stringbuilder);
		System.out.println("length=" + stringbuilder.length());
		System.out.println("capacity= " + stringbuilder.capacity());

		stringbuilder.delete(5, 20);
		System.out.println("buffer=" + stringbuilder);
		System.out.println("length=" + stringbuilder.length());
		System.out.println("capacity= " + stringbuilder.capacity());
		
		System.out.println("Before revese;"+stringbuilder);
        stringbuilder.reverse();
        System.out.println("After reverse:"+stringbuilder);
	}

}
