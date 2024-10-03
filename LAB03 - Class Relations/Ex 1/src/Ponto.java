public class Ponto {
    // ============================== ATRIBUTOS:
    private Double x;
    private Double y;

    // ============================== CONTRUTORES:
    public Ponto(Double x, Double y){
        this.x = x;
        this.y = y;
    }

    // ============================== GETS E SETS:
    public Double getX() { return x; }

    public Double getY() { return y; }

    // ============================== DEMAIS MÉTODOS:
    @Override
    public String toString() {
        return "Ponto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
