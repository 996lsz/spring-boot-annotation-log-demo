package cn.lsz.example.annotation.demo.entity;

import cn.lsz.example.annotation.demo.constant.LogConstant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 保存日志组件所需数据所用类
 *
 * @author LSZ 2022/09/13 15:01
 * @contact 648748030@qq.com
 */
@Data
public class LogEntity {

    private LogEntity parent;

    /**
     * 根方法
     */
    private String method;

    /**
     * 保存方法内LogHelper日志信息
     */
    private List<Item> itemList;

    /**
     * 日志等级
     */
    private LogConstant.LogLevel logLevel;

    /**
     * 入参
     */
    private Object[] args;

    /**
     * 标题
     */
    private String title;

    /**
     * 返回值
     */
    private Object result;

    /**
     * 异常
     */
    private Throwable throwable;

    /**
     * 方法日志链
     */
    List<LogEntity> logEntityList;


    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class Item{

        private LogConstant.LogLevel level;

        private String logStr;

        private Object[] args;

        private Throwable throwable;
    }


}
