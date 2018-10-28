package mg.microservice.springcloud.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    //具体的用法弄清楚

    @Pointcut("execution(public * mg.microservice.springcloud.*.*())")
    public void pointCut(){}

    @Before("pointCut()")
    public void doBefore(){
        //调用pointCut()之前执行的代码逻辑
        System.out.println("begin pointCut()");
    }

    @Around("pointCut()")
    public void doAround(){
        //如何写切点

    }

    @After("pointCut()")
    public void doAfter(){
        //调用pointCut()之后执行的代码逻辑
        System.out.println("after pointCut()");
    }
}
