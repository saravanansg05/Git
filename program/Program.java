package org.program;

public class Program {

	private void palindrome() {
		String s = "DAD";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
			System.out.println(rev);
		}

		if (s.equals(rev)) {
			System.out.println("palindrome");

		} else {
			System.out.println("Not a palindrome");
		}
	}

	private void noOfUpperLowerSpec() {
		String s = "Kim@123";
		int upperCount = 0;
		int lowerCount = 0;
		int numberCount = 0;
		int specialCount = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (Character.isUpperCase(ch)) {
				upperCount++;
			} else if (Character.isLowerCase(ch)) {
				lowerCount++;
			} else if (Character.isDigit(ch)) {
				numberCount++;
			} else {
				specialCount++;
			}
		}
		System.out.println("Upper case count is " + upperCount);
		System.out.println("Lower " + lowerCount);
		System.out.println("Number Count " + numberCount);
		System.out.println("special " + specialCount);
	}

	private void sentenceReverse() {
		String str = "My name is Saravanan";
		String[] words = str.split("");
		String revString = "";

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String revWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {

				revWord = revWord + word.charAt(j);

			}
			revString = revWord + revString + "";

		}
		System.out.println(revString);

	}

	private void reverseEachWordinSentence() {
		String str = "My name is Saravanan";
		String[] words = str.split(" ");
		System.out.println(words);
		String revString = "";

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String revWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {

				revWord = revWord + word.charAt(j);

			}
			revString = revString + revWord + " ";

		}
		System.out.println(revString);

	}

	private void factorial() {
		int fact = 1;
		for (int i = 1; i <= 5; i++) {
			fact = fact + 1;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		Program program = new Program();
		program.factorial();
	}
}
