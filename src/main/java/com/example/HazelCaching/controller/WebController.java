package com.example.HazelCaching.controller;

import com.example.HazelCaching.caching.Cache;
import com.example.HazelCaching.constant.enums.RequestRouting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    private final Logger logger = LoggerFactory.getLogger(WebController.class);
    @Autowired
    private final Cache cache;

    public WebController(Cache cache) {
        this.cache = cache;
    }



    /**
     *
     * @param key identifier for cache value
     */
    @GetMapping(RequestRouting.Cache.GET+"/{key}")
    public void getCache(@PathVariable String key){
        String value = cache.get(key);
        logger.info("Returning value '{}' ", value);

    }

    /**
     * Used to cache values
     * @param key identifier for cache value
     * @param value cached value
     */
    @GetMapping(RequestRouting.Cache.SAVE+"/{key}")
    public void addToCache(@PathVariable String key,@RequestParam("value") String value){
        cache.set(key,value);
        logger.info("saved key = '{}' and saved value ='{}' ", key,value);

    }
}
