package com.Johnny.JohnnyCode;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest
@SpringApplicationConfiguration(classes = JohnnyCodeApplication.class)
@WebAppConfiguration
public class JohnnyCodeApplicationTests {

	@Test
	@Ignore
	public void contextLoads() {
	}

}
