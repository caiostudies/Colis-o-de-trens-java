import java.util.InputMismatchException;
import java.util.Scanner;

public class tremfinal {
    public static void main(String[] args) {

        while (true) {
            try {
                Scanner entrada = new Scanner(System.in);
                int S0a;
                int SOb;
                int Va;
                int Vb;

                while (true) { //SOa

                    System.out.print("Digite a posição inicial do trem A(SOa): "); //tempo
                    S0a = entrada.nextInt();

                    if (S0a > 1000 || S0a < 0) {
                        System.out.print("O número deve ser maior ou igual a zero e menor que 1000\n");
                        continue;
                    }
                    break;
                }

                while (true) { //SOb
                    System.out.print("Digite a posição inicial do trem B(SOB): "); //tempo
                    SOb = entrada.nextInt();
                    if (SOb > 1000 || SOb < 0) {
                        System.out.print("O número deve ser maior ou igual a zero e menor que 1000\n");
                        continue;
                    }
                    break;
                }

                while (true) { //Va
                    System.out.print("Digite a velocidade do trem A(VA): "); //velocidade
                    Va = entrada.nextInt();
                    if (Va < 0) {
                        System.out.print("A velocidade do tremA sempre será positiva. Por favor, digite novamente\n");
                        continue;
                    }
                    break;
                }

                while (true) { //Vb

                    System.out.print("Digite a velocidade do trem B(VB): "); //velocidade
                    Vb = entrada.nextInt();
                    if (Vb > 0) {
                        System.out.print("A velocidade do tremB sempre será negativa. Por favor, digite novamente\n");
                        continue;
                    }
                    break;
                }


                double equacao_tempo;
                equacao_tempo = (S0a - SOb) / (Vb - Va);

                double equacao_tremB;
                equacao_tremB = SOb + Vb * equacao_tempo;

                double equacao_tremA;
                equacao_tremA = S0a + Va * equacao_tempo;

                System.out.println(equacao_tempo * 3600 + "segundos");

                System.out.println(equacao_tremA + "KM");

                System.out.println(equacao_tremB + "KM");

                if (equacao_tremA == equacao_tremB) {
                    System.out.print("Eles irão colidir pois seus tempos são iguais\n" +
                            "TremA:" + equacao_tremA + "KM" + "TremB:" + equacao_tremB + "\nCom o tempo:" + (equacao_tempo * 3600) + "segundos\n");
                }


            }
            catch (InputMismatchException e){
                System.out.println("Ops... você digitou caracteres invalidos. Precisamos que digite apenas números");
            }




        }
    }
}






