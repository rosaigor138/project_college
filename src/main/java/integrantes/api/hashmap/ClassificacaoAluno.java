package integrantes.api.hashmap;
import integrantes.informacao.Aluno;
import integrantes.api.exception.invalidValueException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ClassificacaoAluno {
    private static Map<Aluno,String> classificacao =  new HashMap<>();
    private static String a= "A";
    private static String b= "B";
    private static String c= "C";

    public static boolean estaVazia(){
        return classificacao.isEmpty();
    }
    public static void atribuiAluno(Aluno aluno)throws invalidValueException{
        if (aluno.calculaIRA() == -1){
        } else if (aluno.calculaIRA()>89){
            classificacao.put(aluno,a);
        } else if (aluno.calculaIRA()>69 && aluno.calculaIRA()<90) {
            classificacao.put(aluno,b);
        } else {
            classificacao.put(aluno,c);
        }
    }
    public static String getClassificacaoAluno(Aluno aluno){

        return classificacao.get(aluno);
    }
    public static Set<Aluno> getLista(){
        Set<Aluno> lista = classificacao.keySet();
        return lista;
    }
}
