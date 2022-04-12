package q3;

import java.time.LocalDate;
import java.util.Arrays;

class Data {
    int dia;
    int mes;
    int ano;

    Data(int dia, int mes, int ano) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.mes = (validarMes()) ? mes : null;
        this.dia = (validarDia()) ? dia : null;
    }

    Data() {
        this.ano = LocalDate.now().getYear();
        this.mes = LocalDate.now().getMonthValue();
        this.dia = LocalDate.now().getDayOfMonth();
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean validarMes() {
        if (mes > 12 || mes < 1) {
            return false;
        }
        return true;
    }

    public boolean validarDia() {
        int[] meses30 = { 4, 6, 9, 11 };
        if (dia > 31 || dia < 1) {
            return false;
        }
        if (Arrays.asList(meses30).contains(mes) && dia > 30) {
            return false;
        }
        if (mes == 2 && dia > 28) {
            return false;
        }
        return true;
    }

    public String toString() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }

    public void avancarData() {
        dia++;
        dia = (validarDia()) ? dia : 1;
        mes = (dia != 1) ? mes : mes + 1;
        mes = (mes > 12) ? 1 : mes;
        ano = (mes != 1) ? ano : ano + 1;
    }

}