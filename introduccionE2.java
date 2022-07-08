public class IntroduccionE2 {

	public static void main(String[] args) {
		/*
		//Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
		//Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
		
		var numero= -5;
		if (numero > 0) {
			System.out.println("El numero "+numero+" es positivo");
		}else if (numero == 0) {
			System.out.println("El numero es "+numero);
		}else {
			System.out.println("El numero "+numero+" es negativo");
		}
	}	------------------------------------
	*/
	/*//Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
		//Incrementar el valor de la variable en uno cada vez que se ejecute.Mostrarlo por pantalla cada vez que se ejecute.
		
		int i= 0;
		while(i < 3) {
			System.out.println("i: "+i);
			i++;
			}
			----------------------------------
		*/
		//Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
	/*	
		int i= 2;
		do {
			System.out.println("i: "+i);
			i++;
		}while(i < 3);
			----------------------------------
	*/		
		//Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la 
		//variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
	/*	
		for (int i=0; i <= 3; i++) {
			System.out.println("i: "+i);
		}
			-------------------------------
		*/
		//Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. 
		//Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
		
		String estacion= "año nuevo";
		
		switch (estacion) {
		case "otoño":
			System.out.println("Estamos en otoño");
			break;
		case "invierno":
			System.out.println("Estamos en invierno");
			break;
		case "primavera":
			System.out.println("Estamos en primavera");
			break;
		case "verano":
			System.out.println("Estamos en primavera");
			break;
		default: System.out.println("No es una estacion del año");
		
		}
	}
		
}
