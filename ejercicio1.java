public class IntroduccionE1 {
    /*  Crear una función con tres parámetros que sean números que se suman entre sí.
        Llamar a la función en el main y darle valores.
         
        public static void main(String[] args) {
            suma(5, 4, 3);
        }
        public static void suma(int a, int b, int c) {
            System.out.println("Suma es igual a: "+(a+b+c));
        }
    */
        //Crear una clase coche.
        //Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
        //Una función que incremente el número de puertas que tiene el coche.
        //Crear un objeto miCoche en el main y añadirle una puerta.
        //Mostrar el número de puertas que tiene el objeto.
        public static void main(String[] args) {
            Coche miCoche = new Coche();
            miCoche.AgregarPuerta();
            miCoche.AgregarPuerta();
            System.out.println("El coche tiene: "+miCoche.puertas+" puertas");
        }
    
    }
    class Coche {
        public int puertas = 0;
        
        public void AgregarPuerta() {
            this.puertas++;
        
        }
    }
    