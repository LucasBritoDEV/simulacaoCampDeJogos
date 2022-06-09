import java.util.Calendar; 

public class Jogador extends EntidadeComNome{
    public Time       Time;
    public EnumGenero Genero;
    public Calendar   Nascimento;
    public int        AlturaEmCms;

    public Jogador(String nome, int alturaEmCms, Calendar dataDeNascimento){
        this.Nome        = nome;
        this.AlturaEmCms = alturaEmCms;
        this.Nascimento  = dataDeNascimento;
        this.Genero      = EnumGenero.MASCULINO;
    }

    public Jogador(String nome , int alturaEmCms, Calendar dataDeNascimento, EnumGenero sexo){
        this.Nome        = nome;
        this.Genero      = sexo;
        this.AlturaEmCms = alturaEmCms;
        this.Nascimento  = dataDeNascimento;
    }
}