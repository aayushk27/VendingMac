package Machine;

public class IllegalArgumentException extends RuntimeException {
    private String message;
   
    public IllegalArgumentException(String string) {
        this.message = string;
    }
   
    @Override
    public String getMessage(){
        return message;
    }
}
