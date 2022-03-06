package logback.log;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class slf4j_logback_test {

    final static Logger logger = LoggerFactory.getLogger("com.service");
    @Test
    public  void test01() {
        logger.debug("debug 姓名:{{}},年龄{{}}","李雅秋",12);
        logger.info("info 姓名:{{}},年龄{{}}","李雅秋",12);
        System.out.println(logger.getClass());
    }
}
