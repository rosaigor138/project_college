package integrantes.ordenacao;

import integrantes.informacao.Disciplina;

import java.util.Comparator;

public class OrdenarDisciplinasOrdemAlfabetica implements Comparator<Disciplina> {

    @Override
    public int compare(Disciplina d1,Disciplina d2) {
        return d1.getDescricaoDisciplina().compareTo(d2.getDescricaoDisciplina());
    }
}
