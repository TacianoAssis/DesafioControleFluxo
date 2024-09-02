import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        int parametroUm, parametroDois;

       do {
           System.out.print("Digite o primeiro parâmetro: ");
           try {
               parametroUm = terminal.nextInt();
               break;
           }catch (InputMismatchException e){
               System.out.println("Por favor informe um valor inteiro válido!");
               terminal.nextLine();
           }
       }while(true);
        do {
            System.out.print("Digite o segundo parâmetro: ");
            try {
                parametroDois = terminal.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("Por favor informe um valor inteiro válido!");
                terminal.nextLine();
            }
        }while(true);

        try {
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if( parametroUm > parametroDois)
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
        int contagem = parametroDois - parametroUm;
        for(int i = 0; i <= contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}