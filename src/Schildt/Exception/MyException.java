package Schildt.Exception;

/**
 * Created by Vlad on 21.09.2016.
 */
public class MyException extends Exception {
    private String errorCode="Unknown_Exception";

    public MyException(String message, String errorCode){
        super(message);
        this.errorCode=errorCode;
    }

    public String getErrorCode(){
        return this.errorCode;
    }


}
