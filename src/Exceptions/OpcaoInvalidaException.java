package Exceptions;

public class OpcaoInvalidaException extends Exception { // Exceção em Tempo de execução
    public OpcaoInvalidaException(String message) {
        super(message);
    }
}
