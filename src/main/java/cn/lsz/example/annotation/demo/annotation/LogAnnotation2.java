package cn.lsz.example.annotation.demo.annotation;

import java.lang.annotation.*;

/**
 * description
 *
 * @author LSZ 2019/10/15 15:24
 * @contact 648748030@qq.com
 */
@Inherited
@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface LogAnnotation2 {

    String finallyLog();

}
