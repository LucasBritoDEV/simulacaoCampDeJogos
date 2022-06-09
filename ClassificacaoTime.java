import java.util.List;
import java.util.ArrayList;

public class ClassificacaoTime{
    public Time Time;
    public int  QtdPontos;
    public int  QtdVitorias;
    public int  SaldoDeGols;
    public List<Partida> Partidas;

    public ClassificacaoTime(Time time){
        Time = time;
        Partidas = new ArrayList<Partida>();
    }

    public int GetPontos(){
        return this.QtdPontos;
    }

    public int GetVitorias(){
        return this.QtdVitorias;
    }

    public int GetSaldoDeGols(){
        return this.SaldoDeGols;
    }
}

//  Flamengo    93      30      125
//  Palmeiras   79      18      35