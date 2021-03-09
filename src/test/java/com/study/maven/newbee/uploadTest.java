package com.study.maven.newbee;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author HLH
 * @email 17703595860@163.com
 * @date : Created in  2021/2/20 15:26
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class uploadTest {

    @Autowired
    ApplicationContext ac;

    @Test
    public void test(){
        System.out.println(ac);
    }

}