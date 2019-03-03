package br.edu.ifsp.spo.lp1a3.sp3013049.cap3;
import java.util.Scanner;

public class App {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe Nome: ");
		String nome = scan.nextLine();
		System.out.print("Informe Sobrenome: ");
		String sobrenome = scan.nextLine();
		System.out.print("Informe dia de nascimento: ");
		int dia = scan.nextInt();
		System.out.print("Informe mês de nascimento: ");
		int mes = scan.nextInt();
		System.out.print("Informe ano de nascimento: ");
		int ano = scan.nextInt();
		
		HeartRates hr = new HeartRates(nome, sobrenome, dia, mes, ano);
		
		System.out.println("Nome Completo: "+hr.getNome()+" "+hr.getSobrenome());
		System.out.println("Data de Nascimento: "+hr.getDiaNasc()+"/"+hr.getMesNasc()+"/"+hr.getAnoNasc());
		System.out.println("Idade: "+hr.calcularIdade());
		System.out.println("Intervalo de Frequência Cardíaca Máxima: "+hr.frequenciaMaxima());
		hr.frequenciaAlvo();
	}

}
