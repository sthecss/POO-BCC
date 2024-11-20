import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class GerenciadorUniversidade{
        public static void main(String[] args) {
            String diretorio = "persistencia_dados";
            String cor = "\u001B[35m";
            String reset = "\u001B[0m";

            Scanner scanner = new Scanner(System.in);
            int opcao = 0;

            try {
                do {
                    System.out.println(cor + "\n=========================================");
                    System.out.println("   SISTEMA DE GERENCIAMENTO UNIVERSITÁRIO");
                    System.out.println("=========================================\n" + reset);
                    System.out.println("0. Reiniciar padrões de fábrica");
                    System.out.println("1. Iniciar");
                    System.out.println("2. Sobre o Trabalho");
                    System.out.println("3. Integrantes");
                    System.out.println("4. Sair");
                    System.out.println(cor + "=========================================\n" + reset);
                    System.out.print("-> Escolha uma opção: ");

                    // Verifica se a entrada é um número válido
                    if (!scanner.hasNextInt()) {
                        System.out.println("Erro: Entrada inválida. Certifique-se de digitar um número.");
                        scanner.nextLine(); // Limpa o buffer
                        continue; // Volta para o início do loop e repete a pergunta
                    }

                    opcao = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer após a leitura de um número

                    switch (opcao) {
                        case 0:
                            destruirDados(diretorio);
                            criarDados(diretorio);
                            break;
                        case 1:
                            menuIniciar(diretorio);
                            break;
                        case 2:
                            sobreTrabalho();
                            break;
                        case 3:
                            integrantes();
                            break;
                        case 4:
                            System.out.println("Saindo... Até logo!");
                            break;
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                    }
                } while (opcao != 4); // Continua até a opção 4 ser escolhida
            } catch (Exception e) {
                System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
                e.printStackTrace();
            } finally {
                scanner.close(); // Fechar o scanner para evitar vazamento de recursos
            }
        }

        private static void menuIniciar(String diretorio) {
            Scanner scanner = new Scanner(System.in);

            String cor = "\u001B[34m";  String reset = "\u001B[0m";

            while (true) {
                System.out.println(cor + "\n=========================================");
                System.out.println("            MENU DE SIMULAÇÕES");
                System.out.println("=========================================\n" + reset);
                System.out.println("a. Simulação Estudante");
                System.out.println("b. Simulação Professor");
                System.out.println("c. Simulação ADM");
                System.out.println("d. Voltar ao menu principal");
                System.out.println(cor + "=========================================\n" + reset);
                System.out.print("Escolha uma opção: ");

                String opcao = scanner.nextLine().toLowerCase();

                switch (opcao) {
                    case "a":
                        simulacaoEstudante(diretorio);
                        break;
                    case "b":
                        simulacaoProfessor(diretorio);
                        break;
                    case "c":
                        simulacaoAdm(diretorio);
                        break;
                    case "d":
                        return;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
        }

        private static void sobreTrabalho() {
            String cor = "\u001B[35m"; String reset = "\u001B[0m";

            System.out.println(cor + "\n=========================================");
            System.out.println("              SOBRE O TRABALHO");
            System.out.println("=========================================\n" + reset);
            System.out.println("Este trabalho implementa um sistema de"+
                                "\ngerenciamento universitário.");
            System.out.println("O sistema permite gerenciar:");
            System.out.println(" - Estudantes");
            System.out.println(" - Professores");
            System.out.println(" - Disciplinas");
            System.out.println(" - Turmas");
            System.out.println(" - Matrículas");
            System.out.println("Inclui funcionalidades de cadastro, con-"+
                                "\nsulta e simulações específicas.");
            System.out.println(cor + "=========================================\n" + reset);
        }

        private static void integrantes() {
            String cor = "\u001B[35m";  // Magenta
            String reset = "\u001B[0m";

            System.out.println(cor + "\n=========================================");
            System.out.println("           INTEGRANTES DO TRABALHO");
            System.out.println("=========================================\n" + reset);
            System.out.println("- Ana");
            System.out.println("- Anna");
            System.out.println("- Fernanda");
            System.out.println("- Sthephanny");
            System.out.println(cor + "=========================================\n" + reset);
        }

        private static void simulacaoEstudante(String diretorio) {
            try {
                List<Estudante> estudantes = Persistencia.carregar(diretorio + "/_estudantes.bin");
                List<Matricula> matriculas = Persistencia.carregar(diretorio + "/_matriculas.bin");

                if (estudantes == null || estudantes.isEmpty()) {
                    throw new ErroArgumentoException("Nenhuma matrícula encontrada no sistema.");
                }

                Scanner scanner = new Scanner(System.in);

                // Pergunta se é graduação ou pós-graduação
                System.out.print("Digite o tipo de estudante (1 para Graduação, 2 para Pós-graduação): ");
                int tipoEstudante = Integer.parseInt(scanner.nextLine());

                if (tipoEstudante != 1 && tipoEstudante != 2) {
                    throw new ErroArgumentoException("Opção inválida! Tente novamente.");
                }

                System.out.print("Digite o código de matrícula do estudante: ");
                String codMatriculaEstudante = scanner.nextLine();

                Estudante estudanteEncontrado = null;
                for (Estudante estudante : estudantes) {
                    if ((tipoEstudante == 1 && estudante instanceof EGraduacao) ||
                            (tipoEstudante == 2 && estudante instanceof EPosGrad)) {
                        if (estudante.getCodMatricula().equals(codMatriculaEstudante)) {
                            estudanteEncontrado = estudante;
                            break;
                        }
                    }
                }

                if (estudanteEncontrado == null) {
                    throw new ErroArgumentoException("Estudante não encontrado!");
                }

                System.out.println("\nBem-vindo(a), Aluno(a) " + estudanteEncontrado.getNome() + "!");

                String cor = "\u001B[36m"; String reset = "\u001B[0m";

                int sair;
                do {
                    System.out.println(cor + "\n========================================= ");
                    System.out.println("            MENU ESTUDANTE ");
                    System.out.println("========================================= " + reset);
                    System.out.println("1. Consultar Disciplinas Matriculadas");
                    System.out.println("2. Consultar Histórico Acadêmico");
                    System.out.println("0. Voltar");
                    System.out.print("Escolha uma opção: ");

                    sair = Integer.parseInt(scanner.nextLine());

                    switch (sair) {
                        case 1:
                            estudanteEncontrado.consultarDisciplinasMatriculadas(matriculas, codMatriculaEstudante);
                            break;
                        case 2:
                            estudanteEncontrado.consultarHistorico(matriculas, codMatriculaEstudante);
                            break;
                        case 0:
                            System.out.println("\nVoltando...");
                            break;
                        default:
                            System.out.println("Opção inválida! Tente novamente.");
                    }
                } while (sair != 0);

            } catch (ErroArgumentoException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Erro: Entrada inválida. Certifique-se de digitar um número.");
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            }
        }

        private static void simulacaoProfessor(String diretorio) {
            try {
                List<Professor> professores = Persistencia.carregar(diretorio + "/_professores.bin");
                List<Matricula> matriculas = Persistencia.carregar(diretorio + "/_matriculas.bin");

                if (professores == null || professores.isEmpty()) {
                    throw new ErroArgumentoException("Nenhum professor encontrado no sistema.");
                }
                if (matriculas == null || matriculas.isEmpty()) {
                    throw new ErroArgumentoException("Nenhuma matrícula encontrada no sistema.");
                }

                Scanner scanner = new Scanner(System.in);

                System.out.print("Digite o CPF do professor (apenas números): ");
                long cpfInput = Long.parseLong(scanner.nextLine());

                Professor professorAtual = professores.stream()
                        .filter(p -> p.getCpf().getCpf() == cpfInput)
                        .findFirst()
                        .orElseThrow(() -> new ErroArgumentoException("Professor não encontrado!"));

                System.out.println("\nBem-vindo(a), Professor(a) " + professorAtual.getNome() + "!");

                String cor = "\u001B[36m"; String reset = "\u001B[0m";

                scanner.nextLine();

                int sair;
                do {
                    System.out.println(cor + "\n========================================= ");
                    System.out.println("            MENU PROFESSOR ");
                    System.out.println("========================================= \n" + reset);
                    System.out.println("1. Visualizar Turmas");
                    System.out.println("2. Lançar Notas");
                    System.out.println("3. Consultar Estudantes de uma Disciplina");
                    System.out.println("4. Consultar Desempenho dos Estudantes");
                    System.out.println("0. Voltar");
                    System.out.print("Escolha uma opção: ");

                    sair = Integer.parseInt(scanner.nextLine());

                    switch (sair) {
                        case 1:
                            Professor.visualizarTurmas(professorAtual);
                            break;
                        case 2:
                            Professor.lancarNotas(professorAtual, matriculas, scanner);
                            break;
                        case 3:
                            Professor.consultarEstudantes(professorAtual, matriculas, scanner);
                            break;
                        case 4:
                            Professor.consultarDesempenho(professorAtual, matriculas, scanner);
                            break;
                        case 0:
                            System.out.println("\nVoltando...");
                            break;
                        default:
                            throw new ErroArgumentoException("Opção inválida! Tente novamente.");
                    }
                } while (sair != 0);

            } catch (ErroArgumentoException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Erro: Entrada inválida. Certifique-se de digitar números.");
            }
        }

        private static void simulacaoAdm(String diretorio) {
            try {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Digite a senha para acessar o menu do\nAdministrador: ");
                String senha = scanner.nextLine();

                if (!"alohomora".equals(senha)) {
                    throw new ErroArgumentoException("Senha incorreta! Acesso negado.");
                }

                String cor = "\u001B[36m";
                String reset = "\u001B[0m";
                int sair;

                do {
                    System.out.println(cor + "\n========================================= ");
                    System.out.println("            MENU DE ADMINISTRADOR ");
                    System.out.println("========================================= \n" + reset);
                    System.out.println("1. Desejo visualizar dados.");
                    System.out.println("2. Desejo cadastrar dados.");
                    System.out.println("3. Desejo remover dados.");
                    System.out.println("4. Desejo atualizar os CRAs.");
                    System.out.println("0. Voltar");
                    System.out.print("Escolha uma opção: ");

                    sair = Integer.parseInt(scanner.nextLine());

                    switch (sair) {
                        case 1:
                            ServicoExibicao.menuMostrarDados(diretorio);
                            break;
                        case 2:
                            ServicoCadastro.frufruOrdemCadastro();
                            ServicoCadastro.menuCadastrar(diretorio);
                            break;
                        case 3:
                            ServicoRemocao.menuRemoverDados(diretorio);
                            break;
                        case 4:
                            ServicoAtualizacao.cadastroGeralCRA(diretorio);
                        case 0:
                            System.out.println("\nVoltando...");
                            break;
                        default:
                            throw new ErroArgumentoException("Opção inválida! Tente novamente.");
                    }
                } while (sair != 0);

            } catch (ErroArgumentoException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Erro: Entrada inválida. Certifique-se de digitar números.");
            }
        }

        // ================================= CRIANDO DADOS (será excluido na versão final)
        public static void criarDados(String diretorio) {
            File pasta = new File(diretorio);
            if (!pasta.exists()) {
                if (pasta.mkdir()) {
                    System.out.println("Diretório criado: " + diretorio);
                } else {
                    System.err.println("Erro ao criar o diretório!");
                }
            } else {
                System.out.println("O diretório já existe: " + diretorio);
            }

            List<Estudante> estudantes = new ArrayList<>();
            List<Professor> professores = new ArrayList<>();
            List<Turma> turmas = new ArrayList<>();
            List<Disciplina> disciplinas = new ArrayList<>();
            List<Matricula> matriculas = new ArrayList<>();

            professores.add(new Professor(new CPF(37990380005L), "João Silva", LocalDate.of(1980, 5, 15), LocalDate.of(2010, 2, 1), "Matemática"));
            professores.add(new Professor(new CPF(69228886005L), "Maria Oliveira", LocalDate.of(1975, 8, 3), LocalDate.of(2012, 3, 15), "Física"));
            professores.add(new Professor(new CPF(37666210094L), "Carlos Sousa", LocalDate.of(1985, 10, 10), LocalDate.of(2014, 7, 1), "Química"));

            turmas.add(new Turma(LocalDate.of(2023, 1, 1), 1));
            turmas.add(new Turma(LocalDate.of(2023, 1, 1), 2));
            turmas.add(new Turma(LocalDate.of(2024, 1, 1), 1));
            turmas.add(new Turma(LocalDate.of(2024, 1, 1), 2));

            disciplinas.add(new Disciplina(turmas.get(0), 101, "Algoritmos", 30));
            disciplinas.add(new Disciplina(turmas.get(1), 102, "Estruturas de Dados", 90));
            disciplinas.add(new Disciplina(turmas.get(2), 103, "Banco de Dados", 60));
            disciplinas.add(new Disciplina(turmas.get(3), 104, "Sistemas Operacionais", 60));

            professores.get(0).adicionarDisciplina(disciplinas.get(0));
            professores.get(0).adicionarDisciplina(disciplinas.get(1));
            professores.get(1).adicionarDisciplina(disciplinas.get(2));
            professores.get(1).adicionarDisciplina(disciplinas.get(3));
            professores.get(2).adicionarDisciplina(disciplinas.get(0));
            professores.get(2).adicionarDisciplina(disciplinas.get(3));

            estudantes.add(new EGraduacao(new CPF(24190499005L), "Ana Costa", LocalDate.of(1999, 7, 22), "123456789", 0.0, "Estágio I"));
            estudantes.add(new EGraduacao(new CPF(69398918030L), "Carlos Silva", LocalDate.of(2000, 5, 10), "234567890", 0.0, "Estágio II"));
            estudantes.add(new EPosGrad(new CPF(13443024084L), "Beatriz Souza", LocalDate.of(1995, 3, 30), "345678901", 0.0, "Computação Quântica"));
            estudantes.add(new EPosGrad(new CPF(83674450070L), "Daniela Almeida", LocalDate.of(1996, 9, 17), "456789012", 0.0, "Inteligência Artificial"));
            estudantes.add(new EGraduacao(new CPF(25163130048L), "Eduardo Ferreira", LocalDate.of(1998, 12, 5), "567890123", 0.0, "Estágio III"));
            estudantes.add(new EGraduacao(new CPF(77204922000L), "Fernanda Lima", LocalDate.of(1997, 6, 12), "678901234", 0.0, "Estágio IV"));

            matriculas.add(new Matricula(estudantes.get(0), disciplinas.get(0), LocalDate.of(2024, 1, 15)));
                matriculas.get(0).setNota(90);
            matriculas.add(new Matricula(estudantes.get(1), disciplinas.get(0), LocalDate.of(2024, 1, 16)));
                matriculas.get(1).setNota(65);
            matriculas.add(new Matricula(estudantes.get(2), disciplinas.get(1), LocalDate.of(2024, 1, 17)));
                matriculas.get(2).setNota(80);
            matriculas.add(new Matricula(estudantes.get(3), disciplinas.get(2), LocalDate.of(2024, 1, 18)));
                matriculas.get(3).setNota(70);
            matriculas.add(new Matricula(estudantes.get(4), disciplinas.get(2), LocalDate.of(2024, 1, 19)));
                matriculas.get(4).setNota(78);
            matriculas.add(new Matricula(estudantes.get(5), disciplinas.get(3), LocalDate.of(2024, 1, 20)));
                matriculas.get(5).setNota(50);

            for (Matricula matricula : matriculas) {
                for (Professor professor : professores) {
                    if (professor.getDisciplinas().contains(matricula.getDisciplina())) {
                        professor.adicionarMatricula(matricula);
                    }
                }
            }

            Persistencia.salvar(diretorio + "/_estudantes.bin", estudantes);
            Persistencia.salvar(diretorio + "/_professores.bin", professores);
            Persistencia.salvar(diretorio + "/_turmas.bin", turmas);
            Persistencia.salvar(diretorio + "/_disciplinas.bin", disciplinas);
            Persistencia.salvar(diretorio + "/_matriculas.bin", matriculas);

            ServicoAtualizacao.cadastroGeralCRA(diretorio); // garantir o calculod e CRAS
        }

        public static void destruirDados(String diretorio) {
            // Listando os arquivos que precisam ser excluídos
            String[] arquivos = {
                    "/_estudantes.bin",
                    "/_professores.bin",
                    "/_turmas.bin",
                    "/_disciplinas.bin",
                    "/_matriculas.bin"
            };

            // Verificando e excluindo os arquivos
            for (String arquivo : arquivos) {
                File arquivoRemover = new File(diretorio + arquivo);
                if (arquivoRemover.exists()) {
                    if (arquivoRemover.delete()) {
                        System.out.println("Arquivo excluído: " + arquivoRemover.getAbsolutePath());
                    } else {
                        System.err.println("Erro ao excluir o arquivo: " + arquivoRemover.getAbsolutePath());
                    }
                } else {
                    System.out.println("Arquivo não encontrado: " + arquivoRemover.getAbsolutePath());
                }
            }

            // Opcional: Verificando se o diretório está vazio e excluindo-o
            File pasta = new File(diretorio);
            if (pasta.exists() && pasta.isDirectory()) {
                String[] listaArquivos = pasta.list();
                if (listaArquivos == null || listaArquivos.length == 0) {
                    if (pasta.delete()) {
                        System.out.println("Diretório vazio excluído: " + diretorio);
                    } else {
                        System.err.println("Erro ao excluir o diretório vazio: " + diretorio);
                    }
                }
            }
        }

    }