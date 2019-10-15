package cn.lsz.example.annotation.demo.aop;

import cn.lsz.example.annotation.demo.annotation.LogAnnotation;
import org.apache.commons.beanutils.PropertyUtils;
import org.aspectj.bridge.ISourceLocation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.util.Reflection;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;
import java.util.Map;
import java.util.logging.Logger;

/**
 * description
 * 
 * @author LSZ 2019/10/15 15:29
 * @contact 648748030@qq.com
 */
@Aspect
@Component
public class LogAspect {

    //定义切面，当执行带有@logAnnotation注解类执行下面方法
    @Pointcut("@annotation(cn.lsz.example.annotation.demo.annotation.LogAnnotation)")
    private void logAspect() {}

    @Around("@annotation(logAnnotation)")
    public Object aroundLog(ProceedingJoinPoint joinpoint, LogAnnotation logAnnotation) throws Throwable {
        Object result = null;
        //通过反射获取目标类属性（可用可不用）
        Object methodInvocation =  PropertyUtils.getProperty(joinpoint, "signature");
        System.out.println("目标类对象："+methodInvocation);
        System.out.println(logAnnotation.startLogHint()+"传参："+joinpoint.getArgs()[0]);
        result =  joinpoint.proceed();

        System.out.println(logAnnotation.endLogHint()+"执行结果："+result);
        return result;
    }



    
}
