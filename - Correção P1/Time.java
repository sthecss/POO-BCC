import static java.sql.Types.NULL;

public class Time {
    // ============================== ATRIBUTOS :
    private String nomeTime;
    private Jogador[] titular;
    private Jogador substituto;

    // ============================== CONSTRUTOR :
    public Time(String nomeTime, Jogador[] titular, Jogador substituto) {
        this.nomeTime = nomeTime;
        this.titular = new Jogador[2];
        this.titular[0] = new Jogador(titular[0].getNome(), titular[0].getIdade(), titular[0].getPeso(),titular[0].getAltura());
        this.titular[1] = new Jogador(titular[1].getNome(), titular[1].getIdade(), titular[1].getPeso(),titular[1].getAltura());
        this.substituto = new Jogador(substituto.getNome(), substituto.getIdade(), substituto.getPeso(),substituto.getAltura());
    }

    public Time(String nomeTime,Jogador[] titular) {
        this.nomeTime = nomeTime;
        this.titular = new Jogador[2];
        this.titular[0] = new Jogador(titular[0].getNome(), titular[0].getIdade(), titular[0].getPeso(),titular[0].getAltura());
        this.titular[1] = new Jogador(titular[1].getNome(), titular[1].getIdade(), titular[1].getPeso(),titular[1].getAltura());
    }

    // ============================== GETTERS E SETTERS :
    public String getNomeTime() { return nomeTime; }
    public void setNomeTime(String nomeTime) { this.nomeTime = nomeTime; }

    public Jogador getSubstituto() { return substituto; }
    public void setSubstituto(Jogador substituto) { this.substituto = substituto; }

    // Nao me parece logico um get e set JOGADOR, já que estamos usando a ideia de composicao.
    // Se eu quiser pegar algo do JOGADOR, utilizo get e sets da propria classe,
    // alem da exibicao poder seer via toString

    // ============================== DEMAIS METODOS :
    public double calculaMedia() {
        double soma = titular[0].getIdade() + titular[1].getIdade();
        int totalJogadores = 2; // Começa com dois titulares

        if (substituto != null) { // Verifica se o substituto existe
            soma += substituto.getIdade();
            totalJogadores++; // Inclui o substituto no total
        }

        return soma / totalJogadores;
    }


    public String toString(){
        if(substituto != null){
            return "Time: " + nomeTime + "\n" +
                    "Titulares) " + titular[0].toString() + titular[1].toString() + "\n" +
                    "Substituto) " + substituto.toString();
        }

        return "Time: " + nomeTime + "\n" +
                "Titulares: " + titular[0].toString() + titular[1].toString();
    }

}
