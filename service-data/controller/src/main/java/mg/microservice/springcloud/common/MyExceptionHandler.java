package mg.microservice.springcloud.common;

import com.alibaba.fastjson.JSON;
import mg.microservice.springcloud.exception.MyException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

public class MyExceptionHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyExceptionHandler.class);

    @Autowired
    private Environment environment;

    @ExceptionHandler(Exception.class)
    public Response handlerException(HttpServletRequest request, Exception ex) {
        int respCode = -1;
        String respMsg = StringUtils.isEmpty(ex.getMessage()) ? "系统发生未知错误，请重试.":ex.getMessage();
        try {
            LOGGER.error("request failed, url:{}|params:{}, exception:", JSON.toJSONString(request.getRequestURL()),
                    JSON.toJSONString(request.getParameterMap()), ex);

            if(ex instanceof MyException){
                //自定义异常
                MyException myException = (MyException)ex;
                respCode = myException.getCode();
                respMsg = myException.getMsg();
            }
            return Response.createByFailMsg(respCode, respMsg);
        } catch (Exception e) {
            LOGGER.error("未知错误:"+ e.getMessage(), e);
            e.printStackTrace();
        }
        return null;
    }
}
