public class Main {

    public static void main(String args[]){
        Configuracoes configuracoes = Configuracoes.QUANTIDADE_MAXIMA_ENTRADAS;
        int qtdMaximaEntradas = configuracoes.getValor();

        Entradas entrada = new Entradas();
        Hdb3 hdb3 = new Hdb3();

        for(int i = 0; i < qtdMaximaEntradas; i ++) {
            entrada.capturarEntrada();
        }
        entrada.imprimirResultados();

        hdb3.setEntradas(entrada.getNumeros());
        hdb3.processarEntradas();


    }
}
