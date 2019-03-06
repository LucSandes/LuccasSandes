
public class Retangulo extends Poligono implements Perimetro{

	public Retangulo(int base, int altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	double perimetro() {
		// TODO Auto-generated method stub
		return 2*getBase() + 2*getAltura();
	}

	@Override
	public double perimetro(int perimetro) {
		// TODO Auto-generated method stub
		return 0;
	}


}
