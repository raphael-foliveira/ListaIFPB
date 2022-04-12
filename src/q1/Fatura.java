package q1;

class Fatura {
    int numeroItem;
    String descricaoItem;
    int quantidade;
    double preco;

    Fatura(int numeroItem, String descricaoItem, int quantidade, double preco) {
        this.numeroItem = numeroItem;
        this.descricaoItem = descricaoItem;
        this.quantidade = (quantidade > 0) ? quantidade : 0;
        this.preco = (preco > 0) ? preco : 0;
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double calcularValorFatura() {
        return quantidade * preco;
    }

}