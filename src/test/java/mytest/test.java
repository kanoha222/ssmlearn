package mytest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author yangbo
 * @create 2021/4/1
 * @since 1.0.0
 */

public class test {
    @Before
    public void a (){
        System.out.println(1);
    };
    @Test
    public void b (){
        System.out.println(2);
    };
    @After
    public void c (){
        System.out.println(3);
    };
}