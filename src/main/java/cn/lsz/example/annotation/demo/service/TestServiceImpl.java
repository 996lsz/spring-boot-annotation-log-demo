package cn.lsz.example.annotation.demo.service;

import cn.lsz.example.annotation.demo.annotation.LogAnnotation;
import org.springframework.stereotype.Component;

/**
 * description
 * 
 * @author LSZ 2019/10/15 15:58
 * @contact 648748030@qq.com
 */
@Component
public class TestServiceImpl implements TestService{

    @Override
    @LogAnnotation(startLogHint = "TestServiceImpl.testMethod执行开始",endLogHint = "TestServiceImpl.testMethod执行结束")
    public String testMethod(String str) {
        return "testSuccess";
    }

    @Override
    public String testMethod2(String str) {
        return "testSuccess2";
    }
}
