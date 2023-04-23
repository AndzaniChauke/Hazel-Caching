package com.example.HazelCaching.caching;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.Serializable;



@Component
@Service
public class Cache {


    private final HazelcastInstance hazelcastInstance;

    @Autowired
    public Cache(@Qualifier("hazelcastInstance") HazelcastInstance hazelcastInstance) {

        this.hazelcastInstance = hazelcastInstance;
    }

    public <T extends Serializable> void set(String key, T value) {
            IMap<String, Object> map = hazelcastInstance.getMap("myCache");
            map.put(key, (String) value);
    }



    public String get(String key) {
        IMap<String, Object> map = hazelcastInstance.getMap("myCache");
        return (String) map.get(key);
    }


}
