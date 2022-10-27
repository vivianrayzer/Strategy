public class Disciplina {
    private ICalcMedia CalcMedia;
    private double media;
    private String nome;
    private double p1;
    private double p2;
    String situacao;

    public void setMedia(double media) {
        this.media = media;
    }

    public double getMedia() {
        return media;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP1() {
        return p1;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getP2() {
        return p2;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getSituacao(){
        return situacao;
    }

    public void CalcularMedia(){
        media= CalcMedia.CalcularMedia(p1, p2);
        situacao= CalcMedia.situacao(media);
    }

    Disciplina(ICalcMedia calculo) {
        this.CalcMedia = calculo;
    }

}
