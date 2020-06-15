import java.util.Scanner;

public class StringEx9 {
	public static String comboString(String str1, String str2){
		String shorter = str1;
		String longer = str2;
		String combined;
		
		if (str1.length() >= str2.length()){
			shorter = str2;
			longer = str1;
		}
	
		combined = shorter + longer + shorter;
		
		return combined;

	}
	
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		String strA;
		String strB;
		
		System.out.println("Enter the first string: ");
		strA = input.nextLine();
		
		System.out.println("Enter the second string: ");
		strB = input.nextLine();
		
		System.out.println(comboString(strA, strB));
		
		input.close();
	}
}
