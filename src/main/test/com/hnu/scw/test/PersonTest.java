package com.hnu.scw.test;

import com.hnu.scw.mapper.PersonMapper;
import com.hnu.scw.pojo.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ Author     ：scw
 * @ Date       ：Created in 下午 7:55 2018/6/15 0015
 * @ Description：进行测试
 * @ Modified By：
 * @Version: $version$
 */
@RunWith(SpringJUnit4ClassRunner.class)
//下面是只引入一个配置文件的方法
//@ContextConfiguration({"classpath:springconfig/applicationContext-dao.xml"})
//下面是引入多个配置文件的方法
@ContextConfiguration(locations = { "classpath:springconfig/applicationContext-dao.xml",
        "classpath:springconfig/applicationContext-transaction.xml" })
public class PersonTest {
    @Autowired
    public PersonMapper personMapper;

    @Test
    public void testSelectUser() throws Exception {
        Person person = new Person();
        person.setName("my43");
        personMapper.addPerson(person);
    }
}
