
public class Cubo extends Poliedro {

	public Cubo(int lado) {
		super(lado, lado, lado);
		// TODO Auto-generated constructor stub
	}

	@Override
	double volume() {
		
		return getBase()*getBase()*getBase();
	}

}
