package ups.edu.ec.pww.practica2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class persona {
	
	@Id
	int id;
	String nombre;
	String apellido;
	String cedula;
	
	public persona() {
		super();
	}

	public persona(int id, String nombre, String apellido, String cedula) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	@Override
	public String toString() {
		return "persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + "]";
	}
	
	
	
	
	

}
