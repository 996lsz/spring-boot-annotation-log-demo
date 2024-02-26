package cn.lsz.example.annotation.demo.service;

import cn.lsz.example.annotation.demo.annotation.LogAnnotation;
import cn.lsz.example.annotation.demo.util.LogHelper;
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
    @LogAnnotation(logTitle = "测试正常运行方法", argsLog = false, returnLog = false)
    public String testMethod2(String str) {
        LogHelper.info("111");
        LogHelper.warn("222{}",222);
        LogHelper.error("333{}",str);
        return "success";
    }

    @Override
    @LogAnnotation(logTitle = "测试方法报错")
    public void testMethod3(String str) {
        int a = 2/0;
        //return "testSuccess";
    }

    @Override
    @LogAnnotation(logTitle = "map数据保存")
    public Map testMethod4(Map str) {
        LogHelper.info("开始");
        Map result = new HashMap();
        result.put("test",233);
        LogHelper.info("结束{}",233);
        try {
            int i = 1 / 0;
        }catch (Exception e){
            LogHelper.warn("test error", e);
        }

        return result;
    }
}
