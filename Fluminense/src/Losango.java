
public class Losango extends Poligono implements Perimetro{

	public Losango(int base, int altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	double perimetro() {
		// TODO Auto-generated method stub
		return 4*getBase();
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return getAltura()*(4*getBase());
}

	@Override
	public double perimetro(int perimetro) {
		// TODO Auto-generated method stub
		return 0;
	}

}