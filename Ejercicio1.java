public class Ejercicio1{
	public static void main(String args[]) 
	{
		for (int i=10;i<=31 ;i++ ) 
		{
			int m = i%10;
			int n = i/10;
			int c = ((m*10)+n);
			int inv = c*c;
			int nr = i*i;
			{
				if (inv<=1000)
				{
					int a = nr%10;
					int e = nr/10;
				    int f = e%10;
				    int g = ((a*10)+f);
				    int h = e/10;
				    int j = ((g*10)+f);
				    {
				    	if (j==nr) 
				    	{
				    		System.out.println("" +c);
				    		
				    	}
				    }
				}
				
			}
		}
	}
}