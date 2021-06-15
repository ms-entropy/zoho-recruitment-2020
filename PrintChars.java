import java.util.Scanner;

public class PrintChars {

	public static void main(String[] args) {
		Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter input");
		String input = sc.nextLine();
		char[] ch = input.toCharArray();
		String temp = "";
		int size = ch.length;
		for(int i=ch.length/2; i < ch.length;i++)
		{
			temp+=ch[i];
			System.out.println(temp);
			
		}
		for(int j = 0;j < ch.length/2;j++)
		{
			temp+=ch[j];
			System.out.println(temp);
		}
			
		

	}

}
