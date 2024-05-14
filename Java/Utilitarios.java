import java.util.ArrayList;
import java.util.List;

public class Utilitarios {
    static List<Categoria> LISTA_CATEGORIA = new ArrayList<>();
    static List<Transacao> LISTA_TRANSACAO = new ArrayList<>();
    
    public static Categoria cadastrarCategoria(String nome){
        Categoria novaCategoria = new Categoria(nome);
        LISTA_CATEGORIA.add(novaCategoria);
        return novaCategoria;
    }

    public static Transacao cadastrarTransacao(String descricao, double valor, Categoria categoria){
        Transacao novaTransacao = new Transacao(descricao, valor, categoria);
        LISTA_TRANSACAO.add(novaTransacao); 
        return novaTransacao;
    }

    public static double saldoTotal(){
        double total = 0;

        for(Transacao t : LISTA_TRANSACAO){
            total += t.valor;
        }
        return total;
    }
}
