package edu.sabanciuniv.berkay.redis;

import org.springframework.boot.SpringApplication;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import edu.sabanciuniv.berkay.redis.service.CacheService;



@EnableCaching
@Slf4j
@SpringBootApplication
public class RedisApplication implements CommandLineRunner {
	
	@Autowired
	CacheService cacheService;

	    
	public static void main(String[] args) {
		SpringApplication.run(RedisApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String first = cacheService.cacheThis();
	    System.out.println("First: "+ first);
	    String second = cacheService.cacheThis();
	    System.out.println("Second: "+ second);
		
	}

}
