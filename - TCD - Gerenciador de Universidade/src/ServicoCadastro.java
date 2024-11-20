import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicoCadastro {
    public static void frufruOrdemCadastro() {
        String cor = "\u001B[36m";  // Azul
        String reset = "\u001B[0m"; // Reset para cor padrão

        System.out.println(cor + "\n=====================================");
        System.out.println("      ORDEM GERAL DE CADASTRO");
        System.out.println("=====================================\n" + reset);

        System.out.println(cor + "1. " + reset + "Cadastrar Professores");
        System.out.println("   (Há possibilidade de associar a disciplinas depois.\n");

        System.out.println(cor + "2. " + reset + "Cadastrar Alunos");
        System.out.println("   (Alunos são independentes e podem ser cadastrados a qualquer momento).\n");

        System.out.println(cor + "3. " + reset + "Cadastrar Turmas");
        System.out.println("   (Turmas são a base para associar disciplinas).\n");

        System.out.println(cor + "4. " + reset + "Cadastrar Disciplinas");
        System.out.println("   (Cada disciplina deve ser vinculada a uma turma e professor existente).\n");

        System.out.println(cor + "5. " + reset + "Cadastrar Matrículas");
        System.out.println("   (As matrículas dependem de Alunos e Disciplinas já cadastrados).\n");

        System.out.println(cor + "=====================================");
        System.out.println("  Siga esta ordem para consistência!");
        System.out.println("=====================================\n" + reset);
    }
    static void menuCadastrar(String diretorio) {
        Scanner scanner = new Scanner(System.in);  // Scanner para capturar a entrada do usuário
        int sair;

        String cor = "\u001B[36m";  // Azul
        String reset = "\u001B[0m";

        do {
            System.out.println(cor + "\n===============================");
            System.out.println("         MENU DE CADASTRO");
            System.out.println("===============================\n" + reset);
            System.out.println("1. Cadastrar Estudante");
            System.out.println("2. Cadastrar Professor");
            System.out.println("3. Cadastrar Turma");
            System.out.println("4. Cadastrar Disciplina");
            System.out.println("5. Cadastrar Matrícula");
            System.out.println("0. Voltar.");
            System.out.print(cor + "\n-> Escolha uma opção: " + reset);

            sair = scanner.nextInt();
            scanner.nextLine();

            switch (sair) {
                case 1:
                    System.out.println(cor + "\n===============================");
                    System.out.println("    CADASTRO DE ESTUDANTE");
                    System.out.println("===============================\n" + reset);
                    cadastrarEstudante(diretorio);
                    break;
                case 2:
                    System.out.println(cor + "\n===============================");
                    System.out.println("   CADASTRO DE PROFESSOR");
                    System.out.println("===============================\n" + reset);
                    cadastrarProfessor(diretorio);
                    break;
                case 3:
                    System.out.println(cor + "\n===============================");
                    System.out.println("     CADASTRO DE TURMA");
                    System.out.println("===============================\n" + reset);
                    cadastrarTurma(diretorio);
                    break;
                case 4:
                    System.out.println(cor + "\n===============================");
                    System.out.println("   CADASTRO DE DISCIPLINA");
                    System.out.println("===============================\n" + reset);
                    cadastrarDisciplina(diretorio);
                    break;
                case 5:
                    System.out.println(cor + "\n===============================");
                    System.out.println("   CADASTRO DE MATRÍCULA");
                    System.out.println("===============================\n" + reset);
                    cadastrarMatricula(diretorio);
                    break;
                case 0:
                    System.out.println("\nVoltando...");
                    break;
                default:
                    System.out.println(cor + "\nOpção inválida! Tente novamente." + reset);
            }
        } while (sair != -0);
    }
    public static void cadastrarEstudante(String diretorio) {
        Scanner scanner = new Scanner(System.in);
        List<Estudante> estudantes;

        // Carregar lista de estudantes existente ou criar uma nova
        String caminhoArquivo = diretorio + "/_estudantes.bin";
        estudantes = Persistencia.carregar(caminhoArquivo);
        if (estudantes == null) {
            estudantes = new ArrayList<>();
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Cadastro do Estudante");

        CPF cpf = null;
        while (cpf == null) {
            try {
                System.out.print("CPF (apenas números): ");
                long cpfL = Long.parseLong(scanner.nextLine());
                cpf = new CPF(cpfL); // Validação ocorre na construção ou no setCpf
            } catch (NumberFormatException e) {
                System.out.println("Erro: O CPF deve conter apenas números. Tente novamente.");
            } catch (ErroArgumentoException e) {
                System.out.println("Erro: " + e.getMessage() + " Tente novamente.");
            }
        }

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Nascimento)");
        int dia, mes, ano;

        while (true) { // ISSO É DIA
            System.out.print("Digite o dia: ");
            String diaStr = scanner.nextLine();
            try {
                dia = Integer.parseInt(diaStr);
                if (dia < 1 || dia > 31) {
                    throw new ErroArgumentoException("Dia inválido. Deve ser entre 1 e 31.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor, insira um número válido para o dia.");
            } catch (ErroArgumentoException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        while (true) { // ISSO É MES
            System.out.print("Digite o mês: ");
            String mesStr = scanner.nextLine();
            try {
                mes = Integer.parseInt(mesStr);
                if (mes < 1 || mes > 12) {
                    throw new ErroArgumentoException("Mês inválido. Deve ser entre 1 e 12.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor, insira um número válido para o mês.");
            } catch (ErroArgumentoException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        while (true) { // ISSO É ANO
            System.out.print("Digite o ano: ");
            String anoStr = scanner.nextLine();
            try {
                ano = Integer.parseInt(anoStr);
                if (ano < 1900 || ano > 2100) {
                    throw new ErroArgumentoException("Ano inválido. Deve ser entre 1900 e 2100.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor, insira um número válido para o ano.");
            } catch (ErroArgumentoException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        try {
            Estudante aux = new EGraduacao();  // Cria o objeto estudante
            aux.validarData(dia, mes, ano);  // Valida a data
        } catch (ErroArgumentoException e) {
            System.out.println("Erro na data: " + e.getMessage());
        }

        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);

        System.out.print("Digite o código de matrícula: ");
        String codigo = scanner.nextLine();

        // Verificar tipo de estudante
        System.out.println("O estudante é da graduação? (sim/não)");
        String resposta = scanner.nextLine();
        Estudante estudante;

        if (resposta.equalsIgnoreCase("sim")) {
            System.out.print("Digite qual estágio está fazendo: ");
            String estagio = scanner.nextLine();

            estudante = new EGraduacao(cpf, nome, dataNascimento, codigo, 0.0, estagio);
        } else {
            System.out.println("O estudante é da pós-graduação? (sim/não)");
            String resposta2 = scanner.nextLine();

            if (resposta2.equalsIgnoreCase("sim")) {
                System.out.print("Digite o título do seu tema de pesquisa: ");
                String tema = scanner.nextLine();

                estudante = new EPosGrad(cpf, nome, dataNascimento, codigo, 0.0, tema);
            } else {
                System.out.println("Tipo de estudante não identificado. Cadastro cancelado.");
                return;
            }
        }

        // Adicionar o estudante à lista e salvar
        estudantes.add(estudante);
        Persistencia.salvar(caminhoArquivo, estudantes);

        System.out.println("Estudante cadastrado e salvo com sucesso!");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
    public static void cadastrarProfessor(String diretorio) {
        Scanner scanner = new Scanner(System.in);
        List<Professor> professores;

        // Carregar lista de professores existente ou criar uma nova
        String caminhoArquivo = diretorio + "/_professores.bin";
        professores = Persistencia.carregar(caminhoArquivo);
        if (professores == null) {
            professores = new ArrayList<>();
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Cadastro de Professor");

        CPF cpf = null;
        while (cpf == null) {
            try {
                System.out.print("CPF (apenas números): ");
                long cpfL = Long.parseLong(scanner.nextLine());
                cpf = new CPF(cpfL); // Validação ocorre na construção ou no setCpf
            } catch (NumberFormatException e) {
                System.out.println("Erro: O CPF deve conter apenas números. Tente novamente.");
            } catch (ErroArgumentoException e) {
                System.out.println("Erro: " + e.getMessage() + " Tente novamente.");
            }
        }

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Nascimento)");
        int dia, mes, ano;

        while (true) { // ISSO É DIA
            System.out.print("Digite o dia: ");
            String diaStr = scanner.nextLine();
            try {
                dia = Integer.parseInt(diaStr);
                if (dia < 1 || dia > 31) {
                    throw new ErroArgumentoException("Dia inválido. Deve ser entre 1 e 31.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor, insira um número válido para o dia.");
            } catch (ErroArgumentoException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        while (true) { // ISSO É MES
            System.out.print("Digite o mês: ");
            String mesStr = scanner.nextLine();
            try {
                mes = Integer.parseInt(mesStr);
                if (mes < 1 || mes > 12) {
                    throw new ErroArgumentoException("Mês inválido. Deve ser entre 1 e 12.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor, insira um número válido para o mês.");
            } catch (ErroArgumentoException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        while (true) { // ISSO É ANO
            System.out.print("Digite o ano: ");
            String anoStr = scanner.nextLine();
            try {
                ano = Integer.parseInt(anoStr);
                if (ano < 1900 || ano > 2100) {
                    throw new ErroArgumentoException("Ano inválido. Deve ser entre 1900 e 2100.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor, insira um número válido para o ano.");
            } catch (ErroArgumentoException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        try {
            Estudante aux = new EGraduacao();  // Cria o objeto estudante
            aux.validarData(dia, mes, ano);  // Valida a data
        } catch (ErroArgumentoException e) {
            System.out.println("Erro na data: " + e.getMessage());
        }

        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);

        System.out.println("Inicio Contrato)");
        int diaCont, mesCont, anoCont;

        while (true) { // ISSO É DIA
            System.out.print("Digite o dia: ");
            String diaStr = scanner.nextLine();
            try {
                diaCont = Integer.parseInt(diaStr);
                if (diaCont < 1 || diaCont > 31) {
                    throw new ErroArgumentoException("Dia inválido. Deve ser entre 1 e 31.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor, insira um número válido para o dia.");
            } catch (ErroArgumentoException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        while (true) { // ISSO É MES
            System.out.print("Digite o mês: ");
            String mesStr = scanner.nextLine();
            try {
                mesCont = Integer.parseInt(mesStr);
                if (mesCont < 1 || mesCont > 12) {
                    throw new ErroArgumentoException("Mês inválido. Deve ser entre 1 e 12.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor, insira um número válido para o mês.");
            } catch (ErroArgumentoException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        while (true) { // ISSO É ANO
            System.out.print("Digite o ano: ");
            String anoStr = scanner.nextLine();
            try {
                anoCont = Integer.parseInt(anoStr);
                if (anoCont < 1900 || anoCont > 2100) {
                    throw new ErroArgumentoException("Ano inválido. Deve ser entre 1900 e 2100.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor, insira um número válido para o ano.");
            } catch (ErroArgumentoException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        try {
            Estudante aux = new EGraduacao();  // Cria o objeto estudante
            aux.validarData(diaCont, mesCont, anoCont);  // Valida a data
        } catch (ErroArgumentoException e) {
            System.out.println("Erro na data: " + e.getMessage());
        }
        LocalDate inicioContrato = LocalDate.of(ano, mes - 1, dia);

        System.out.print("Departamento: ");
        String departamento = scanner.nextLine();

        Professor professor = new Professor(cpf, nome, dataNascimento, inicioContrato, departamento);
        professores.add(professor);

        Persistencia.salvar(caminhoArquivo, professores);

        System.out.println("Professor cadastrado e salvo com sucesso!");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
    public static void cadastrarTurma(String diretorio) {
        Scanner scanner = new Scanner(System.in);
        List<Turma> turmas;

        // Carregar lista de turmas existente ou criar uma nova
        String caminhoArquivo = diretorio + "/_turmas.bin";
        turmas = Persistencia.carregar(caminhoArquivo);
        if (turmas == null) {
            turmas = new ArrayList<>();
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Cadastro de Turma");

        System.out.println("Ano corrente da turma:");
        System.out.print("Digite o ano (ex.: 2024): ");
        int ano = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o semestre (1 ou 2): ");
        int semestre = Integer.parseInt(scanner.nextLine());

        // Validar semestre
        if (semestre < 1) {
            System.out.println("Semestre inválido! O valor deve ser 1 ou 2. Cadastro cancelado.");
            return;
        }

        // Criar a turma e adicionar à lista
        LocalDate anoCorrente = LocalDate.of(ano, 1, 1); // Apenas o ano é relevante
        Turma turma = new Turma(anoCorrente, semestre);
        turmas.add(turma);

        // Salvar a lista de turmas
        Persistencia.salvar(caminhoArquivo, turmas);

        System.out.println("Turma cadastrada com sucesso!");
        System.out.println("Código da Turma: " + turma.getCodTurma());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
    public static void cadastrarDisciplina(String diretorio) {
        Scanner scanner = new Scanner(System.in);
        List<Disciplina> disciplinas;

        // Carregar lista de disciplinas existente ou criar uma nova
        String caminhoArquivo = diretorio + "/_disciplinas.bin";
        disciplinas = Persistencia.carregar(caminhoArquivo);
        if (disciplinas == null) {
            disciplinas = new ArrayList<>();
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Cadastro de Disciplina");

        System.out.print("Código da disciplina: ");
        int codigo = Integer.parseInt(scanner.nextLine());

        System.out.print("Nome da disciplina: ");
        String nome = scanner.nextLine();

        System.out.print("Carga horária (em horas): ");
        int cargaHorario = Integer.parseInt(scanner.nextLine());

        // Exibir turmas disponíveis
        List<Turma> turmasMostrar = Persistencia.carregar(diretorio + "/_turmas.bin");
        String cor = "\u001B[36m"; String reset = "\u001B[0m";

        // Exibir a lista de turmas com índice
        System.out.println(cor + "\nLista de Turmas:"+reset);
        if (turmasMostrar != null) {
            for (int i = 0; i < turmasMostrar.size(); i++) {
                Turma turma = turmasMostrar.get(i);
                System.out.println((i + 1) + ". COD ID: " + turma.getCodTurma() +
                        " | Ano Corrente: " + turma.getAnoCorrente()+
                        " | Semestre ( "+ turma.getSemestre()+" )");
            }
        }

        System.out.print("\nCom base na lista acima, ");
        System.out.print(cor+ "Escolha a turma referência (número da turma): "+reset);
        int escolhaTurma = scanner.nextInt();
        scanner.nextLine();

        if (turmasMostrar != null && (escolhaTurma < 1 || escolhaTurma > turmasMostrar.size())) {
            System.out.println("Opção inválida! Cadastro cancelado.");
            return;
        }

        Turma turmaAtual = turmasMostrar.get(escolhaTurma - 1);

        // Exibir professores disponíveis
        List<Professor> professores = Persistencia.carregar(diretorio + "/_professores.bin");
        if (professores == null || professores.isEmpty()) {
            System.out.println("Nenhum professor encontrado. Cadastro cancelado.");
            return;
        }

        System.out.println(cor + "Lista de Professores:" + reset);
        for (int i = 0; i < professores.size(); i++) {
            Professor professor = professores.get(i);
            System.out.println((i + 1) + ". Nome: " + professor.getNome() + " | " + professor.getCpf());
        }

        System.out.print(cor+"\nEscolha o número do professor responsável pela disciplina: "+reset);
        int escolhaProfessor = scanner.nextInt();
        scanner.nextLine();

        if (escolhaProfessor < 1 || escolhaProfessor > professores.size()) {
            System.out.println("Opção inválida! Cadastro cancelado.");
            return;
        }

        Professor professorSelecionado = professores.get(escolhaProfessor - 1);

        // Criar a disciplina e vincular ao professor
        Disciplina disciplina = new Disciplina(turmaAtual, codigo, nome, cargaHorario);
        disciplina.setProfessor(professorSelecionado);
        disciplinas.add(disciplina);
        professorSelecionado.adicionarDisciplina(disciplina);

        // Salvar a lista de disciplinas e atualizar o professor
        Persistencia.salvar(caminhoArquivo, disciplinas);
        Persistencia.salvar(diretorio + "/_professores.bin", professores);

        System.out.println("Disciplina cadastrada e vinculada ao professor com sucesso!");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
    public static void cadastrarMatricula(String diretorio) {
        Scanner scanner = new Scanner(System.in);
        List<Matricula> matriculas;

        // Carregar lista de matrículas existente ou criar uma nova
        String caminhoArquivoMatriculas = diretorio + "/_matriculas.bin";
        matriculas = Persistencia.carregar(caminhoArquivoMatriculas);
        if (matriculas == null) {
            matriculas = new ArrayList<>();
        }

        // Carregar estudantes existentes
        String caminhoArquivoEstudantes = diretorio + "/_estudantes.bin";
        List<Estudante> estudantes = Persistencia.carregar(caminhoArquivoEstudantes);
        if (estudantes == null || estudantes.isEmpty()) {
            System.out.println("Nenhum estudante encontrado. Cadastro de matrícula cancelado.");
            return;
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Cadastro de Matrícula");
        System.out.println("Lista de Estudantes Disponíveis:");

        for (Estudante estudante : estudantes) {
            System.out.println("- Código Matrícula: " + estudante.getCodMatricula() +
                    ", Nome: " + estudante.getNome());
        }

        System.out.print("Digite o código de matrícula do estudante: ");
        String codigoEstudante = scanner.nextLine();

        Estudante estudanteSelecionado = null;
        for (Estudante estudante : estudantes) {
            if (estudante.getCodMatricula().equals(codigoEstudante)) {
                estudanteSelecionado = estudante;
                break;
            }
        }

        if (estudanteSelecionado == null) {
            System.out.println("Estudante não encontrado. Cadastro de matrícula cancelado.");
            return;
        }

        // Carregar disciplinas existentes
        String caminhoArquivoDisciplinas = diretorio + "/_disciplinas.bin";
        List<Disciplina> disciplinas = Persistencia.carregar(caminhoArquivoDisciplinas);
        if (disciplinas == null || disciplinas.isEmpty()) {
            System.out.println("Nenhuma disciplina encontrada. Cadastro de matrícula cancelado.");
            return;
        }

        System.out.println("Lista de Disciplinas Disponíveis:");
        for (Disciplina disciplina : disciplinas) {
            System.out.println("- Código: " + disciplina.getCodigo() +
                    ", Nome: " + disciplina.getNome());
        }

        System.out.print("Digite o código da disciplina: ");
        int codigoDisciplina = Integer.parseInt(scanner.nextLine());

        Disciplina disciplinaSelecionada = null;
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getCodigo() == codigoDisciplina) {
                disciplinaSelecionada = disciplina;
                break;
            }
        }

        if (disciplinaSelecionada == null) {
            System.out.println("Disciplina não encontrada. Cadastro de matrícula cancelado.");
            return;
        }

        // Entrada da data de início da matrícula
        System.out.println("Digite a data de início da matrícula:");
        System.out.print("Dia: ");
        int dia = Integer.parseInt(scanner.nextLine());
        System.out.print("Mês: ");
        int mes = Integer.parseInt(scanner.nextLine());
        System.out.print("Ano: ");
        int ano = Integer.parseInt(scanner.nextLine());
        LocalDate dataMatricula = LocalDate.of(ano, mes, dia);

        // Criar a matrícula e adicionar à lista
        Matricula matricula = new Matricula(estudanteSelecionado, disciplinaSelecionada, dataMatricula);
        matriculas.add(matricula);

        // Salvar a lista de matrículas
        Persistencia.salvar(caminhoArquivoMatriculas, matriculas);

        System.out.println("Matrícula cadastrada com sucesso!");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

}
