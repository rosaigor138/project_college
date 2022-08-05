package integrantes.exceptions;

public class invalidValueException extends Exception{
    public invalidValueException(){}
    public invalidValueException(String mensagem){
        super(mensagem);
    }

    @Override
    public String toString() {
        return this.getMessage();
    }
}
