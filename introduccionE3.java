public class IntroduccionE3 {
	//Crear clase Persona.
	//Crear variables las privadas edad, nombre y telefono de la clase Persona
	//Crear gets y sets de cada propiedad.
	//Crear un objeto persona en el main.
	//Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.

	public static void main(String[] args) {
		Persona miPersona = new Persona();
		miPersona.setEdad(25);
		miPersona.setNombre("adrian");
		miPersona.setTelefono(155711323);
		
		System.out.println("miPersona tiene "+miPersona.getEdad()+" de edad");
		System.out.println("Se llama "+miPersona.getNombre());
		System.out.println("Su numero de telefono es: "+miPersona.getTelefono());

	}

}

class Persona {
	private int edad;
	private String nombre;
	private long telefono;
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return this.edad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	
	public void setTelefono (long telefono) {
		this.telefono = telefono;
	}
	public long getTelefono () {
		return this.telefono;
	}

}

