public class problema1 
{
	public void main(String args[]) 
	{
		double c;
		double cont;
		double d;
		double m;
		double n;
		double p;
		double w;
		double x;
		double z;
		p = 0;
		m = 0;
		n = 0;
		x = 0;
		d = 0;
		z = 0;
		c = 0;
		cont = 100;
		while (c!=n) 
		{
			n = cont*cont;
			if (n<9999) 
			{
				p = (cont/10)+((cont%10)*10);
				m = p*p;
				w = m/1000;
				x = (m/1000)*100;
				d = (m-(w*1000)-(z*100))/10;
				z = (m-(w*1000)-(x*100)-(d*10));
				c = (z*1000)+(d*100)+(x*10)+w;
				cont = cont+1;
			} else 
			{
				cont = cont+1;
			}
		}
		System.out.println(n+p);
	}
}

