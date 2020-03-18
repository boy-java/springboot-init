package test;

import com.bear.start.Application;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(value = SpringRunner.class)//junit
@SpringBootTest(classes = {Application.class})//启动整个springboot工程
public class TestDemo {

    @Test
    public void test(){
        System.out.println("ok");
        TestCase.assertEquals(1,1);//断言
    }

    @Test
    public void test2(){
        System.out.println("good");
        TestCase.assertEquals(1,1);//断言
    }

    @Before
    public void before(){
        System.out.println("before");
    }

    @After
    public void afer(){
        System.out.println("after");
    }
}
