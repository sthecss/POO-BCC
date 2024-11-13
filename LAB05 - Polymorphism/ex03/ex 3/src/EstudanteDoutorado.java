public class EstudanteDoutorado extends EstudantePosGrad {
    String tituloTese;

    public EstudanteDoutorado(String nome, String endereco, String formacao,
                              String linhadDePesquisa, String tituloTese) {
        super(nome, endereco, formacao, linhadDePesquisa);
        this.tituloTese = tituloTese;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("EstudanteDoutorado{" +
                "tituloTese='" + tituloTese + '\'' +
                '}');

    }

    public void print(boolean teste) {
        if (!teste) {
            print();
        } else {
            mostrarAlunos();
        }
    }

    public String getTituloTese() {
        return tituloTese;
    }

    public void setTituloTese(String tituloTese) {
        this.tituloTese = tituloTese;
    }

    public void mostrarAlunos () {
        System.out.println("\nAluno de Doutorado: ");
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Formação: " + getFormacao());
        System.out.println("Linha de pesquisa: " + getLinhaDePesquisa());
        System.out.println("Título da tese: " + tituloTese);
    }
}
