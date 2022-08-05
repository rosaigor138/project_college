package integrantes.ordenacao;

import integrantes.informacao.Avaliacao;

import java.util.Comparator;

public class OrdenarAvaliacaoMenorPonto implements Comparator<Avaliacao> {
    @Override
    public int compare(Avaliacao o1, Avaliacao o2) {
        if(o1.getValor()> o2.getValor()){
            return 1;
        } else if (o1.getValor()<o2.getValor()) {
            return -1;
        }else return 0;
    }
}

