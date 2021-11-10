package figure;

public class Quadrato extends Rettangolo
{
	protected double lato;
	
	public Quadrato (String nome, double lato)
	{
		super (nome, lato, lato);
		this.lato = lato;
	}
	
	public double getLato() {
		return lato;
	}

	private void setLato(double lato) {
		this.lato = lato;
	}

	public void calcolaPerimetro()
	{
		// formula: p = 4l
		this.setPerimetro(4 * lato);
	}
	
	public void calcolaArea()
	{
		// formula: A = l^2
		this.setArea(lato * lato);
	}
	
	public String toString()
	{
		String s = super.toString();
		      s += "Lato unico: " + this.getLato() + "\n";
	
		return s;
	}
}
