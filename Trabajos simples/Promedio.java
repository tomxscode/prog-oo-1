import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            float notaDeseada = 0, nota1 = 0;
            // Llenado de datos
            System.out.println("Ingrese los siguientes datos con el siguiente formato: NOTA_DESEADA NOTA_PRIMER_CERTAMEN, ejemplo: \n60 51");
            notaDeseada = s.nextFloat();
            nota1 = s.nextFloat();
            System.out.println("La nota deseada es: " + notaDeseada + " y la de tu primer certamen es: " + nota1);

            double nota1F = nota1*0.40;

            double notaNecesaria = (notaDeseada - nota1F) / 0.6;

            if (notaNecesaria > 70) {
                System.out.println("Su nota es imposible, siga soñando.");
                double notaMaxima = (70*0.60) + nota1F;
                System.out.println("La nota máxima a aspirar es un: " + notaMaxima);
            } else {
                System.out.println("La nota necesaria es: " + notaNecesaria);
            }
        }
    }
}