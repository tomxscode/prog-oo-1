package ArreglosClase;

public class ArreglosTipoClase {
    public static void main(String[] args) {
        // Creando personas
        Persona[] arregloPersonas = new Persona[3];

        // Definiendo
        arregloPersonas[0] = new Persona("Tomas", 19, "Desarrollador");
        arregloPersonas[1] = new Persona("Guiselle", 18, "Educadora");
        arregloPersonas[2] = new Persona("John", 23, "Arquitecto");

        // Obteniendo nombre de persona 1, pero edad de persona 2, al final muestra la info de la persona 0
        System.out.println(arregloPersonas[1].nombre);
        System.out.println(arregloPersonas[2].edad);
        arregloPersonas[0].mostrarInfo();
    }
}
