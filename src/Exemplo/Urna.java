package Exemplo;

import java.util.Vector;

public class Urna {
	
	private int votosbrancos;
	private int votosnulos;
	private int candidatos[] = new int[4];
	
	
	public Urna (){
		
	}
	
	public void Votar(int voto){
		if (voto == 1){
			candidatos[0]++;
		}
		else{
			if (voto == 2){
				candidatos[1]++;
			}else{
				if (voto == 3){
					candidatos[2]++;
				}else{
					if (voto == 4){
						candidatos[3]++;
					}
				}
			}
		}
	}
	
	
	public void votarBranco(){
		votosbrancos++;
	}
	
	public void anularVoto(){
		votosnulos++;
	}
	
	
	public int getVotosbrancos() {
		return votosbrancos;
	}

	public int getVotosnulos() {
		return votosnulos;
	}

	public int[] getCandidatos() {
		return candidatos;
	}

	
	
	

}


