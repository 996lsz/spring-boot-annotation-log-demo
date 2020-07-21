package cn.lsz.example.annotation.demo;

import cn.lsz.example.annotation.demo.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.MessageFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DemoTests {

    protected final Logger LOGGER = LoggerFactory.getLogger(this.getClass());


    @Test
    public void contextLoads() {
        /*Map map = new HashMap();
        Object o = map;
        System.out.println(map.getClass().getGenericSuperclass());

        System.out.println(o instanceof List);*/
        LOGGER.info("test{}{}",1,2);
        Object[] objects = {1,2};
        System.out.println(MessageFormatter.arrayFormat("test{}{}", objects).getMessage());
    }

}
