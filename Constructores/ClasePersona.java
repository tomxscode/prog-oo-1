package Constructores;

public class ClasePersona {
    String nombre;
    int edad;

    // En este caso, el constructor nos toma los argumentos y los asigna a las variables de instancia.
    public ClasePersona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos para la clase
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}