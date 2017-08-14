public class Ejercicio5 
{

	public static void main(String args[]) 
	{
		double j;
		double k;
		double l;
		double m;
		double n;
		double o;
		double p;
		p = 999;
		o = 0;
		j = 999;
		k = 0;
		l = 0;
		m = 0;
		n = 0;
		while (j>1)
		{
			o = j*p;
			m = j*p;
			while (p>1)
			{
				o = j*p;
				m = j*p;
			}
			if (o!=0) 
			{
				n = o%10;
				o = o/10;
				l = l*10+n;
			}
			j = j-1;
			if (n==m) 
			{
				j = 0;
				p = 0;
			}
		}
		p = p-1;
		j = 999;
		System.out.println ("el resultado es: " +o);
	}	
}