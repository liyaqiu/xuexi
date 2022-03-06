package log4j.log;


import org.apache.log4j.Logger;
import org.apache.log4j.helpers.LogLog;
import org.junit.Test;

public class Log4j_basic_test {


    @Test //测试毫秒数
    public void test02() throws InterruptedException {
        LogLog.setInternalDebugging(true);
        Logger logger = Logger.getLogger(Log4j_basic_test.class);
        logger.debug("我们都是好孩子",new RuntimeException("异常。"));
    }


    @Test //入门案例
    public void test01(){
        //开启log4j的日志
        //LogLog.setInternalDebugging(true);
        //系统默认配置
        //BasicConfigurator.configure();
        Logger logger = Logger.getLogger("com.service");
        //默认debug
        logger.fatal("严重错误:一般会造成系统崩溃并且终止运行");
        //开发常用一下4个
        logger.error("错误信息:不会影响系统运行");
        logger.warn("警告信息:可能会发生问题");
        logger.info("运行信息:数据连接，网络连接，IO 操作等。。");
        logger.debug("调试信息:一般在开发中记录程序变量参数传递信息");
        logger.trace("追踪信息:记录程序所有的流程信息");
    }
}

