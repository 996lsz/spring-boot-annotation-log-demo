package cn.lsz.example.annotation.demo.service;

import cn.lsz.example.annotation.demo.annotation.LogAnnotation;
import cn.lsz.example.annotation.demo.annotation.LogAnnotation2;
import cn.lsz.example.annotation.demo.utils.LogHelper;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

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

    @Override
    @LogAnnotation2(finallyLog = "直播数据保存")
    public void testMethod3(String str) {
        int a = 2/1;
        //return "testSuccess";
    }

    @Override
    @LogAnnotation2(finallyLog = "map数据保存")
    public Map testMethod4(Map str) {
        LogHelper.info("开始");
        Map result = new HashMap();
        result.put("test",233);
        LogHelper.info("结束{}",233);
        return result;
    }
}
