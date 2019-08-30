
public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String rnos[] = {"1235","5655","1244","1299","5677","3477","3498","3425","7814","7811"};
		int csno=0,itno=0,mechno=0,civilno=0;
		for(String rno:rnos)
		{
			if(rno.charAt(0)=='1')
			{
				csno++;
			}
			if(rno.charAt(0)=='3')
			{
				itno++;
			}
			if(rno.charAt(0)=='5')
			{
				mechno++;
			}
			if(rno.charAt(0)=='7')
			{
				civilno++;
			}
				
		}
		System.out.println("CS counts :"+csno+" IT counts :"+itno+" Mech counts :"+mechno+" Civil counts :"+civilno);
	
		
		
		
	}

}
