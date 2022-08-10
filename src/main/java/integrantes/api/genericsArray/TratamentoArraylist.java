package integrantes.api.genericsArray;

import java.util.ArrayList;
import java.util.List;

public class TratamentoArraylist <E> {
    private List<E> lista = new ArrayList<>();

    public void adiciona(E obj){
        lista.add(obj);
    }
    public boolean temOuNao(E obj){
        return this.lista.contains(obj);
    }
    public void retira(E obj){
        lista.remove(obj);
    }
    public boolean estaVazia(){
        return lista.isEmpty();
    }
    public void adicionaEmGrupo(List<E> objs){
        for(E e: objs){
            adiciona(e);
        }
    }
    public List<E> getArray(){
        return this.lista;
    }
    public E retornaObj(int posicao){
        return this.lista.get(posicao);
    }
    public int tamanho(){
        return this.lista.size();
    }


}
