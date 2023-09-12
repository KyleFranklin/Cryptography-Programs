//written by Kyle A Franklin 8/25/2023
import java.util.Scanner;

public class affine_cypher {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		input = input.toUpperCase();
		String output="";
		int A = 15;
		int B = 4;
		for(int j = 0;j<input.length();j++) {
			//System.out.println(((input.charAt(j)-'A')+i)%26);
			String x = Character.toString((((input.charAt(j)-'A')*A+B)%26)+'A');
			output = output + x;
		}
		System.out.println(output.toLowerCase());
	}

}
