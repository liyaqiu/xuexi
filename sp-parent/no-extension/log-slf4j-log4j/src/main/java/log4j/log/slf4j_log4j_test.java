package log4j.log;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.slf4j.LoggerFactory;

/**
 * @author lyq
 * @date 2022/3/6 10:23
 */
public class slf4j_log4j_test {

    @Test
    public void test0(){
        Logger logger = Logger.getLogger("com.service");
        //默认debug
        logger.fatal("严重错误:一般会造成系统崩溃并且终止运行");
        System.out.println(logger.getClass());
    }

    private static final org.slf4j.Logger log = LoggerFactory.getLogger("com.service");

    @Test
    public void test1(){
        log.error("error {}","error");
        log.info("info {}","info");
        log.debug("debug {}","debug");
        System.out.println(log.getClass());
    }
}
