
public class Cilindro extends PoliedroRaio implements Raio{
	
	public Cilindro(int raio, int altura) {
		super(raio);
		// TODO Auto-generated constructor stub
	}

	@Override
	double  volume(){
		return 3.14*getRaio()*getAltura();
	}

	private double getAltura() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double raio(int raio) {
		// TODO Auto-generated method stub
		return 0;
	}

}
