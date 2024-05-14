public class Main {
    public static void main(String[] args) {
        // CATEGORIAS
        Categoria categoriaReceitas = cadastrarCategoria("Receitas");
        Categoria categoriaContas = cadastrarCategoria("Contas Fixas");
        Categoria categoriaViagens = cadastrarCategoria("Viagens");
        Categoria categoriaLazer = cadastrarCategoria("Lazer");

        // TRANSAÇÕES
        cadastrarTransacao("Salário Jan/2024", 1000.0, categoriaReceitas);
        cadastrarTransacao("Mesada", 50.0, categoriaReceitas);
        cadastrarTransacao("Ingresso Show", -150.0, categoriaLazer);
        cadastrarTransacao("Conta de Luz", -100.0, categoriaContas);
        cadastrarTransacao("Disney", -400.0, categoriaViagens);

        // SALDO TOTAL
        double total = saldoTotal();
        System.out.println("Saldo Total: " + total);
    }

    // Importações de funções do utilitários
    public static Categoria cadastrarCategoria(String nome) {
        return Utilitarios.cadastrarCategoria(nome);
    }

    public static Transacao cadastrarTransacao(String descricao, double valor, Categoria categoria) {
        return Utilitarios.cadastrarTransacao(descricao, valor, categoria);
    }

    public static double saldoTotal() {
        return Utilitarios.saldoTotal();
    }
}
