package com.xiaopotian.demo;

import com.xiaopotian.demo.rabbit.manay.ManySender1;
import com.xiaopotian.demo.rabbit.manay.ManySender2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by zoulu on 2018-01-18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyTest {
    @Autowired
    ManySender1 manySender1;
    @Autowired
    ManySender2 manySender2;

    @Test
    public void manyToMany() throws Exception {
        for (int i=0;i<100;i++){
            manySender1.send(i);
            manySender2.send(i);
        }
    }
}
