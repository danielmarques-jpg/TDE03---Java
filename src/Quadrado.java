import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args){
        Scanner lados = new Scanner(System.in);
        int lado = lados.nextInt();
        System.out.println(Calcular_Quadrado(lado));
    }

    public static int Calcular_Quadrado(int lado){
        return lado * lado;
    }
}
