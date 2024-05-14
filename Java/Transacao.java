public class Transacao {
    String descricao;
    double valor;
    Categoria categoria ;

    public Transacao(String descricao, double valor, Categoria categoria){
        this.descricao = descricao;
        this.valor = valor;
        this.categoria = categoria;
    }

    public void exibir(){
        System.out.println("Descrição: " + descricao + " | Valor: " + valor + " | Categoria: " + categoria.nome);
    }
}
