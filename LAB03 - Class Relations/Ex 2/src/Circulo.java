public class Circulo {
    // ============================== ATRIBUTOS
    private Double raio;
    private Ponto centro;


    // ============================== CONTRUTORES
    public Circulo(Double raio, Ponto centro) {
        this.raio = raio;
        this.centro = centro;
    }


    // ============================== GETS E SETS
    public Double getRaio() {
        return raio;
    }

    public Ponto getCentro() {
        return centro;
    }


    // ============================== DEMAIS MÉTODOS
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                ", centro=" + centro +
                '}';
    }
}
