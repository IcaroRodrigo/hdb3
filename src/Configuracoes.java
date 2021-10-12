public enum Configuracoes {
    QUANTIDADE_MAXIMA_ENTRADAS(15);

    private int valor;

    Configuracoes(int valor){
        this.valor = valor;
    }
    public int getValor(){
        return this.valor;
    }
}
