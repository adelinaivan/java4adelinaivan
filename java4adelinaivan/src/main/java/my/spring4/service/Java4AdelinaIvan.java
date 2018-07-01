package my.spring4.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication
@EnableCaching
@EnableAsync
public class Java4AdelinaIvan {
public static void main(String[] args) {
	
	SpringApplication.run(Java4AdelinaIvan.class, args);
}
}
