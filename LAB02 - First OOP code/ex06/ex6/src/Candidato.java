class Candidato {
    private String nomeCompleto;
    private String dataNascimento;
    private String sexo;
    private double totalBens;
    private String reeleicao;
    private int partido;
    private String cargoPretendido;

    public Candidato(String nomeCompleto, String dataNascimento, String sexo, double totalBens,
                     String reeleicao, int partido, String cargoPretendido) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.totalBens = totalBens;
        this.reeleicao = reeleicao;
        this.partido = partido;
        this.cargoPretendido = cargoPretendido;
    }

    public void setNomeCompleto(String nome) {
        this.nomeCompleto = nome;
    }

    public void setDataNascimento(String data) {
        this.dataNascimento = data;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setTotalBens(double bens) {
        this.totalBens = bens;
    }

    public void setReeleicao(String reeleicao) {
        this.reeleicao = reeleicao;
    }

    public void setPartido(int partido) {
        this.partido = partido;
    }

    public void setCargoPretendido(String cargo) {
        this.cargoPretendido = cargo;
    }

    public String getNomeCompleto() {return nomeCompleto;}

    public String getDataNascimento() { return dataNascimento; }

    public String getSexo() { return sexo; }

    public double getTotalBens() { return totalBens; }

    public String getReeleicao() { return reeleicao; }

    public int getPartido() { return partido; }

    public String getCargoPretendido() { return cargoPretendido;  }

    public void exibirInformacoes() {
        System.out.println("Nome Completo: " + nomeCompleto);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Sexo: " + sexo);
        System.out.println("Total de Bens: R$" + totalBens);
        System.out.println("Candidato à Reeleição: " + reeleicao);
        System.out.println("Número do Partido: " + partido);
        System.out.println("Cargo Pretendido: " + cargoPretendido);
        System.out.println("--------------------------------------");
    }
}
