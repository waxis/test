package waxis.test;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import waxis.lib.date.DateUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext.xml")
public class TestDate {

	@Test
	public void test() {
		System.out.println("aaa");
		System.out.println(DateUtils.format(new Date()));
	}


}
