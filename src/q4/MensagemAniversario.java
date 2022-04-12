package q4;

class MensagemAniversario extends CartaoMensagem {

    MensagemAniversario(String destinatario) {
        super(destinatario);
    }

    @Override
    String retornarMensagem(String remetente) {
        String mensagem = String.format("Feliz aniversário, %s! Com carinho, %s.", destinatario, remetente);
        return mensagem;
    }

}