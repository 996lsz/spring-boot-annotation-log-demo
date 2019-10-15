package cn.lsz.example.annotation.demo;

import cn.lsz.example.annotation.demo.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    TestService service;

    @Test
    public void contextLoads() {
        System.out.println("方法上有注解,记录入参以及返回值");
        service.testMethod("test start");
        System.out.println("无注解,什么都不记录");
        service.testMethod2("test start2");
    }

}
