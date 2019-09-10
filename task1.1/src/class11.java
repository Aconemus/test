import java.util.Scanner;

public class class11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input N:");
        int N = in.nextInt();//Liczba liczb
        try {
            int[] F = new int[N];//Tablica liczb
            F[0] = 1;//Inicjalizacja pierwszych dwóch
            F[1] = 1;
            for (int i = 2; i < N; i++) {//Cykl obliczeniowy Fibonacciego do N
                F[i] = F[i - 1] + F[i - 2];
            }
            for (int i = 0; i < F.length; i++) {//Cykl wyjściowy liczb Fibonacciego do N
                System.out.print(F[i] + " ");
            }
        } catch (NegativeArraySizeException e) {//Kurwa
            System.out.print("Kurwa");
        } finally {
            in.close();
        }
    }
}
