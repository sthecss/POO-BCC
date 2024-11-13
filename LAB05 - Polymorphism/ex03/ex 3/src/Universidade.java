public class Universidade {
    private String nome;
    private String fundacao;
    private Estudante[] estudantes = new Estudante[100];
    private int t = -1;

    public Universidade () {
    }

    public Universidade (String nome, String fundacao) {
        this.nome = nome;
        this.fundacao = fundacao;
    }

    public void quantEstudantes() {
        int grad = 0, posgrad = 0, mestr = 0, doc = 0;

        for (int i = 0; i < t; i++) {
            if (estudantes[i] instanceof EstudanteGraduacao) {
                grad++;
            } else if (estudantes[i] instanceof EstudantePosGrad) {
                posgrad++;
            } else if (estudantes[i] instanceof EstudanteMestrado) {
                mestr++;
            } else {
                doc++;
            }
        }

        System.out.println("Graduação: " + grad);
        System.out.println("Pós Graduação: " + posgrad);
        System.out.println("Mestrado: " + mestr);
        System.out.println("Doutorado: " + doc);
    }

    public void mostrarAlunos () {
        int graduacao = 0, mestrado = 0, doutorado = 0;

        for (int i = 0; i <= t; i++) {
            estudantes[i].mostrarAlunos();
            if (estudantes[i] instanceof EstudanteGraduacao) {
                graduacao++;
            } else if (estudantes[i] instanceof EstudanteMestrado) {
                mestrado++;
            } else {
                doutorado++;
            }
        }
    }

    public void Graduacao(String nome, String endereco, String tituloTCC) {
        t++;
        estudantes[t] = new EstudanteGraduacao(nome, endereco, tituloTCC);
    }

    public void Mestrado(String nome, String endereco, String formacao, String linhadepesquisa, String tipo, String titulodissert) {
        t++;
        estudantes[t] = new EstudanteMestrado(nome, endereco, formacao, linhadepesquisa, tipo, titulodissert);
    }

    public void Doutorado(String nome, String endereco, String formacao, String linhadepesquisa, String titulotese) {
        t++;
        estudantes[t] = new EstudanteDoutorado(nome, endereco, formacao, linhadepesquisa, titulotese);
    }

}