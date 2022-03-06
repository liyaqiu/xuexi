package test;

import com.Launcher;
import com.config.MPPageConfig;
import com.entity.User;
import com.service.UserService;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author lyq
 * @date 2022/3/6 7:27
 */
@SpringBootTest(classes = Launcher.class)
@Slf4j
public class LogTest {

    @Test
    public void test0(){
        log.info("{}",log.getClass());
    }
}
