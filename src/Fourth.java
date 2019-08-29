
public class Fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="this is java and java is object oriented and java is powerful. I love java language";

		int n = s.length();
		char ch[] = s.toCharArray();
		int count=0;
		System.out.println("java at index");
		for(int i=0;i<n;i++)
		{
			if(ch[i]=='j'&&ch[i+1]=='a'&&ch[i+2]=='v'&&ch[i+3]=='a')
			{
				System.out.print(i+" ");
				count++;
				i=i+3;
			}
		}
		System.out.print("\n"+count);
		
	}

}
