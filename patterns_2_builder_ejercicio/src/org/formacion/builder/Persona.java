package org.formacion.builder;

public class Persona {

	private String nombre;
	private int edad;
	private String municipio;
	private String colegio;
	private String lugarTrabajo;
	
	private Persona() {}
	
	
	public static class Builder {
		private Persona persona;
		
		public Builder(String nombre) {
			persona = new Persona();
			persona.nombre = nombre;
		}
		
		public Builder setMunicipio (String municipio) {
			persona.municipio = municipio;
			return this;
		}
		
		public Builder setMayor(int edad) {
			if (edad < 18) throw new IllegalArgumentException("es menor de edad " + edad);
			persona.edad = edad;
			return this;
		}
		
		public Builder setMenor(int edad) {
			if (edad >= 18) throw new IllegalArgumentException("es mayor de edad " + edad);
			persona.edad = edad;
			return this;
		}
		public Builder setLugarTrabajo(String lugar){

				persona.lugarTrabajo = lugar;

			return  this;
		}
		public Builder setColegio(String cole){

				persona.colegio = cole;


			return  this;
		}
	
		public Persona build() {
			return persona;
		}

	}
	
}
