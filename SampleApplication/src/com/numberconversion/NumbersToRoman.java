package com.numberconversion;

public class NumbersToRoman {

	public String conversion(int n) {
		String roman = "";

		if (n > 4000) {

			System.out.println("we accept numbers beyond 4000");
		} else {

			while (n >= 1000) {
				n = n - 1000;
				roman = roman + "M";
			}
			while (n >= 900) {
				n = n - 900;
				roman = roman + "CM";
			}
			while (n >= 500) {
				n = n - 500;
				roman = roman + "D";
			}

			/*
			 * 600 => 600-500= 100 roman= DC
			 */
			while (n >= 400) {
				n = n - 400;
				roman = roman + "CD";
			}
			while (n >= 100) {
				n = n - 100;
				roman = roman + "C";
			}
			while (n > 90) {
				n = n - 90;
				roman = roman + "XC";
			}
			while (n > 50) {

				n = n - 50;
				roman = roman + "L";
			}
			while (n > 40) {
				n = n - 40;
				roman = roman + "XL";

			}

			while (n >= 10) {

				n = n - 10;
				roman = roman + "X";
			}
			while (n >= 9) {

				n = n - 10;
				roman = roman + "IX";
			}
			while (n >= 5) {
				n = n - 5;
				roman = roman + "V";
			}

			while (n >= 4) {
				n = n - 4;
				roman = roman + "IV";
			}
			while (n >= 1) {
				n = n - 1;
				roman = roman + "I";

			}
		}
		return roman;
	}
}
