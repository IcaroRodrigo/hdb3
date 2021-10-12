import java.util.ArrayList;
import java.util.List;

public class Hdb3 {
    private List<Integer> entradas = new ArrayList<>();
    private List<Integer> saidas = new ArrayList<>();
    private int contadorDeUm = 0;
    private int contadorDeZero = 0;
    private int polaridade;

    public void setEntradas(List<Integer> valor){
        this.entradas = valor;
    }
    public void processarEntradas(){
        List<Integer> entradas = this.entradas;

        for (int valor: entradas){
            if(Math.abs(valor) == 1) {
                this.contadorDeUm++;
                this.polaridade = valor;
                criarListaSaida(valor);
            }
            else{
                contadorDeZero++;
            }

            if(contadorDeZero == 4) {
                this.aplicarRegraGeral();
                this.contadorDeUm = 0;
                this.contadorDeZero = 0;
            }
        }
    }
    public List<Integer> getSaidas(){
        return this.saidas;
    }
    public void aplicarRegraGeral(){
        if(this.contadorDeUm % 2 == 0)
           this.aplicarRegraPar();
        else
            this.aplicarRegraImpar();
    }
    public void aplicarRegraPar(){

        System.out.println("Par");

        if(this.polaridade > 0) {
            System.out.println("Positivo");
        }
        else {
            System.out.println("Negativo");
        }

        //todo Adicionar o resultado da regra par na lista de saida.
    }
    public void aplicarRegraImpar(){
        System.out.println("Impar");

        if(this.polaridade > 0) {
            System.out.println("Positivo");
        }
        else {
            System.out.println("Negativo");
        }
        //todo Adicionar o resultado da regra impar na lista de saida.
    }
    public void criarListaSaida(int valor){
        this.saidas.add(valor);
    }
}
