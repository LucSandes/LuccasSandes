
public class Triangulo extends Poligono implements Perimetro{

	public Triangulo(int base, int altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}
	@Override
	double area() {
		// TODO Auto-generated method stub
		return 
				super.area()/2;
	}
	@Override
	double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double perimetro(int perimetro) {
		// TODO Auto-generated method stub
		return 0;
	}

}
