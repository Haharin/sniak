package com.sniak;

public class SimpleDotComTestDrive {
	static SimpleDotCom dot = new SimpleDotCom();
		public static void main(String[] args) {
			before_tests();
			Test_success();
			Test_error();

		}
	private static void checkResult(String a, String realResult) {

		if (a.equals(realResult)) {
			System.out.println("Тест пройден");
		} else {
			System.out.println("Тест не пройден");
		}

	}
	private static void before_tests() {

		int[] locations = {2,3,4};
		dot.setLocationCells(locations);
	}

	private static void Test_error() {

		String userGuess = "5";
		String result = dot.checkYourself( userGuess );

		checkResult("Мимо", result);


	}



	private static void Test_success() {

		String userGuess = "2";
		String result = dot.checkYourself( userGuess );

		checkResult("Попал", result);



	}
}



