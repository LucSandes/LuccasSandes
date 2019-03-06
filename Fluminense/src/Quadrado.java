
public class Quadrado extends Poligono implements Perimetro {

	public Quadrado(int lado) {
		super(lado, lado);
		// TODO Auto-generated constructor stub
	}

	@Override
	double perimetro() {
		// TODO Auto-generated method stub
		return 4*getBase();
	}

	@Override
	public double perimetro(int perimetro) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

	
}
