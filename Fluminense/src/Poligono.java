
public abstract class Poligono extends DoisD {
	
	private int base;
	private int altura;
 
	public Poligono(int base, int altura) {
		this.base = base;
		this.altura = altura;
		
	}
	@Override
	double area() {
		// TODO Auto-generated method stub
		return 
				this.getBase()*this.getAltura();
	}
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

}
