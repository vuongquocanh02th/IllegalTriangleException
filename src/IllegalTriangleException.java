public class IllegalTriangleException extends Exception{
    public IllegalTriangleException(){
        super("Error: Invalid side!");
    }
    public IllegalTriangleException(String message){
        super(message);
    }
}
