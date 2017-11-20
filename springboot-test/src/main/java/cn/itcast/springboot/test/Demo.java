package cn.itcast.springboot.test;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"cn.itcast.springboot"})
public class Demo {
	public static void main(String[] args) {
		
		/** 运行SpringBoot应用 */
//		SpringApplication.run(Demo.class, args);
		SpringApplication application = new SpringApplication(Demo.class);
		
		application.setBannerMode(Banner.Mode.OFF);
		
		application.run(args);
		
	}
}
