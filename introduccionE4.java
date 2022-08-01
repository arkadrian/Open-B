public class IntroduccionE4 {
	//Crea una clase Persona con las siguientes variables: Edad, nombre, telefono
	//Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, 
	//esta nueva clase tendrá la variable credito solo para esa clase.
	//Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, 
	//el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
	//Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, 
	//y con una variable salario que solo tenga la clase Trabajador.

	public static void main(String[] args) {
		Cliente miCliente = new Cliente();
		miCliente.setEdad(20);
		miCliente.setNombre("Carlos");
		miCliente.setTelefono(155212320);
		miCliente.setCredito("Tiene credito disponible");
		
		System.out.println("miCliente tiene "+ miCliente.getEdad());
		System.out.println("Su nombre es " + miCliente.getNombre());
		System.out.println("Su numero de telefono " + miCliente.getTelefono());
		System.out.println(miCliente.getCredito());
		

	}
}

class Cliente extends Persona {
	private String credito;
	
	public void setCredito(String credito) {
		this.credito = credito;
	}
	public String getCredito() {
		return this.credito;
	}
} 

