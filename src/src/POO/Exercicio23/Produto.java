package POO.Exercicio23;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    double valorTotalEmEstoque(){
        return preco * quantidade;
    }

    void adicionarEstoque(int quantidade){
        this.quantidade =  this.quantidade + quantidade;
    }
    void removerEstoque(int quantidade){
        this.quantidade = this.quantidade - quantidade;
    }
}

