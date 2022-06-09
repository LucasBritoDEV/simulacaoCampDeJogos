import java.util.List;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Campeonato extends EntidadeComNome{
    private int Ano;
    private List<Partida          > Partidas;
    private List<ClassificacaoTime> ClassificacaoGeral;

    public Campeonato(String nome, int ano, Time... times){
        this.Ano  = ano;
        this.Nome = nome;

        Partidas           = new ArrayList<Partida          >();
        ClassificacaoGeral = new ArrayList<ClassificacaoTime>();

        AddTimes(times);
    }

    public void ExibirClassificacaoGeral(){
        ClassificacaoGeral.sort(Comparator
            .comparing    (ClassificacaoTime::GetPontos     , Comparator.reverseOrder())
            .thenComparing(ClassificacaoTime::GetVitorias   , Comparator.reverseOrder())
            .thenComparing(ClassificacaoTime::GetSaldoDeGols, Comparator.reverseOrder())
        );

        System.out.println("\n» Classificação do "+this.Nome);
        System.out.println("    Nome do time | Pt | Vt | SG");
        System.out.println("    -------------|----|----|----");
        for(ClassificacaoTime c : ClassificacaoGeral){
            System.out.printf("    %-12s | %2d | %2d |%3d\n", c.Time.Nome, c.QtdPontos, c.QtdVitorias, c.SaldoDeGols);
        }
    }

    public void AtualizaClassificacaoAposPartida(Time time, int qtdPontos, int saldoNaPartida){
        ClassificacaoTime classificacaoDoTime = new ClassificacaoTime(time);

        for(ClassificacaoTime cl : ClassificacaoGeral){
            if(cl.Time.Nome.equals(time.Nome)){
                classificacaoDoTime = cl;
                break;
            }
        }

        classificacaoDoTime.QtdPontos   = classificacaoDoTime.QtdPontos   + qtdPontos;
        classificacaoDoTime.SaldoDeGols = classificacaoDoTime.SaldoDeGols + saldoNaPartida;
        if(qtdPontos == 3)
            classificacaoDoTime.QtdVitorias = classificacaoDoTime.QtdVitorias + 1;
    }

    private void AddTimes(Time... times){
        List timesDoCampeonato = new ArrayList<Time>();

        for(Time t : times){
            if(!timesDoCampeonato.contains(t)){
                ClassificacaoGeral.add( new ClassificacaoTime(t) );
                timesDoCampeonato.add(t);
            }
        }
    }

    public int GetAno(){
        return this.Ano;
    }

    public void AddPartida(Partida... partidas){
        for(Partida p : partidas){
            if(!Partidas.contains(p))
                Partidas.add(p);
        }
    }

    public Partida AddPartida(Time mandante, Time visitante, Calendar dataDaPartida){
        Partida novaPartida = new Partida(mandante, visitante, dataDaPartida, this);
        AddPartida(novaPartida);
        return novaPartida;
    }
}