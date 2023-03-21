package Constructores.Personas;

public class Personas {
    public static void main(String[] args) {
        Persona tomas = new Persona("21394133k", "Tomas", "Barros", "13/09/2023");
        Persona john = new Persona("135679331", "John", "Doe", "12/05/2001");
        System.out.println(tomas.rutFormateado());
        System.out.println(john.rutFormateado());
    }
}
