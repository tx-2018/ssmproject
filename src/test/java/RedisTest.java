

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tx.entity.User;
import com.tx.service.UserService;

import redis.clients.jedis.Jedis;

//让测试运行于Spring环境  
@RunWith(SpringJUnit4ClassRunner.class)  
//引入Spring配置  
@ContextConfiguration({"classpath*:applicationContext-*.xml"})  
public class RedisTest {

	@Resource
	UserService userService;

	@Test
	public void testSave() throws InterruptedException {
		try {
			User user = userService.getUserById(null);
			System.out.println("first===========" + user.getUserName());
			User user2 = userService.getUserById(null);
			System.out.println("second===========" + user2.getUserName());
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}
	
	
	public static void main(String[] args) {
		Jedis jedis = new Jedis("192.168.202.130");
		jedis.hset("test", "test1", "1");
		System.out.println(jedis.hget("test", "test1"));
	}
}
