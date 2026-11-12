import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args){
        Scanner lados = new Scanner(System.in);
        int lado1 = lados.nextInt();
        int lado2 = lados.nextInt();
        System.out.println(Calcular_Retangulo(lado1,lado2));
    }

    public static int Calcular_Retangulo(int lado1, int lado2){
        return lado1 * lado2;
    }
}
