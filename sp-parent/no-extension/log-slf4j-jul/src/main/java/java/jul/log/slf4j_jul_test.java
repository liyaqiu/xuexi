package java.jul.log;

import org.junit.Test;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * @author lyq
 * @date 2022/3/6 9:19
 */
public class slf4j_jul_test {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(slf4j_jul_test.class);
    @Test//利用配置文件输出
    public void test01() throws IOException {
        //默认加载，C:\Program Files\Java\jre1.8.0_221\lib\logging.properties
        // 通过JVM参数指定配置文件路径
        //-Djava.util.logging.config.file="D:\idea_workspace\sp-parent\no-extension\log-slf4j-log4j\src\main\resources\logging.properties" -Duser.country=CN -Duser.language=en

        log.error("error {}","error");
        log.info("info {}","info");
        log.debug("debug {}","debug");
        System.out.println(log.getClass());
    }


    @Test//利用配置文件输出
    public void test02() throws IOException {
        LogManager logManager = LogManager.getLogManager();
        logManager.readConfiguration(this.getClass().getClassLoader().getResourceAsStream("logging.properties"));

        Logger logger = Logger.getLogger("log.jul.LogTest");
        logger.setLevel(Level.ALL);

        logger.log(Level.SEVERE,"error");
        logger.log(Level.WARNING,"warning");
        logger.log(Level.INFO,"info");
        logger.log(Level.CONFIG,"config");
        logger.log(Level.FINER,"debug");
        System.out.println(logger.getClass());
    }

}
