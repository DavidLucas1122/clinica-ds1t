package br.senai.sp.jandira.clinica.model;

import java.time.LocalDate;

public class Paciente {
	
	public String nome;
	public LocalDate dataNascimento;
	private double peso;
	private double altura;
	public String telefone;
	public boolean estaInternado;
	
	
	public void setPeso (double peso) {
		
		if(peso >= 40) {
			//true
			this.peso = peso;}
		else {
			//false
			System.out.println("O peso do(a) paciente " + nome + " deve ser maior do que 40Kg");
		}
	}
	
	
	
	public void setAltura (double altura) {
		
		if(altura > 0) {
			//true
			this.altura = altura;}
		else {
			//false
			System.out.println("A altura do(a) paciente " + nome + " está incorreta!");
		}
	}

	
	
	public void calcularIdade() {
		
	}
	
	public void calcularImc() {
		
	}
	
	public void classificaImc() {
		
	}
	
	public void mostrarFichaPaciente() {
		System.out.println("Nome: " + nome);
		System.out.println("Peso: " + peso);
		System.out.println("Altura: " + altura);
		System.out.println("Telefone: " + telefone);
		System.out.println("Data nasc.: " + dataNascimento);
		System.out.println("Dia nasc.: " + obterDiaSemanaNascimento());
		System.out.println("Internado: " + estaInternado);
		System.out.println("-----------------------");
	}
	
	private String obterDiaSemanaNascimento() {
		String diaSemana = dataNascimento.getDayOfWeek().toString();
		return diaSemana; 
	}
	
}
