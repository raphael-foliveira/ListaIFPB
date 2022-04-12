package q4;

class MensagemNatal extends CartaoMensagem {

    MensagemNatal(String destinatario) {
        super(destinatario);
    }

    @Override
    String retornarMensagem(String remetente) {
        String mensagem = String.format("Feliz natal, %s! Com carinho, %s.", destinatario, remetente);
        return mensagem;
    }

}