
public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cities[]={"bhopal","agra","mumbai","chennai","pune","delhi"};
		
		
		 int n = cities.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (cities[j].compareTo(cities[j+1])>0)
	                {
	                    // swap temp and arr[i]
	                    String temp = cities[j];
	                    cities[j] = cities[j+1];
	                    cities[j+1] = temp;
	                }
	        
	        
	        for(int i=0;i<n;i++)
	        	System.out.print(cities[i]+" ");
	}

}
