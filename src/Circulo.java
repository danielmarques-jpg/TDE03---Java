import java.util.Scanner;

public class Circulo {
    public static void main(String[] args){
        Scanner Calcular_Circulo = new Scanner(System.in);
        int raio = Calcular_Circulo.nextInt();
        System.out.println(Calcular(raio));
    }
    public static double Calcular(int raio){
        return Math.PI * (raio * raio);
    }
}
