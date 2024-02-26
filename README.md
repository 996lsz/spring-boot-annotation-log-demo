# spring-boot-annotation-log-demo
通过自定义注解方式对线程内日志汇集后统一输出，以及方法入参与返回值进行日志记录demo，在没有使用别的日志跟踪组件时可以防止日志刷得过多导致追溯困难便于个人检查日志
日志临时存放内存里，所以不建议日志过多以及要求日志不能丢失的的场景

目前用于个人公众号及某些对日志要求不严格的项目方便查日志链路使用
![图片](https://github.com/996lsz/spring-boot-annotation-log-demo/assets/49548423/88cc4b76-1b76-4380-b54a-229754bf259c)


