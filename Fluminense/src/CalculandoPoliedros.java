import java.util.ArrayList;


public class CalculandoPoliedros {

	public static void main(String[] args) {
		Cubo cu1 = new Cubo(2);
		Cubo cu2 = new Cubo(10);
		Piramide p1 = new Piramide(9,6,6);
		Piramide p2 = new Piramide(2,5,5);
		Esfera e1 = new Esfera(5);
		Esfera e2 = new Esfera(10);
		Cilindro ci1 = new Cilindro(5, 5);
		Cilindro ci2 = new Cilindro(10,5);

		
		ArrayList<TresD> a = new ArrayList();
		
		a.add(cu1);
		a.add(cu2);
		a.add(p1);
		a.add(p2);
		a.add(e1);
		a.add(e2);
		a.add(ci1);
		a.add(ci2);
		for (TresD TresD: a) {
			
			System.out.println(TresD.volume());
		}
	}

}
