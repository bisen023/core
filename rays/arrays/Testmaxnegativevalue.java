package com.rays.arrays;

public class Testmaxnegativevalue {
public static void main(String[] args) {


		int[] arr = { -2, -1, -13, -11, -6, -8 };
		
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {

				max = arr[i];

			}

		}

		System.out.println("max = " + max);

	}

}
