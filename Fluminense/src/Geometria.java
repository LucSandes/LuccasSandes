import java.util.ArrayList;

public class Geometria {

	public static void main(String[] args) {
		Circulo c1 = new Circulo();
		Triangulo t1 = new Triangulo(5,6);
		Quadrado q1 = new Quadrado(8);
		Retangulo r1 = new Retangulo(8,9);
		Losango l1 = new Losango(2,2);
		
		ArrayList<DoisD> a = new ArrayList();
		
		a.add(c1);
		a.add(t1);
		a.add(q1);
		a.add(r1);
		a.add(l1);
		for (DoisD DoisD: a){
			
			System.out.println(DoisD.area());
		}
	}

}
