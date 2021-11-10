package figure;

public class Triangolo extends Figura
{
	protected double l1;
	protected double l2;
	protected double l3;
	
	public Triangolo (String nome, double l1, double l2, double l3)
	{
		super(nome);
		
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
	}

	public double getL1() {
		return l1;
	}

	public double getL2() {
		return l2;
	}

	public double getL3() {
		return l3;
	}

	private void setL1(double l1) {
		this.l1 = l1;
	}

	private void setL2(double l2) {
		this.l2 = l2;
	}

	private void setL3(double l3) {
		this.l3 = l3;
	}
	
	public void calcolaPerimetro()
	{
		this.setPerimetro(l1 + l2 + l3);
	}
	
	public void calcolaArea()
	{
		// per calcolare l'area del triangolo uso la formula di erone:
		// A = sqrt(p * (p - a) * (p - b) * (p - c))
		// dove: p = semiperimetro; a = lato 1; b = lato 2; c = lato 3
		
		// ottengo il semiperimetro
		if (this.getPerimetro() == 0)
			this.calcolaPerimetro();
		
		double semiperimetro = this.getPerimetro();
		
		// calcolo l'area
		double area = Math.sqrt(semiperimetro * (semiperimetro - l1) * (semiperimetro - l2) * (semiperimetro - l3));
		this.setArea(area);
	}
	
	public String toString()
	{
		String s = super.toString();
		      s += "Lato 1: " + this.getL1() + "\n";
		      s += "Lato 2: " + this.getL2() + "\n";
		      s += "Lato 3: " + this.getL3() + "\n";
		      
		return s;
	}
}
