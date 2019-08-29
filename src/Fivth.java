import java.util.Scanner;
public class Fivth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char ch[] = s.toCharArray();
		boolean t=true;
		for(int i=0;i<ch.length/2;i++)
		{
			if(ch[i]!=ch[ch.length-1-i])
			{
				t=false;
				break;
			}
			
		}
		System.out.print("Palindrome :"+t);
		sc.close();
	}

}
