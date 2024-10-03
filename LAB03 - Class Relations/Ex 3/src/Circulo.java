import javax.xml.crypto.Data;

public class Circulo {
    // ============================== ATRIBUTOS:
    private Double raio;
    private Ponto centro;


    // ============================== CONTRUTORES
    public Circulo(Double raio) {
        this.raio = raio;
        this.centro = new Ponto(1.0, 1.0);
    }

    public Circulo(Double raio, Ponto centro) {
        this.raio = raio;
        this.centro = new Ponto (centro.getX(), centro.getY());
    }

    public Circulo(Double raio, Double x, Double y) {
        this.raio = raio;
        this.centro = new Ponto (x, y);
    }

    // ============================== GETS E SETS
    public Double getRaio() {
        return raio;
    }
    public void setRaio(Double raio) {
        this.raio = raio;
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
