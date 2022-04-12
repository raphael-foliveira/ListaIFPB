package q3;

class Q3 {
    public static void main(String[] args) {
        Data data = new Data(30, 12, 2001);

        System.out.println(data.toString());
        data.avancarData();
        System.out.println(data.toString());
        data.avancarData();
        System.out.println(data.toString());

        Data outraData = new Data(28, 2, 2005);

        System.out.println(outraData.toString());
        outraData.avancarData();
        System.out.println(outraData.toString());

        Data dataHoje = new Data();

        System.out.println(dataHoje.toString());

    }
}