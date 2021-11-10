package figure;

public class TriangoloRettangolo extends Triangolo 
{	
	// l1 = cateto 1
	// l2 = cateto 2
	// l3 = ipotenusa
	
	public TriangoloRettangolo(String nome, double cat1, double cat2, double ipotenusa)
	{
		super(nome, cat1, cat2, ipotenusa);
	}
	
	public void calcolaPerimetro()
	{
		this.setPerimetro(l1 + l2 + l3);
	}
	
	public void calcolaArea()
	{
		// per calcolare l'area del triangolo rettangolo uso la formula:
		// A = 1/2 * (c1 * c2)
		// dove: c1 = cateto 1; c2 = cateto 2
		this.setArea(0.5 * this.getL1() * this.getL2());
	}
	
	public String toString()
	{
		String s = "Figura: " + this.getNome() + "\n";
		      s += "====================================\n";
		      s += "Area: " + this.getArea() + "\n";
		      s += "Perimetro: " + this.getPerimetro() + "\n";
		      s += "Cateto 1: " + this.getL1() + "\n";
		      s += "Cateto 2: " + this.getL2() + "\n";
		      s += "Ipotenusa: " + this.getL3() + "\n";
		      
		return s;
	}
}
