package q4;

class MensagemDiaDosNamorados extends CartaoMensagem {

    MensagemDiaDosNamorados(String destinatario) {
        super(destinatario);
    }

    @Override
    String retornarMensagem(String remetente) {
        String mensagem = String.format("Feliz dia dos namorados, %s. Com carinho, %s.", destinatario, remetente);
        return mensagem;
    }

}