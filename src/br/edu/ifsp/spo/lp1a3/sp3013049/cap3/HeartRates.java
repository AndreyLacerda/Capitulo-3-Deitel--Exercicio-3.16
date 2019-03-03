package br.edu.ifsp.spo.lp1a3.sp3013049.cap3;

public class HeartRates {
	
	private String nome, sobrenome;
	private int diaNascimento, mesNascimento, anoNascimento, idade;
	
	public HeartRates (String nome, String sobrenome, int dia, int mes, int ano){
		this.diaNascimento = dia;
		this.mesNascimento = mes;
		this.anoNascimento = ano;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getSobrenome(){
		return this.sobrenome;
	}
	
	public int getDiaNasc(){
		return this.diaNascimento;
	}
	
	
	public int getMesNasc(){
		return this.mesNascimento;
	}
	
	
	public int getAnoNasc(){
		return this.anoNascimento;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public void setDia(int dia) {
		this.diaNascimento = dia;
	}
	
	public void setMes(int mes) {
		this.mesNascimento = mes;
	}
	
	public void setAno(int ano) {
		this.anoNascimento = ano;
	}
	
	public int calcularIdade() {
		this.idade = 2019 - this.anoNascimento;
		return this.idade;
	}
	
	public float frequenciaMaxima() {
		float frequencia = 220 - this.idade;
		return frequencia;
	}

	public void frequenciaAlvo() {
		float frequenciaAlvo50 = (50 * this.frequenciaMaxima())/100;
		float frequenciaAlvo85 = (85 * this.frequenciaMaxima())/100;
		System.out.println("Frequência Cardíaca Alvo: entre "+frequenciaAlvo50+" e "+frequenciaAlvo85);
	}

}
