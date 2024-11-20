import java.io.*;
import java.util.List;

public class Persistencia {
    public static void salvar(String arquivo, Object objeto) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivo))) {
            out.writeObject(objeto);
            System.out.println("Dados salvos com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
            // e.printTrackTrace é o mesmo que dizer:
            //“Ei, exceção “e”, se imprime aí!”
            // e no nosso caso, é isso que queremo
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> T carregar(String arquivo) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(arquivo))) {
            return (T) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            // e.printTrackTrace é o mesmo que dizer:
            //“Ei, exceção “e”, se imprime aí!”
            // e no nosso caso, é isso que queremo
            return null;
        }
    }

    // USO? Servico de att, lá do CRA:
    static <T> List<T> carregarLista(String caminho, String descricao) {
        List<T> lista = Persistencia.carregar(caminho);
        if (lista == null || lista.isEmpty()) {
            throw new ErroArgumentoException("Nenhum dado de " + descricao + " encontrado no sistema.");
        }
        return lista;
    }
}
