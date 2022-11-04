package cat.itacademy.barcelonactiva.sanmiguelalonsogonzalo.s04.t02.n03.model.exception;

public abstract class Message {

    private String message;
    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
