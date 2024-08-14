package javaPracticeQuestions;

/*Day 2 : 
Problem 1: Check if a string is a palindrome.  ( that reads the same backwards as forwards.... eg.. civic)

Problem 2 : Write a Java program to get the character at the given index within the string.
Sample Output:
Original String = Java Exercises!                                                                             
The character at position 0 is J                                                                              
The character at position 10 is i 

Problem 3 : Write a Java program to compare two strings lexicographically.
Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.
Sample Output:
String 1: This is Exercise 1                                                                                  
String 2: This is Exercise 2                                                                                  
"This is Exercise 1" is less than "This is Exercise 2"is name my" "*/
		
public class Day2 {

	public void  problemFirst() {
		
		String  name = "vaibhav";
		String reversedStr = "";

		for (int i = 0; i < name.length(); i++) 
		{
			reversedStr = name.charAt(i) + reversedStr;
			
		}
		if (reversedStr.equals(name)) {
		System.out.println("Palindrome");
		}
		else 
		{System.out.println("Not Palindrome");}
		
	}
	
	
		
	

	public void problemSecond() {
		String name = "vaibhav";
		String reversedStr = "";

		int index1 = name.charAt(0); // Get the ASCII value of the character at position 0.
        System.out.println("The character at position 0 is " +
                (char)index1);
			

		}
	

	public void hollowGraph() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {

				if (i == 1 || j == 1 || i == 5 || j == 5) {
					System.out.print("*  ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
	
		public void patternOne() {
			for (int i = 1; i <= 5; i++) {
				for (int j = 1; j <= 5-i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
}
			}

	
	public static void main(String[] args) {

		Day2 StringReverse = new Day2();
		StringReverse.problemFirst(); 
		StringReverse.problemSecond();
		StringReverse.hollowGraph();
		StringReverse.patternOne();
		
	}
}
