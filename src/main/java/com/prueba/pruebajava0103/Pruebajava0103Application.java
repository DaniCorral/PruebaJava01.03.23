package com.prueba.pruebajava0103;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yaml.snakeyaml.tokens.AliasToken;

import com.prueba.pruebajava0103.models.Alumno;
import com.prueba.pruebajava0103.models.Curso;
import com.prueba.pruebajava0103.models.Persona;
import com.prueba.pruebajava0103.models.Profesor;

import java.util.Scanner;
import java.util.ArrayList;

@SpringBootApplication
public class Pruebajava0103Application {

	// La idea era que este "llenado" de alumnos fuera una funcion y luego solo llamarla, pero no resultó
	//public static void crearAlumno(){
	// 	Scanner sc = new Scanner(System.in);
	// 	Alumno alumno = new Alumno();
	// 	System.out.print("Ingresar nombre alumno: ");
	// 	alumno.setNombre(sc.nextLine());
	// 	System.out.print("Ingresar rut alumno: ");
	// 	alumno.setRut(sc.nextLine());}

	// public static Double promNotas(ArrayList notas){
	// 	Double suma = 0.0;
	// 	for (int i = 0; i < cantNotas; i++) {
	// 		sumaNota += notas.get(i);
	// 		double promedio =sumaNota/cantNotas
	// 	}
	// 	return promedio;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList <Alumno> misAlumnos = new ArrayList<Alumno>();
		ArrayList notas = new ArrayList();

		int contadorAlumnos = 1;
		Double sumaNota = 0.0;

		
		System.out.println("**Ingreso de notas***");
		System.out.print("Cuantos alumnos quieres evaluar: ");
		int cantAlumnos = sc.nextInt();
		System.out.print("Cuantas notas ingresaras por cada alumno: ");
		int cantNotas = sc.nextInt();

		sc.nextLine();

		while(contadorAlumnos<=cantAlumnos){
			 Alumno alumno = new Alumno();
			 System.out.print("Ingresar nombre alumno: ");
			 alumno.setNombre(sc.nextLine());
			 System.out.print("Ingresar rut alumno: ");
			 alumno.setRut(sc.nextLine());

			for (int i = 1 ; i <=cantNotas; i++){
				System.out.print("Ingresar nota " + i +" de " + alumno.nombre + ": ");
				alumno.setNota(sc.nextDouble());
				//  sumaNota = sumaNota + notas(i);
			}

			 misAlumnos.add(alumno);
			//notas.add(nota);
			contadorAlumnos++;
			sc.nextLine();
		} 

		System.out.println("Los alumnos ingresados son : " + misAlumnos);

	}

}
