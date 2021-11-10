package figure;

public abstract class Figura {
	protected double area;
	protected double perimetro;
	protected String nome;
	
	public Figura (String nome)
	{
		this.nome = nome;
		this.area = 0;
		this.perimetro = 0;
	}
	
	public double getArea() {
		return area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public String getNome() {
		return nome;
	}

	protected void setArea(double area) {
		this.area = area;
	}

	protected void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	public void calcolaArea()
	{
		// metodo vuoto che verrà implementato in modo specifico dalle classi figlie
	}
	
	public void calcolaPerimetro()
	{
		// metodo vuoto che verrà implementato in modo specifico dalle classi figlie
	}
	
	public String toString()
	{
		String s = "";
		
		s += "Figura: " + this.nome + "\n";
		s += "======================================\n";
		s += "Area: " + this.area + "\n";
		s += "Perimetro: " + this.perimetro + "\n";
		
		return s;
	}
}
