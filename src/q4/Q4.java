package q4;

class Main {
    public static void main(String[] args) {
        MensagemAniversario aniversario = new MensagemAniversario("João");
        MensagemDiaDosNamorados diaDosNamorados = new MensagemDiaDosNamorados("Maria");
        MensagemNatal natal = new MensagemNatal("Pedro");

        System.out.println(aniversario.retornarMensagem("Carlos"));
        System.out.println(diaDosNamorados.retornarMensagem("Lorena"));
        System.out.println(natal.retornarMensagem("Luís"));

    }
}