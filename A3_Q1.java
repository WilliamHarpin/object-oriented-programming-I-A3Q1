// -----------------------------------
// Assignment 3
// Written by: William Harpin 40212540 on March 3rd
// For Comp 248 Section U - Winter 2022
// -----------------------------------

/*
This program prompts the user for a sentence, removes the last character (punctuation mark), splits up the sentence into words and stores these words
into a string array. It then loops through the array, printing the length of each word individually. It then prints the number of words in the sentence,
which corresponds to the number of elements in the array. It then loops through the array to find the largest word and outputs its length. Similarly,
it then loops through the array to find the shortest word and outputs its length. It then loops through the array, summing the lengths of each word, after-which
the sum is divided by the number of words in the sentence to obtain the average word length.
*/

import java.util.Scanner;

public class A3_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Welcome message and instructions
	System.out.println("Welcome to the SENTENCE SCAN PROGRAM!");
	System.out.println("-------------------------------------");
	System.out.println("Please enter a sentence to scan:");
	
	//Obtaining user input
	Scanner input = new Scanner(System.in);
	String str = input.nextLine();
	
	input.close();
	
	//Removing the last character which will be a punctuation mark (from assignment guidelines)
	String strNoPunc = str.substring(0, (str.length() - 1));
	
	//Splitting up the user's string into individual words with " " character and storing these words into a String array
	String[] words = strNoPunc.split(" ");	 

	System.out.println("\nHere are some data about your sentence:\n");
	
	//This for loop goes through the string array and one-by-one, prints out the length of each individual word
	int i;
	for (i = 0; i < words.length; i++) {
		System.out.println("Word " + (i + 1) + " has " + words[i].length() + " characters.");	
	}
	
	//Printing out the number of words in the sentence which corresponds to the number of elements in the string array
	System.out.println("\nThere are " + words.length + " words.");
	
	//Looping through the string array, changing the value of the "largest" variable when the length of the word being analyzed is longer than the previous value of "largest"
	int largest = 0;
	int j;
	for (j = 0; j < words.length; j++) {
		if (largest < words[j].length()) {
			largest = words[j].length();
		}
	}
	//Printing out the length of the longest word which corresponds the the value of the "largest" variable
	System.out.println("The longest word has " + largest + " characters.");
	
	//Looping through the string array, changing the value of the "shortest" variable when the length of the word being analyzed is shorter than the previous value of "shortest"
	int shortest = largest;
	int k;
	for (k = 0; k < words.length; k++) {
		if (shortest > words[k].length()) {
			shortest = words[k].length();
		}
	}
	//Printing out the length of the shortest word which corresponds the the value of the "shortest" variable
	System.out.println("The shortest word has " + shortest + " characters.");
	
	//Looping through the string array summing up the length of each word
	int p, sumOfChar = 0;
	for (p = 0; p < words.length; p++) {
		sumOfChar = words[p].length() + sumOfChar;
	}
	//The average word length corresponds to the sum of the characters divided by the number of elements in the array (number of words)
	double average = (double)sumOfChar/words.length;
	System.out.printf("The average word length is %.2f characters.", average);
	//Farewell message
	System.out.println("\nThank you for using The SENTENCE SCAN PRORGAM!");
	
	
	
	}

}
