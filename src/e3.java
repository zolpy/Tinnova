public class e3 {
    public static void main(String[] args) {

        int fatorial = 1;

        for (int n = 1; n <= 10; n++) {

            fatorial = n;

            for (int fat = (n - 1); fat >= 1; fat--) {

                if (fat == 0) {

                    fat = 1;

                }

                fatorial = fatorial * fat;
            }

            System.out.println("Fatorial do número (" + n + ") é igual a " + fatorial);
        }
    }
}