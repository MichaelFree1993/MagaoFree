package mg.microservice.springcloud.exception;

import lombok.Data;

@Data
public class MyException extends RuntimeException {

    private int code;
    private String msg;

    public MyException(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
