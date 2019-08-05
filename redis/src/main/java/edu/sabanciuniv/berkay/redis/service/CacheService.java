package edu.sabanciuniv.berkay.redis.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CacheService {
	
	@Cacheable(cacheNames = "bCache")
    public String cacheThis(){
        System.out.println("Not returning from cache");
        return "Hello";
	}
}