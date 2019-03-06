import java.util.ArrayList;

public class CalculandoPerimetros {

	public static void main(String[] args) {
		Quadrado q1 = new Quadrado(8);
		Retangulo r1 = new Retangulo(8,9);
		Losango l1 = new Losango(2,2);
		
		ArrayList<DoisD> a = new ArrayList();
		
		a.add(q1);
		a.add(r1);
		a.add(l1);
		for (DoisD DoisD: a){
			
			System.out.println(DoisD.perimetro());
		}
	}

}
