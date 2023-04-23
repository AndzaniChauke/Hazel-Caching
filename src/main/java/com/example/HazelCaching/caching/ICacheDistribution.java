package com.example.HazelCaching.caching;


import java.io.Serializable;

/**
 * Interface used for distribution of cache values
 *
 * @author Andzani chauke
 */
public interface ICacheDistribution {
    /**
     *
     * @param key used to identify cached value
     * @param <T>
     */
    <T> T get(String key);

    /**
     * Used to set values in cache
     *
     * @param key used to identify cached value
     * @param value value set in cache

     */
    <T extends Serializable> void  set(String key, T value);
}
