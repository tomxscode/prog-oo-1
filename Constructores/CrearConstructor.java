package Constructores;

//import Constructores.ClasePersona;
// si estan en el mismo paquete no hace falta import?

/**
 * CrearConstructor
 */
public class CrearConstructor {
    // Crea la clase Persona. Solicita las variables iniciales de nombre y edad.
    public static void main(String[] args) {
        System.out.println("Hola mundo!");

        ClasePersona persona1 = new ClasePersona("Tomás", 19);
        persona1.mostrarInfo();
    }
}