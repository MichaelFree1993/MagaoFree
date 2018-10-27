package mg.microservice.springcloud.common;

import lombok.Data;

@Data
public class Response<T> {

    private Boolean is_success;
    private Integer code;
    private String msg;
    private T data;

    public Response(Boolean success, Integer code, String msg){
        this.is_success =success;
        this.code =code;
        this.msg =msg;
    }

    public Response(Boolean success, Integer code, String msg, T data){
        this.is_success =success;
        this.code =code;
        this.msg =msg;
        this.data =data;
    }

    public static Response createBySuccess(){
        return new Response(true, ResponseStatusEnum.SUCCESS.getCode(), ResponseStatusEnum.SUCCESS.getMsg());
    }

    public static Response createBySuccessMsg(String message){
        return new Response(true, ResponseStatusEnum.SUCCESS.getCode(), message);
    }

    public static <T> Response createBySuccess(T data){
        return new Response(true, ResponseStatusEnum.SUCCESS.getCode(), ResponseStatusEnum.SUCCESS.getMsg(), data);
    }

    public static Response createByFailMsg(String msg){
        return new Response(false, ResponseStatusEnum.FAIL.getCode(), msg);
    }

    public static Response createByFailMsg(Integer code, String msg){
        return new Response(false, code, msg);
    }
}
