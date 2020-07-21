package cn.lsz.example.annotation.demo;

import cn.lsz.example.annotation.demo.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    TestService service;

    @Test
    public void contextLoads() {
    /*    System.out.println("方法上有注解,记录入参以及返回值");
        service.testMethod("test start");
        System.out.println("无注解,什么都不记录");
        service.testMethod2("test start2");*/

        //service.testMethod3("test start3");
        Map param = new HashMap();
        param.put("paramTest",111);
        service.testMethod4(param);
    }

}
