package figure;

public class Rettangolo extends Figura
{
	protected double b;
	protected double h;
	
	public Rettangolo (String nome, double b, double h)
	{
		super(nome);
		
		this.b = b;
		this.h = h;
	}

	public double getB() {
		return b;
	}

	public double getH() {
		return h;
	}

	private void setB(double b) {
		this.b = b;
	}

	private void setH(double h) {
		this.h = h;
	}

	public void calcolaPerimetro()
	{
		// formula: p = 2b + 2h
		this.setPerimetro((2 * this.b) + (2 * this.h));
	}
	
	public void calcolaArea()
	{
		// formula: A = b * h
		this.setArea(b * h);
	}
	
	public String toString()
	{
		String s = super.toString();
		      s += "Base: " + this.getB() + "\n";
		      s += "Altezza: " + this.getH() + "\n";
	
		return s;
	}
}
