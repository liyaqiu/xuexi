package log4j2.log;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class slf4j_log4j2_test {

    final static Logger logger = LoggerFactory.getLogger("com.service");
    @Test
    public  void test01() {
        logger.debug("debug 姓名:{{}},年龄{{}}","李雅秋",12);
        logger.info("info 姓名:{{}},年龄{{}}","李雅秋",12);
        System.out.println(logger.getClass());
    }
    @Test
    public void test2(){
        org.apache.logging.log4j.Logger logger = LogManager.getLogger("com.service");
        //logger.isEnabled(Level.ERROR);
        logger.debug("debug 姓名:{{}},年龄{{}}","李雅秋",12);
        logger.info("info 姓名:{{}},年龄{{}}","李雅秋",12);
        System.out.println(logger.getClass());
    }
}
