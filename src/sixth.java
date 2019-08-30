
public class sixth {
	static int countSmallAlpha;
	static int countCapitalAlpha;
	static int countS;
	static int countD;
	static int countSpace;
	
	public static void main(String[] args) {
		String s="hello user123, You can Mail me @ xyz4343@gmail.com with # tag java!";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isLetter(ch[i]))
			{
				int n=(int) ch[i];
				if(n>96 && n<123)
				{
					countSmallAlpha++;
				}
				else
				{
					countCapitalAlpha++;
				}
			}
			else if(Character.isDigit(ch[i]))
			{
				countD++;
			}
			else if(Character.isSpaceChar(ch[i]))
			{
				countSpace++;
			}
			else
			{
				countS++;
			}
		}
		System.out.println("Small alphabets: "+countSmallAlpha+"\nUpper alphabets: "+countCapitalAlpha+"\nDigits: "+countD+"\nSymbols: "+countS+"\nSpaces: "+countSpace);
	}

}