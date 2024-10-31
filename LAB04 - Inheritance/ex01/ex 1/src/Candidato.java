public class Candidato {
    // ==================== ATRIBUTOS :
    String nomeCompleto;
    String dataNascimento;
    String sexo;
    String totalBens;
    Boolean reeleicao;
    int partido;
    String cargoPretendido;


    // ==================== CONSTRUTORES :
    public Candidato(String nomeCompleto, String dataNascimento, String sexo, String totalBens,
                     Boolean reeleicao, int partido, String cargoPretendido) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.totalBens = totalBens;
        this.reeleicao = reeleicao;
        this.partido = partido;
        this.cargoPretendido = cargoPretendido;
    }


    // ==================== GETTERS E SETTERS :
    public String getCargoPretendido() { return cargoPretendido; }
    public void setCargoPretendido(String cargoPretendido) {
        this.cargoPretendido = cargoPretendido;
    }

    public int getPartido() { return partido; }
    public void setPartido(int partido) {
        this.partido = partido;
    }

    public Boolean getReeleicao() { return reeleicao; }
    public void setReeleicao(Boolean reeleicao) {
        this.reeleicao = reeleicao;
    }

    public String getTotalBens() { return totalBens; }
    public void setTotalBens(String totalBens) {
        this.totalBens = totalBens;
    }

    public String getSexo() { return sexo; }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNomeCompleto() { return nomeCompleto; }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }


    // ==================== DEMAIS METODOS :
    @Override
    public String toString() {
        return "CANDIDATO {" +
                "nomeCompleto='" + nomeCompleto + "|" +
                ", dataNascimento='" + dataNascimento + "|" +
                ", sexo='" + sexo + "|" +
                ", totalBens='" + totalBens + "|" +
                ", reeleicao=" + reeleicao + "|" +
                ", partido=" + partido + "|" +
                ", cargoPretendido='" + cargoPretendido + "}";
    }
}
