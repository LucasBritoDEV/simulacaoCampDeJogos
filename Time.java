import java.util.List;
import java.util.ArrayList;

public class Time extends EntidadeComNome{
    private List<Jogador> Elenco;
    public  Jogador       Capitao;
    public  Estadio       Estadio;
    public  List<Partida> PartidasComoMandante;
    public  List<Partida> PartidasComoVisitante;

    public Time(String nome, Estadio estadio, Jogador capitao, Jogador... jogadores){
        this.Nome    = nome;
        this.Estadio = estadio;
        this.Capitao = capitao;

        this.Elenco = new ArrayList<Jogador>();

        Elenco.add(capitao  );
        AddJogador(jogadores);
    }

    public void AddJogador(Jogador... jogadores){
        for(Jogador j : jogadores){
            if(!Elenco.contains(j))
                Elenco.add(j);
        }
    }

    public List<Jogador> GetElenco(){
        return this.Elenco;
    }

    public void ExibeElenco(){
        System.out.println("\nElenco do "+this.Nome);
        for(Jogador j : Elenco){
            System.out.println("    » "+ j.Nome);
            // Destacar o capitão
            // Mostrar também os demais dados do jogador
        }
    }
}