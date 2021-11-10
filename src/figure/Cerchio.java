package figure;

public class Cerchio extends Figura
{
	protected double raggio;
	
	public Cerchio (String nome, double raggio)
	{
		super (nome);
		this.raggio = raggio;
	}

	public double getRaggio() {
		return raggio;
	}

	private void setRaggio(double raggio) {
		this.raggio = raggio;
	}
	
	public void calcolaPerimetro()
	{
		// formula: 2 * pi * r
		this.setPerimetro(2 * Math.PI * raggio);
	}
	
	public void calcolaArea()
	{
		// formula: pi * r^2
		this.setArea(Math.PI * (raggio * raggio));
	}
	
	public String toString()
	{
		String s = super.toString();
		      s += "Raggio: " + this.getRaggio() + "\n";
		      
		return s;
	}
}
