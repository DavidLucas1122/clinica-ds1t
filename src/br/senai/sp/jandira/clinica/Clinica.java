/*
 * Programador: David
 * Empresa: Senai
 * Data: 19/02/2025
 */

package br.senai.sp.jandira.clinica;

import java.time.LocalDate;

import br.senai.sp.jandira.clinica.model.Paciente;

public class Clinica {

	public static void main(String[] args) {
		
		// Criação de Paciente
		Paciente p1 = new Paciente();
		p1.nome = "Ana Maria";
		p1.setAltura(1.65);
		p1.setPeso(68.2);
		p1.telefone = "(11)98888-8888";
		p1.dataNascimento = LocalDate.of(2003, 07, 15);
		p1.estaInternado = true;
		
		Paciente p2 = new Paciente();
		p2.nome = "David Lucas";
		p2.setAltura(1.71);
		p2.setPeso(68.2);
		p2.telefone = "(11) 978493-6883";
		p2.dataNascimento = LocalDate.of(2007, 11, 22);
		p2.estaInternado = false;
		
		//Mostrar dados dos pacientes 1
		p1.mostrarFichaPaciente();
		p2.mostrarFichaPaciente();
		
		
		
	}

}
