
public abstract class Poliedro extends TresD {

	private int altura;
	private int base;
	private int largura;
	
	public Poliedro (int altura, int base, int largura) {
		this.base = base;
		this.altura = altura;
		this.largura = largura;
	}
	
	@Override
	double volume() {
		// TODO Auto-generated method stub
		return 
				this.getBase()*this.getAltura()*this.getLargura();
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

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}
}