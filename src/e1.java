public class e1 {
    int total_de_eleitores = 1000;
    int validos = 800;
    int votos_brancos = 150;
    int nulos =50;

    public static void main(String args[]){

        e1 validos = new e1();
        validos.percValidos(800, 1000);

        e1 brancos = new e1();
        brancos.percBrancos(150, 1000);

        e1 nulos = new e1();
        nulos.percNulos(50, 1000);
    }


    void percValidos(int num1, int num2){
        System.out.println("O percentual de votos válidos em relação ao total de eleitores é:  "+ (validos  / total_de_eleitores));
    }

    void percBrancos (int num1, int num2){
        System.out.println("O percentual de votos em brancos em relação ao total de eleitores é: " + (votos_brancos   / total_de_eleitores));
    }

    void percNulos (int num1, int num2){
        System.out.println("O percentual de nulos em relação ao total de eleitores é: "+ (nulos   / total_de_eleitores));
    }


}
