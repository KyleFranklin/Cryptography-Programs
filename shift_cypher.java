//written by Kyle A Franklin 8/24/2023
import java.util.Scanner;

public class shift_cypher {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		String output="";
		//String x = Character.toString(y+1);
		for(int i = 1;i<26;i++) {
			for(int j = 0;j<input.length();j++) {
				//System.out.println(((input.charAt(j)-'A')+i)%26);
				String x = Character.toString((((input.charAt(j)-'A')+i)%26)+'A');
				output = output + x;
			}
			System.out.println(output+"\n");
			output = "";
		}
	}

}
