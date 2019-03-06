public class Esfera extends PoliedroRaio implements Raio{

	public Esfera(int raio) {
		super(raio);
		// TODO Auto-generated constructor stub
	}

	@Override
	double  volume(){
		return 1.33*3.14*getRaio();
	}

	@Override
	public double raio(int raio) {
		// TODO Auto-generated method stub
		return 0;
	}

}
