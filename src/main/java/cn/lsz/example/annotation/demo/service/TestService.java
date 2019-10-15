package cn.lsz.example.annotation.demo.service;

import cn.lsz.example.annotation.demo.annotation.LogAnnotation;
import org.springframework.stereotype.Component;

/**
 * description
 * 
 * @author LSZ 2019/10/15 15:55
 * @contact 648748030@qq.com
 */
public interface TestService {

    String testMethod(String str);

    String testMethod2(String str);
}
