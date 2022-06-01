package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name;
		int life, attack, armor, N;
		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		name = sc.next();
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();
		Champion champion1 = new Champion(name, life, attack, armor);
		
		System.out.println();
		System.out.println("Digite os dados do segundo campeão: ");
		System.out.print("Nome: ");
		name = sc.next();
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();
		Champion champion2 = new Champion(name, life, attack, armor);
		
		System.out.println();
		System.out.print("Quantos turnos você deseja executar? ");
		N = sc.nextInt();
		System.out.println();
		
		for (int i=1; i<=N; i++) {
			champion1.takeDamage(champion2);
			champion2.takeDamage(champion1);
			System.out.println("Resultado do turno " + i);
			System.out.println(champion1.status());
			System.out.println(champion2.status());
			System.out.println();
			
			if(champion1.getLife() <= 0 || champion2.getLife() <= 0) {
				i = N+1;
			}
		}
		System.out.println("FIM DO COMBATE");
		sc.close();

	}

}
