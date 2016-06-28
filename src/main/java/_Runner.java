/**
 * Created by ivanpryshchepau on 6/23/16.
 */
public class _Runner {

    static int[][] mas3;

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        configure(n);
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(mas3[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void configure(int n) {

        int[] mas1 = new int[n];
        int[] mas2 = new int[n];
        mas3 = new int[n][n];

        if (n%2 != 0) {
            System.err.println("Write num which will divided on 2");
            System.exit(1);
        }

        for (int i = 0; i < n; i++) {
            mas1[i] = i + 1;
            mas2[n - i - 1] = i + 1;
        }

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1){
                mas3[i - 1] = mas1;
            } else {
                mas3[i - 1] = mas2;
            }
        }


    }

}
