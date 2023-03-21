package ArreglosClase;

public class Persona {
    String nombre;
    int edad;
    String profesion;

    public Persona(String nombre, int edad, String profesion) {
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
    }

    // metodo
    public void mostrarInfo() {
        System.out.println(nombre + edad + profesion);
    }
}
