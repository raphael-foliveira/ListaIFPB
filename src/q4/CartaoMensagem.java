package q4;

abstract class CartaoMensagem {

    String destinatario;

    CartaoMensagem(String destinatario) {
        this.destinatario = destinatario;
    }

    abstract String retornarMensagem(String remetente);
}