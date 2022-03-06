package log4j2.log;


import org.apache.logging.log4j.LogManager;
import org.junit.Test;


public class log4j2_basic_test {

    final static org.apache.logging.log4j.Logger logger = LogManager.getLogger();

    @Test
    public  void test02() throws InterruptedException {

        logger.error("姓名:{{}},年龄{{}}","李雅秋",1);
        logger.warn("姓名:{{}},年龄{{}}","李雅秋",1);
        logger.info("姓名:{{}},年龄{{}}","李雅秋",1);
        logger.debug("姓名:{{}},年龄{{}}","李雅秋",1);
        logger.trace("姓名:{{}},年龄{{}}","李雅秋",1);
    }
    @Test
    public  void test01() throws InterruptedException {
        for (int i = 0; i < 100000; i++) {
            Thread.sleep(1000);
            logger.error("姓名:{{}},年龄{{}}","李雅秋",i);
            logger.warn("姓名:{{}},年龄{{}}","李雅秋",i);
            logger.info("姓名:{{}},年龄{{}}","李雅秋",i);
            logger.debug("姓名:{{}},年龄{{}}","李雅秋",i);
            logger.trace("姓名:{{}},年龄{{}}","李雅秋",i);
        }
    }
}
