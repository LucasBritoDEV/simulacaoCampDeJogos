import java.util.Calendar; 

public class Partida extends Entidade{
    private Time     Mandante;
    private Time     Visitante;
    public  Calendar Data;
    public  int      QtdGolsMandante;
    public  int      QtdGolsVisitante;
    public  Campeonato Campeonato;

    public Partida(Time mandante, Time visitante, Calendar dataDaPartida, Campeonato campeonato){
        this.Mandante  = mandante;
        this.Visitante = visitante;
        this.Data      = dataDaPartida;
        Campeonato     = campeonato;
    }

    public Time GetMandante(){
        return this.Mandante;
    }

    public Time GetVisitante(){
        return this.Visitante;
    }

    public void SetPlacar(int qtdGolsMandante, int qtdGolsVisitante){
        this.QtdGolsMandante  = qtdGolsMandante;
        this.QtdGolsVisitante = qtdGolsVisitante;
        
        this.Campeonato.AtualizaClassificacaoAposPartida(Mandante , GetPontosMandante (), GetSaldoMandante ());
        this.Campeonato.AtualizaClassificacaoAposPartida(Visitante, GetPontosVisitante(), GetSaldoVisitante());
    }

    public Time GetVencendor(){
        if(QtdGolsMandante > QtdGolsVisitante){
            return Mandante;
        }else if(QtdGolsMandante == QtdGolsVisitante){
            return null;
        }else{
            return Visitante;
        }
    }

    public int GetPontosMandante(){
        //if( PARTIDA JA ACONTECEU ){
            if(QtdGolsMandante > QtdGolsVisitante){
                return 3;
            }else if(QtdGolsMandante == QtdGolsVisitante){
                return 1;
            }else{
                return 0;
            }
        //}else{
            //return 0;
        //}
    }

    public int GetPontosVisitante(){
        //if( PARTIDA JA ACONTECEU ){
            if(QtdGolsVisitante > QtdGolsMandante){
                return 3;
            }else if(QtdGolsVisitante == QtdGolsMandante){
                return 1;
            }else{
                return 0;
            }
        //}else{
            //return 0;
        //}
    }

    public int GetSaldoMandante(){
        return QtdGolsMandante - QtdGolsVisitante;
    }

    public int GetSaldoVisitante(){
        return QtdGolsVisitante - QtdGolsMandante;
    }
}