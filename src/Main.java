import figure.*;

public class Main
{
	public static void main(String[] args)
	{
		Triangolo t1 = new Triangolo("Triangolo normale 1", 5, 7, 3);
		TriangoloRettangolo tr1 = new TriangoloRettangolo ("Triangolo rettangolo 1", 15, 32, 47);
		Rettangolo r1 = new Rettangolo ("Rettangolo 1", 13, 47);
		Quadrato q1 = new Quadrato ("Quadrato 1", 15);
		Cerchio c1 = new Cerchio("Cerchio 1", 82);
		
		t1.calcolaArea();
		t1.calcolaPerimetro();
		
		tr1.calcolaArea();
		tr1.calcolaPerimetro();
		
		r1.calcolaArea();
		r1.calcolaPerimetro();
		
		q1.calcolaArea();
		q1.calcolaPerimetro();
		
		c1.calcolaArea();
		c1.calcolaPerimetro();
		
		System.out.println(t1);
		System.out.println(tr1);
		
		System.out.println(r1);
		System.out.println(q1);
		
		System.out.println(c1);
	}
}
