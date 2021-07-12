package ejercicio003;

import java.util.ArrayList;
import java.util.List;

public class Grupo {

	static List<String> lista = new ArrayList<>();
	

	public String getPersona()
	{
		int n = (int) (Math.random() * lista.size());
		return lista.get(n);
	}
	
	public List<String> getPersonas(int n)
	{
		List<String> listaPersonasDevovler = new ArrayList<>();
		do {
		
			int aleatorio = (int) (Math.random() * lista.size());
			String persona=lista.get(aleatorio);
			listaPersonasDevovler.add(persona);
					
		}while(n!=0);
			
			return listaPersonasDevovler;
	}

	public static List<String> getLista() {
		return lista;
	}

	public static void setLista(List<String> lista) {
		Grupo.lista = lista;
	}
	
	
}
