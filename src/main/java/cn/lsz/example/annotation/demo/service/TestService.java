package cn.lsz.example.annotation.demo.service;

import cn.lsz.example.annotation.demo.annotation.LogAnnotation;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * description
 * 
 * @author LSZ 2019/10/15 15:55
 * @contact 648748030@qq.com
 */
public interface TestService {

    String testMethod(String str);

    String testMethod2(String str);

    void testMethod3(String str);

    Map testMethod4(Map str);
}
