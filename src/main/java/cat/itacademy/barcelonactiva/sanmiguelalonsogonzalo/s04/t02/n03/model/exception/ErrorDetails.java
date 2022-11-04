package cat.itacademy.barcelonactiva.sanmiguelalonsogonzalo.s04.t02.n03.model.exception;


public class ErrorDetails extends Message {

    private Integer status;

    public ErrorDetails(Integer status, String message) {

        super(message);
        this.status = status;
    }

    public Integer getStatus() {

        return status;
    }

    public String getMessage() {

        return super.getMessage();
    }

}
