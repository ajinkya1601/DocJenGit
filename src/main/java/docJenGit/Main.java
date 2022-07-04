package docJenGit;

public class Main {

	public static boolean checkIfInputIsAnEvenNumber(int number) {
		System.out.println("Checking if it is even or not");
		return number % 2 == 0;
	}

	
	public static void main(String[] args) {

		System.out.println(checkIfInputIsAnEvenNumber(122));

	}
}