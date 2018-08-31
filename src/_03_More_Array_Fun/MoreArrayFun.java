package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		MoreArrayFun maf = new MoreArrayFun();
		String[] array = { "pencil", "paper", "eraser", "ruler", "binder" };
		// maf.arrayStrings(array);
		// maf.stringArrays(array);
		// maf.coding(array);
		maf.strrrrrings(array);
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	// void arrayStrings(String[] array) {
	// for (int i = 0; i < array.length; i++) {
	// System.out.println(array[i]);
	// }

	// }

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	// void stringArrays(String[] array) {
	// for (int i = array.length-1; i > -1; i--) {
	// System.out.println(array[i]);
	// }

	// }

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	// void coding(String[] array) {
	// for (int i = 0; i < array.length; i+=2) {
	// System.out.println(array[i]);
	// }

	// }

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	void strrrrrings(String[] array) {
		String[] check = new String[array.length];
		int howmanywords = 0;
		while (howmanywords < check.length) {
			Random random = new Random();
			int num = random.nextInt(array.length);
			boolean hasBeenPrinted=false;
			for (int i = 0; i < check.length; i++) {
				if (array[num] == check[i]) {
                 hasBeenPrinted=true;
				
			}
		}
			if (hasBeenPrinted==false) {
				check[howmanywords]=array[num];
				System.out.println(array[num]);
				howmanywords++;
			}

	}

}}
