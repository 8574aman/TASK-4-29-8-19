
public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gcount=0,ycount=0;
		String emails[] = {"aman@gmail.com","jenif@yahoo.com","rupal@gmail.com","mansi@yahoo.com","faiz@gmail.com","ross@gmail.com"};
		for(String email:emails)
		{
			int x = email.indexOf("@");
			if(email.charAt(x+1)=='g')
			{
				gcount++;
			}
			if(email.charAt(x+1)=='y')
			{
				ycount++;
			}
				
		}
		System.out.println("gmail counts :"+gcount+" yahoo counts :"+ycount);
		
		
		
	}

}
