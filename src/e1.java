public class e1 {
//    int total_de_eleitores = 1000;
//    int validos = 800;
//    int votos_brancos = 150;
//    int nulos =50;

    public static void main(String args[]) {

        percValidos(800, 1000);

        percBrancos(150, 1000);

        percNulos(50, 1000);
    }


    private static void percValidos(int num1, int num2) {
        System.out.println("O percentual de votos válidos em relação ao total de eleitores é:  " + (num1 / num2));
    }

    private static void percBrancos(int num1, int num2) {
        System.out.println("O percentual de votos em brancos em relação ao total de eleitores é: " + (num1 / num2));
    }

    private static void percNulos(int num1, int num2) {
        System.out.println("O percentual de nulos em relação ao total de eleitores é: " + (num1 / num2));
    }


}
