import java.util.*;

public class Principal {
	static Scanner s = new Scanner (System.in);
	public static void main(String[] args) {
		
		nombre("juanjo");
			
		
	}
	public static String nombre(String nombre) {
		ArrayList <String> nombres = new ArrayList <String>();
		nombres.add("iker");
		nombres.add("juanjo");
		
		String nombre2 = s.next();
		
		System.out.println(nombres.contains(nombre));
		
		return nombre;
	}
}
