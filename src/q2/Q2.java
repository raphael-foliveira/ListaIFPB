package q2;

class Q2 {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("John", "Almeida", 5000);
        Empregado empregado2 = new Empregado("Mary", "Jane", 7000);
        System.out.println("Salário anual empregado1: ");
        System.out.println(empregado1.calcularSalarioAnual());
        System.out.println("Salário empregado2: ");
        System.out.println(empregado2.calcularSalarioAnual());

        empregado1.darAumento(10);
        empregado2.darAumento(10);

        System.out.println("Salário anual empregado1: ");
        System.out.println(empregado1.calcularSalarioAnual());
        System.out.println("Salário empregado2: ");
        System.out.println(empregado2.calcularSalarioAnual());
    }
}