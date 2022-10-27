public class Aritmetica implements ICalcMedia{

    public double CalcularMedia(double p1, double p2){
        double mediaA;
        mediaA = (p1+p2)/2;
        return mediaA;
    }

    public String situacao(double media){
        if(media > 5){
            return "Aluno Aprovado";

        }
        else{
            return "Aluno reprovado";
        }
    }
}
