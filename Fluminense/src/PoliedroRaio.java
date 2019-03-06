
public abstract class PoliedroRaio extends TresD {
	
	private int raio;
	
	public PoliedroRaio(int raio) {
		this.setRaio(raio);
	}
	
	@Override
	double volume() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}

}
