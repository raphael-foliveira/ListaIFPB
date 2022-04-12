package q1;

class Q1 {
    public static void main(String[] args) {
        Fatura fatura = new Fatura(100, "USB Drive", 5, 100);
        double totalAPagar = fatura.calcularValorFatura();
        System.out.println(totalAPagar);
    }
}