package cn.lsz.example.annotation.demo.annotation;

import cn.lsz.example.annotation.demo.constant.LogConstant;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 统一入参，输出，异常日志处理注解
 *
 * @author LSZ 2020/07/21 15:29
 * @contact 648748030@qq.com
 */
@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface LogAnnotation {

    /**
     * 日志标题
     */
    String logTitle();

    /**
     * 是否打印参数日志
     */
    boolean argsLog() default false;

    /**
     * 是否打印返回值日志
     */
    boolean returnLog() default false;

    /**
     *
     */
    LogConstant.LogLevel defaultLogLevel() default LogConstant.LogLevel.INFO;

    LogConstant.LogType logType() default LogConstant.LogType.TEXT;
}
