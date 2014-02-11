package Exemplo;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Main {
	
	public static void main(String [] args){
		
		Scanner sc= new Scanner(System.in);
		Urna urna= new Urna();
		
		int candidatos[]=new int[4];
		int votosbrancos=0;
		int votosnulos=0;
		int opcao =0;
		
		do{
		String menu="1------------Votar\n" +
					"2------------Votar em Branco\n" +
					"3------------Anular o voto\n" +
					"4------------Apurar a eleição\n"+
					"0------------Sair\n"+
					"Informe sua opção-> ";
		System.out.println(menu);
		opcao=sc.nextInt();
		
		switch (opcao) {
			case 1:
				
				int voto=0;
				System.out.println("Digite o numero do candidato em que deseja votar-> ");
				voto=sc.nextInt();
				urna.Votar(voto);
				break;
			case 2:
				
				urna.votarBranco();
				
				break;
			case 3:
				
				urna.anularVoto();
				break;
				
			case 4:
				
				candidatos=urna.getCandidatos();
				votosbrancos=urna.getVotosbrancos();
				votosnulos=urna.getVotosnulos();
				
				System.out.println("##########Apuração de votos##########\n");
				System.out.println("Candidato 1-> "+candidatos[0]+"\nCandidato 2-> "+candidatos[1]+"\nCandidato 3-> "+candidatos[2]+"\nCandidato 4-> "+candidatos[3]);
				System.out.println("Votos Brancos-> "+votosbrancos);
				System.out.println("Votos Nulos-> "+votosnulos);
				
				System.out.println("Votação encerrada!!!");
				System.exit(0);
				break;
				
		}
		
		}while(opcao!=0);
	}

}
