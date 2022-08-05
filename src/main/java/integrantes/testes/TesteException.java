package integrantes.testes;
import integrantes.ordenacao.*;
import integrantes.exceptions.invalidValueException;
import integrantes.informacao.Avaliacao;

public class TesteException {
    public static void main(String[] args) {
        Avaliacao avt1 = new Avaliacao("Teste sem erro",10);
        Avaliacao avt2 = new Avaliacao("Valor superior a 100",200);
        Avaliacao avt3 = new Avaliacao("Valor inferior a 0",-200);
        System.out.println(avt1);
        System.out.println(avt2);
        System.out.println(avt3);

    }
}
