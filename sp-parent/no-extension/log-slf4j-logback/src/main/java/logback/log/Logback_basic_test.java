package logback.log;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Logback_basic_test {

    final static Logger logger = LoggerFactory.getLogger("com.service");

    public static void main(String[] args) {
        //logger.error("姓名:{{}},年龄{{}}","李雅秋",1);
        new Logback_basic_test().test02();
    }
    @Test
    public  void test02() {
        while (true){
            new Scanner(System.in).next();
            logger.error("姓名:{{}},年龄{{}}","李雅秋",1);
            logger.warn("姓名:{{}},年龄{{}}","李雅秋",1);
            logger.info("姓名:{{}},年龄{{}}","李雅秋",1);
            logger.debug("姓名:{{}},年龄{{}}","李雅秋",1);
            logger.trace("姓名:{{}},年龄{{}}","李雅秋",1);
        }

    }
    @Test
    public  void test01() {
        for (int i = 0; i < 10; i++) {
            logger.error("姓名:{{}},年龄{{}}","李雅秋",i);
            logger.warn("姓名:{{}},年龄{{}}","李雅秋",i);
            logger.info("姓名:{{}},年龄{{}}","李雅秋",i);
            logger.debug("姓名:{{}},年龄{{}}","李雅秋",i);
            logger.trace("姓名:{{}},年龄{{}}","李雅秋",i);
        }
    }
}
