import java.util.Scanner;

public class class12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input N:");
        int N = in.nextInt();
        try {
            for (int Row = 1; Row <= N; Row++) {
                for (int i = 1; i < Row*2; i++) {
                    if (i <= Row){
                        System.out.print(i + " ");
                    }
                    else{
                        System.out.print(i-(i-Row)*2 + " ");
                    }
                }
                System.out.println("");
            }

        } catch (NegativeArraySizeException e) {//Kurwa
            System.out.print("Kurwa");
        } finally {
            in.close();
        }
    }
}
