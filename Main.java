import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Calendar;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Util.cls();
        Scanner in = new Scanner(System.in);

        
        Estadio estSantos, estSaoPaulo, estPalmeiras, estCorinthians;
        Time santos, saoPaulo, palmeiras, corinthians;

        System.out.println("Santos");
        estSantos    = Cadastrador.GetNovoEstadioCadastradoPeloUsuario(in);
        Jogador jsa1 = Cadastrador.GetNovoJogadorCadastradoPeloUsuario(in);        
        Jogador jsa2 = Cadastrador.GetNovoJogadorCadastradoPeloUsuario(in);
        Jogador jsa3 = Cadastrador.GetNovoJogadorCadastradoPeloUsuario(in);

        List<Jogador> listaJogadores = Arrays.asList(jsa2, jsa3);
        Jogador[] elencoSantos = listaJogadores.toArray(new Jogador[listaJogadores.size()]);

        System.out.println("    » Cadastro de time");
        System.out.printf("        » Nome: ");
        String nomeTime = in.nextLine();
        santos = new Time(nomeTime, estSantos, jsa1, elencoSantos);

        santos.ExibeElenco();


        Jogador j1 = new Jogador("Deigo Alves" , 182, Util.GetData(13, 5, 1992));
        Jogador j2 = new Jogador("Rafinha"     , 167, Util.GetData(17, 7, 1997));
        Jogador j3 = new Jogador("Pablo Marí"  , 192, Util.GetData( 2, 9, 1989));
        Jogador j4 = new Jogador("Rodrigo Caio", 185, Util.GetData( 3, 3, 1995));
        Jogador j5 = new Jogador("William Arão", 185, Util.GetData(22, 2, 1994));
        Estadio maraca = new Estadio("Maracanã", "Endereço do Maracanã");
        Time flamengo  = new Time("Flamengo", maraca, j1, j2, j3, j4, j5);


        Jogador jv1 = new Jogador("Talles" , 182, Util.GetData(13, 5, 1992));
        Jogador jv2 = new Jogador("Ribamar", 167, Util.GetData(17, 7, 1997));
        Jogador jv3 = new Jogador("Guarin" , 192, Util.GetData( 2, 9, 1989));
        Jogador jv4 = new Jogador("Cano"   , 185, Util.GetData( 3, 3, 1995));
        Jogador jv5 = new Jogador("Odivan" , 185, Util.GetData(22, 2, 1994));
        Estadio saoJenuario = new Estadio("São Jenuário", "Bom Sucesso");
        Time vasco = new Time("Vasco", saoJenuario, jv1, jv2, jv3, jv4, jv5);

        Jogador jb1 = new Jogador("Loco Abreu"      , 182, Util.GetData(13, 5, 1992));
        Jogador jb2 = new Jogador("Garrincha"       , 167, Util.GetData(17, 7, 1997));
        Jogador jb3 = new Jogador("Túlio Maravilha" , 192, Util.GetData( 2, 9, 1989));
        Jogador jb4 = new Jogador("Honda"           , 185, Util.GetData( 3, 3, 1995));
        Jogador jb5 = new Jogador("Gatito Fernandes", 185, Util.GetData(22, 2, 1994));
        Estadio engenhao = new Estadio("Engenhão", "Quebrada");
        Time botafogo = new Time("Botafogo", engenhao, jb1, jb2, jb3, jb4, jb5);


        Jogador jf1 = new Jogador("Fred"           , 182, Util.GetData(13, 5, 1992));
        Jogador jf2 = new Jogador("Deco"           , 167, Util.GetData(17, 7, 1997));
        Jogador jf3 = new Jogador("Conca"          , 192, Util.GetData( 2, 9, 1989));
        Jogador jf4 = new Jogador("Washington"     , 185, Util.GetData( 3, 3, 1995));
        Jogador jf5 = new Jogador("Diego Cavalieri", 185, Util.GetData(22, 2, 1994));
        Estadio laranjeiras = new Estadio("Laranjeiras", "Tijuca");
        Time fluminense = new Time("Fluminense", laranjeiras, jf1, jf2, jf3, jf4, jf5);

        Campeonato campeonato = new Campeonato("Carioca 2020", 2021, flamengo, vasco, fluminense, botafogo);

        // Turno
        Partida flaXvas = campeonato.AddPartida(flamengo, vasco     , Util.GetDataHora(15, 5, 2020, 21, 30));
        Partida botXflu = campeonato.AddPartida(botafogo, fluminense, Util.GetDataHora(15, 5, 2020, 21, 30));

        Partida flaXbot = campeonato.AddPartida(flamengo, botafogo  , Util.GetDataHora(22, 5, 2020, 21, 30));
        Partida vasXflu = campeonato.AddPartida(vasco   , fluminense, Util.GetDataHora(22, 5, 2020, 21, 30));

        Partida flaXflu = campeonato.AddPartida(flamengo, fluminense, Util.GetDataHora(29, 5, 2020, 21, 30));
        Partida vasXbot = campeonato.AddPartida(vasco   , botafogo  , Util.GetDataHora(29, 5, 2020, 21, 30));

        // Returno
        Partida vasXfla = campeonato.AddPartida(vasco     , flamengo, Util.GetDataHora(15, 5, 2020, 21, 30));
        Partida fluXbot = campeonato.AddPartida(fluminense, botafogo, Util.GetDataHora(15, 5, 2020, 21, 30));

        Partida botXfla = campeonato.AddPartida(botafogo  , flamengo, Util.GetDataHora(22, 5, 2020, 21, 30));
        Partida fluXvas = campeonato.AddPartida(fluminense, vasco   , Util.GetDataHora(22, 5, 2020, 21, 30));

        Partida fluXFla = campeonato.AddPartida(fluminense, flamengo, Util.GetDataHora(29, 5, 2020, 21, 30));
        Partida botXvas = campeonato.AddPartida(botafogo  , vasco   , Util.GetDataHora(29, 5, 2020, 21, 30));

        // Turno
        flaXvas.SetPlacar(5, 0);
        botXflu.SetPlacar(0, 0);
        flaXbot.SetPlacar(0, 0);
        vasXflu.SetPlacar(0, 0);
        flaXflu.SetPlacar(0, 0);
        vasXbot.SetPlacar(0, 0);

        // Returno
        vasXfla.SetPlacar(0, 0);
        fluXbot.SetPlacar(0, 0);
        botXfla.SetPlacar(0, 0);
        fluXvas.SetPlacar(2, 0);
        fluXFla.SetPlacar(0, 0);
        botXvas.SetPlacar(0, 0);

        // flamengo.ExibeElenco();

        campeonato.ExibirClassificacaoGeral();

        System.out.println("\n\nTudo certo");
    
    }
 
}    