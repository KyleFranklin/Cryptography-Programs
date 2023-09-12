//written by Kyle A Franklin 8/25/2023
import java.util.Scanner;

public class affine_decryption {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		input = input.toUpperCase();
		String output="";
		int[] Af = {1,3,5,7,9,11,15,17,19,21,23,25};
		for(int i = 0;i<Af.length;i++) {
			System.out.println("-----------"+Af[i]+"-------------\n");
			for(int j=0;j<26;j++) {
				for(int k =0; k<input.length();k++) {
					//System.out.print(input.charAt(k)+" ");
					//System.out.println(Af[i]*(input.charAt(k)-j)%26);
					String x = Character.toString(Af[i]*(input.charAt(k)-j)%26 +'A');
					output+= x;
				}
				
				System.out.println("B = "+j+" "+output+"\n");
				output="";
			}
		}

	}

}
