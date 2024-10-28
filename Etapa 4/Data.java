//Definindo classe Data
public class Data {
    // variáveis para armazenar dia, mês e ano
    private int Dia;
    private int Mes;
    private int Ano;

    public Data() {

    }

    // método construtor de data
    public Data(int dia, int mes, int ano) {
        // verificando com if/else se dia mês e ano são válidos com o método
        // validaData()
        if (validaData(dia, mes, ano)) {
            this.Dia = dia;
            this.Mes = mes;
            this.Ano = ano;
        } else {
            System.out.println("Data inválida");
            this.Dia = 01;
            this.Mes = 01;
            this.Ano = 2000;
        }
    }

    // getters e setters
    public int getDia() {
        return Dia;
    }

    public void setDia(int dia) {
        // verificando se dia é valido, caso for recebe o dia informado caso não recebe
        // "Data inválida"
        if (validaData(dia, this.Mes, this.Ano)) {
            this.Dia = dia;
        } else {
            System.out.println("Data inválida");
        }
    }

    public int getMes() {
        return Mes;
    }

    public void setMes(int mes) {
        // verificando se mês é válido
        if (validaData(this.Dia, mes, this.Ano)) {
            this.Mes = mes;
        } else {
            System.out.println("Data inválida");
        }
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int ano) {
        // verificando se ano é válido
        if (validaData(this.Dia, this.Mes, ano)) {
            this.Ano = ano;
        } else {
            System.out.println("Data inválida");
        }
    }

    // método para verificar se o ano é bissexto
    public boolean verificaAnoBissexto() {
        // se o ano divido por 4 tiver o resto igual a 0 e se divisivel por 100 for
        // diferente de 0 ele retorna que o ano é bissexto
        if (Ano % 4 == 0 && Ano % 100 != 0 || Ano % 400 == 0) {
            return true;
        } else
            return false;
    }
        
    private boolean validaData(int dia, int mes, int ano) {
        if (ano < 0) { // não pode anos negativos
           return false;
        }
        if (mes < 1 || mes > 12) {
            return false;
        }
        // verifica o último dia do mês (pois um mês pode ter 28, 29, 30 ou 31 dias)
        int ultimoDia;
        switch (mes) {
            // meses com 30 dias
            case 4:
            case 6:
            case 9:
            case 11:
                ultimoDia = 30;
                break;
            case 2: // fevereiro
                if ((ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0)) { // se é ano bissexto
                    ultimoDia = 29;
                } else {
                    ultimoDia = 28;
                }
                break;
            default: // demais meses
                ultimoDia = 31;
        }
        if (dia < 1 || dia > ultimoDia) {
            return false;
        }
        return true;
    }

   // método toString para a formatação dos dados de Data
    @Override
    public String toString() {
        return Dia + "." + Mes + "." + Ano;
    }
}
