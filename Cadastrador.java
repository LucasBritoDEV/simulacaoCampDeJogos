import java.util.Scanner;

public class Cadastrador {




    public static Estadio GetNovoEstadioCadastradoPeloUsuario  ( Scanner in){ 
        System.out.printf("    » Informe o nome do estádio: ");
        String nomeEstadio = in.nextLine();
        System.out.printf("    » Informe o endereço do estádio: ");
        String endEstadio = in.nextLine();
        return new Estadio(nomeEstadio, endEstadio);

    }

    public static Jogador GetNovoJogadorCadastradoPeloUsuario(Scanner in){
        System.out.println("    » Cadastro de jogador");
        System.out.printf("        » Nome: ");
        String nome = in.nextLine();
        System.out.printf("        » Altura (em centímetros - somente números): ");
        int altura = in.nextInt();
        System.out.printf("        » dia de nascimento: ");
        int dia = in.nextInt();
        System.out.printf("        » mês de nascimento (somente números): ");
        int mes = in.nextInt();
        System.out.printf("        » ano de nascimento: ");
        int ano = in.nextInt();
        in.nextLine();
        return new Jogador(nome, altura, Util.GetData(dia, mes, ano));
    }
  
   
    






} 