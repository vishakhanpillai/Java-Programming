
class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        super(msg);
    }
}



public class exception {
    public static void main(String[] args) throws InvalidAgeException {
        
        int age = 10;

        if(age < 18){
            throw new InvalidAgeException("Age should be greater than 18");
        }
    }
}
