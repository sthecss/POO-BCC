public class Circulo {
    // ============================== ATRIBUTOS :
    private Double raio;
    private Ponto centro;


    // ============================== CONTRUTORES :
    public Circulo() { }


    // ============================== GETS E SETS :

    public void setCentro(Ponto centro){ this.centro = centro;}
    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio){ this.raio = raio;}
    public Ponto getCentro() { return centro; }


    // ============================== DEMAIS MÉTODOS :
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                ", centro=" + centro +
                '}';
    }
}
