package javaPracticeQuestions;

//Challenge to Reverse a String in two ways : 
// Problem 1 : Testing should be replace with gnitseT
// Problem 2 : my name is vaibhav with vaibhav" with "vahbiav si eman ym"
// Problem 3 : my name is my name is vaibhav with "vaibhav is name my" 
public class Day1 {

	public void problemFirst() {
		String name = "Rahul";
		String reversedStr = "";

		for (int i = 0; i < name.length(); i++) {
			reversedStr = name.charAt(i) + reversedStr;
		}
		System.out.println(reversedStr);
	}

	public void problemSecond() {
		String name = "my name is vaibhav";
		String reversedStr = "";
		for (int i = 0; i < name.length(); i++) {
			reversedStr = name.charAt(i) + reversedStr;
		}
		System.out.println(reversedStr);
	}

	public void problemThird() {

		String sentence = "my name is vaibhav";
		String word[] = sentence.split(" ");
		String outputString = " ";

		for (int i = word.length - 1; i >= 0; i--) {
			outputString = outputString + word[i] + " ";

		}
		System.out.println(outputString);

	}

	public void graph() {
		int n = 4;
		int m = 5;
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Day1 StringReverse = new Day1();
		//StringReverse.problemFirst();
		//StringReverse.problemSecond();
		StringReverse.problemThird();
		//StringReverse.graph();
	}
}
