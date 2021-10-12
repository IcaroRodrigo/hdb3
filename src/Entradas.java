import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Entradas {
    private int numeroEntrada;
    private List<Integer> numeros = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void capturarEntrada(){
        System.out.println("Digite o número de entrada");
        this.numeroEntrada = scanner.nextInt();
        criaListaEntradas();
    }
    public void criaListaEntradas(){
        this.numeros.add(this.numeroEntrada);
    }
    public void imprimirResultados() {
        String valores = "";
        for (Integer numero : this.getNumeros()) {
            valores += " " + numero + " ";
        }
        System.out.println(valores);
    }
    public List<Integer>getNumeros(){
        return this.numeros;
    }


}
