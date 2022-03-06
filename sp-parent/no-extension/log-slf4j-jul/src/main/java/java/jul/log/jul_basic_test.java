package java.jul.log;

import org.junit.Test;

import java.io.IOException;
import java.util.logging.*;

public class jul_basic_test {

    @Test//利用配置文件输出
    public void test06() throws IOException {
        //注意，需要先加载,后获取logger对象
        LogManager logManager = LogManager.getLogManager();
        logManager.readConfiguration(this.getClass().getClassLoader().getResourceAsStream("logging1.properties"));
        Logger logger = Logger.getLogger("log.jul.LogTest");

        logger.log(Level.SEVERE,"logger error");
        logger.log(Level.WARNING,"warning");
        logger.log(Level.INFO,"info");
        logger.log(Level.CONFIG,"config");
        logger.log(Level.FINER,"debug很严重");
    }
    @Test//利用配置文件输出
    public void test05() throws IOException {
        //可以通过如下进行修改
        //方式1
//        System.out.println(logger.getParent().getLevel().getName());
//        System.out.println(logger.getParent().getHandlers()[0].getLevel().getName());
//        System.out.println(logger.getParent().getClass());
//        logger.getParent().getHandlers()[0].setLevel(Level.ALL);
        //方式2
        LogManager logManager = LogManager.getLogManager();
        logManager.readConfiguration(this.getClass().getClassLoader().getResourceAsStream("logging.properties"));

        Logger logger = Logger.getLogger("log.jul.LogTest");
        logger.setLevel(Level.ALL);

        logger.log(Level.SEVERE,"error");
        logger.log(Level.WARNING,"warning");
        logger.log(Level.INFO,"info");
        logger.log(Level.CONFIG,"config");
        logger.log(Level.FINER,"debug");
    }

    @Test//继承关系
    public void test04() throws IOException {
        Logger logger = Logger.getLogger("log");
        Logger logger1 = Logger.getLogger("log.jul");
        Logger logger2 = Logger.getLogger("log.jul.LogTest");
        System.out.println(logger2.getParent().getName());
        System.out.println(logger1.getParent().getName());
        System.out.println(logger.getParent());
    }

    @Test//自定义日志输出格式
    public void test03() throws IOException {
        Logger logger = Logger.getLogger("log.jul.LogTest");
        //关闭默认输出形式
        //logger.setUseParentHandlers(false);

        //控制日志的格式
        SimpleFormatter simpleFormatter = new SimpleFormatter();

        //控制输出的形式
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.SEVERE);
        consoleHandler.setFormatter(simpleFormatter);
        logger.addHandler(consoleHandler);

        //控制输出的形式
//        FileHandler fileHandler = new FileHandler("abclog.txt");
//        fileHandler.setLevel(Level.WARNING);
//        fileHandler.setFormatter(simpleFormatter);
//        logger.addHandler(fileHandler);

        logger.setLevel(Level.ALL);
        logger.log(Level.SEVERE,"error");
        logger.log(Level.WARNING,"warning");
        logger.log(Level.INFO,"info");
        logger.log(Level.CONFIG,"config");
        logger.log(Level.FINER,"debug");

    }



    @Test//测试level 默认是info级别
    public void test02(){
        Logger logger = Logger.getLogger("log.jul.LogTest");
        logger.setLevel(Level.ALL);
//        System.out.println(logger.getParent().getLevel().getName());
//        System.out.println(logger.getParent().getHandlers()[0].getLevel().getName());
//        System.out.println(logger.getParent().getClass());
//        logger.getParent().getHandlers()[0].setLevel(Level.ALL);
        logger.log(Level.SEVERE,"error");
        logger.log(Level.WARNING,"warning");
        logger.log(Level.INFO,"info");
        logger.log(Level.CONFIG,"config");
        logger.log(Level.FINER,"debug");
    }

    @Test//入门案例
    public void test01() throws IOException {
        Logger logger = Logger.getLogger("log.jul.LogTest");
        logger.info("你好info");
        logger.log(Level.INFO,"姓名:{0},年龄:{1}",new Object[]{"李雅秋",12});
    }
}
