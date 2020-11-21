package cn.lsz.example.annotation.demo.annotation;

import java.lang.annotation.*;

/**
 * 统一入参，输出，异常日志处理注解
 *
 * @author LSZ 2020/07/21 15:29
 * @contact 648748030@qq.com
 */
@Inherited
@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface LogAnnotation {

    //日志标题
    String logTitle();

    //日志是否输出入参
    boolean argsLog() default true;

    //日志是否输出返回值
    boolean resultLog() default true;

}
