package org.iesalandalus.programacion.reservasaulas.mvc.modelo.dominio;

import static org.junit.Assert.assertThrows;

import java.util.Objects;

public class Aula {
private String nombre;

public Aula(String nombre) {
	setNombre(nombre);
};
public Aula(Aula aula) {
	if (aula == null) {
		throw new IllegalArgumentException("No se puede copiar un aula nula.");
	}
	else {
		setNombre(aula.getNombre());
	}
	
	
}
private void setNombre(String nombre) {
	if (nombre == null) {
		throw new IllegalArgumentException("El nombre del aula no puede ser nulo.");	
	}
	if(nombre=="") {
		throw new IllegalArgumentException("El nombre del aula no puede estar vacío.");
	}
	else {
		this.nombre=nombre;
	}
		
	
	
}
public String getNombre() {
	return nombre;
}

@Override
public int hashCode() {
	return Objects.hash(nombre);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Aula other = (Aula) obj;
	return Objects.equals(nombre, other.nombre);
}
@Override
public String toString() {
	return "[nombre=" + nombre + "]";
}

}

