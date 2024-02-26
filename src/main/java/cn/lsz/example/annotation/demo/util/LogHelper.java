package cn.lsz.example.annotation.demo.util;

import cn.lsz.example.annotation.demo.aop.LogAspect;
import cn.lsz.example.annotation.demo.constant.LogConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 必须配合LogAnnotation使用
 *
 * @author LSZ 2020/07/21 15:58
 * @contact 648748030@qq.com
 */
public class LogHelper {

	protected final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	public static void debug(String var1){
		log(LogConstant.LogLevel.DEBUG, var1, null, null);
	}

	public static void debug(String var1, Object... var2){
		log(LogConstant.LogLevel.DEBUG, var1, var2, null);
	}

	public static void debug(String var1, Throwable var2){
		log(LogConstant.LogLevel.DEBUG, var1, null, var2);
	}

	public static void info(String var1){
		log(LogConstant.LogLevel.INFO, var1, null, null);
	}

	public static void info(String var1, Object... var2){
		log(LogConstant.LogLevel.INFO, var1, var2, null);
	}

	public static void info(String var1, Throwable var2){
		log(LogConstant.LogLevel.INFO, var1, null, var2);
	}

	public static void warn(String var1){
		log(LogConstant.LogLevel.WARN, var1, null, null);
	}

	public static void warn(String var1, Object... var2){
		log(LogConstant.LogLevel.WARN, var1, var2, null);
	}

	public static void warn(String var1, Throwable var2){
		log(LogConstant.LogLevel.WARN, var1, null, var2);
	}

	public static void error(String var1){
		log(LogConstant.LogLevel.ERROR, var1, null, null);
	}

	public static void error(String var1, Object... var2){
		log(LogConstant.LogLevel.ERROR, var1, var2, null);
	}

	public static void error(String var1, Throwable var2){
		log(LogConstant.LogLevel.ERROR, var1, null, var2);
	}

	private static void log(LogConstant.LogLevel logLevel, String logStr, Object[] args, Throwable throwable){
		LogAspect.log(logLevel, logStr, args, throwable);
	}


}
