package Constructores.Personas;

public class Persona {
    // primero se asignan los atributos
    String rut;
    String nombre;
    String apellido;
    String fechaNac;

    // Instanciar clase
    public Persona(String rut, String nombre, String apellido, String fechaNac) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
    }

    // Métodos
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public String rutFormateado() {
        // Separar numero y digito verificador
        String numero = rut.substring(0, rut.length() - 1);
        String digito = rut.substring(rut.length() - 1).toUpperCase();

        // Insertar puntos en el numero
        String rutFormateado = "";
        int contador = 0;
        for (int i = numero.length() - 1; i >= 0; i--) {
            if (contador == 3) {
                rutFormateado = "." + rutFormateado;
                contador = 0;
            }
            // charAt devuelve el caracter en esa posicion, luego concadena.
            rutFormateado = numero.charAt(i) + rutFormateado;
            contador++;
        }
        // Agregar digito verificador y guion
        rutFormateado += "-" + digito;
        return rutFormateado;
    }
}
