public class Geometrica implements ICalcMedia{
    @Override
    public double CalcularMedia(double p1, double p2) {
        double mult;
        mult = p1*p2;
        return Math.sqrt(mult);
    }

    public String situacao(double media){
        if(media > 7){
            return "Aluno Aprovado";

        }
        else{
            return "Aluno reprovado";
        }

    }
}
