import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String opcao;
        do{
            System.out.println("==Calculadora==");
            System.out.println("Informe o que deseja fazer: ");
            System.out.println("soma - Soma");
            System.out.println("sub - subtração");
            System.out.println("div - divisão");
            System.out.println("mult - multiplicação");
            System.out.println("Escreva leave para sair");
            opcao = scanner.next();

            double n1=0, n2=0;

            if(opcao != "leave"){
                System.out.print("Informe o 1º numero: ");
                n1 = scanner.nextInt();
                System.out.print("Informe o 2º numero: ");
                n2 = scanner.nextInt();
            }

            Calc calc = new Calc(n1, n2);

            double resp = 0;
            switch (opcao){
                case "soma":
                    resp = calc.Soma();
                    System.out.println("A resposta é: " + resp);
                    break;
                case "sub":
                    resp = calc.Subtracao();
                    System.out.println("A resposta é: " + resp);
                    break;
                case "div":
                    if(n2 == 0 || n1 == 0){
                        System.out.println("Não é possível dividír por 0");
                    }else{
                        resp = calc.Divisao();
                        System.out.println("A resposta é: " + resp);
                    }
                    break;
                case "mult":
                    resp = calc.Multiplicacao();
                    System.out.println("A resposta é: " + resp);
                    break;
                case "leave":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Informe uma opção válida.");
                    break;
            }
        }while(opcao != "leave");
    }
}