import java.io.Serializable;

public class CPF implements Serializable {
    private static final long serialVersionUID = 1L; // Adicionar uma versão serial

    // ================================= Atributos
    private long cpf;


    // ================================= Construtores
    public CPF(long cpf) {
        setCpf(cpf);
    }


    // ================================= Getters e Setters
    public long getCpf() {
        return cpf;
    }
    public void setCpf(long cpf) {
        if (validarCpf(cpf)) {
            this.cpf = cpf;
        } else {
            throw new ErroArgumentoException("ERRO. CPF inválido.");
        }
    }

    private boolean validarCpf(long cpf) {
        String auxiliar = String.format("%011d", cpf); // Formata para 11 dígitos

        // Verifica se todos os números são iguais ou tamanho diferente de 11
        if (auxiliar.matches("(\\d)\\1{10}") || auxiliar.length() != 11) {
            return false;
        }

        // Calcula o primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += Character.getNumericValue(auxiliar.charAt(i)) * (10 - i);
        }
        int primeiroDigito = calcularDigito(soma);

        // Calcula o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += Character.getNumericValue(auxiliar.charAt(i)) * (11 - i);
        }
        int segundoDigito = calcularDigito(soma);

        // Valida os dois dígitos verificadores
        return Character.getNumericValue(auxiliar.charAt(9)) == primeiroDigito
                && Character.getNumericValue(auxiliar.charAt(10)) == segundoDigito;
    }

    private int calcularDigito(int soma) {
        int digito = 11 - (soma % 11);
        return (digito > 9) ? 0 : digito;
    }


    @Override
    public String toString() {
        return "CPF: " + cpf + ' ';
    }
}